package pageclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

		// TODO Auto-generated constructor stub
		public static WebDriver wd;
		 
		 public static WebDriver getDriver()
		 {
			 if(wd==null)
			 {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\workspace1\\Pageobjectmodeltest\\lib\\geckodriver.exe" );
			 wd = new FirefoxDriver(); 
			 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 wd.get("http://www.adactin.com/hotelapp");
			
			 }
			 return wd;
		 }
		
	

}
