package testCases;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageclasses.Base;
import pageclasses.Loginpage;
import pageclasses.SearchHotelpage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginPageText {
	
	Loginpage loginpage = new Loginpage();
	

	@Test
	public void aatestTxtUsername()
	{
		loginpage.settxtusername("prashanthig22");
		Assert.assertEquals("prashanthig22", loginpage.gettxtUsername());
	}
	

	@Test
	public void bbtestTxtPassword()
	{
		loginpage.settxtpassword("Y7N5RM");
		Assert.assertEquals("Y7N5RM", loginpage.gettxtpassword());
		
	}
	
	@Test
	public void cctestbtnlogin()
	{
		
		loginpage.clicklogin();
		new WebDriverWait(Base.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Logout")));
		Assert.assertEquals("AdactIn.com - Search Hotel", Base.getDriver().getTitle());
	}

	SearchHotelpage SearchHotelpage = new SearchHotelpage();


	
   @Test
	public void ddtestlocation()
	{
		SearchHotelpage.setLocation("London");
	    Assert.assertEquals("London", SearchHotelpage.getLocation());
	    System.out.println(SearchHotelpage.getLocation());
	}

   @Test
   public void eetestroom() throws InterruptedException
   {
	   SearchHotelpage.setroomno("2 - Two");
	   Thread.sleep(5000);
			   Assert.assertEquals("2 - Two", SearchHotelpage.getroomno());
	   System.out.println(SearchHotelpage.getroomno());
   }
}
