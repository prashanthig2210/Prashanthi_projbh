package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelpage {


		// TODO Auto-generated constructor stub
		
	@FindBy(id="location")
	WebElement location;
	
	@FindBy(id="room_nos")
	WebElement roomno;
	
	public SearchHotelpage()
	{
		PageFactory.initElements(Base.getDriver(), this);	
		}
	
	public String getLocation()
	{
		return new Select(location).getFirstSelectedOption().getText();
	}
	
	public String getroomno()
	{
		return new Select(roomno).getFirstSelectedOption().getText();
	}
	
	public void setLocation(String locationvalue)
	{
		new Select(location).selectByVisibleText(locationvalue);
	}
	
	public void setroomno(String roomnos)
	{
		new Select(roomno).selectByVisibleText(roomnos);
		
	}

}
