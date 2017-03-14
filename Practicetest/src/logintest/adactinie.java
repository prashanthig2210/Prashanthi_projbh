package logintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class adactinie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\workspace1\\Practicetest\\lib\\IEDriverServer64.exe");
		WebDriver wd = new InternetExplorerDriver();
		wd.get("http://www.adactin.com/HotelApp/");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.findElement(By.id("username")).sendKeys("prashanthig22");
		wd.findElement(By.id("password")).sendKeys("Y7N5RM");  
		wd.findElement(By.id("login")).click();
	}

}
