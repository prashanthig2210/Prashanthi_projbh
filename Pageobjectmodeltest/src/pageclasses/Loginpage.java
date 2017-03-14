package pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	Base Base = new Base();
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnlogin;
	
	public Loginpage()
	{
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	
	public String gettxtUsername()
	{
		return txtusername.getAttribute("value");
	}
	
	public String gettxtpassword()
	{
		return txtpassword.getAttribute("value");
	}
	
	public WebElement getbtnlogin()
	{
		return btnlogin;
	}
	
	
	public void settxtusername(String username)
	{
		txtusername.clear();
		txtusername.sendKeys(username);		
	}
	
	public void settxtpassword(String password)
	{
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
}
