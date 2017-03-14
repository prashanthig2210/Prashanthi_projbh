package keyworddriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Keyword extends Adactin{

	
	
	
	public static  By getbyobject(String locator,String locatorvalue)
	{
		By byobj = null;
		switch(locator)
		{
			case "id":
				byobj = By.id(locatorvalue);
				break;
			case "xpath":
				byobj = By.xpath(locatorvalue);
				break;
		}
		return byobj;
		
	}


	public static void performAction(String locator,String locatorvalue,String keyword,String parameter)
	{
		switch(keyword)
		{
		case "typetext":
			typetext(getbyobject(locator, locatorvalue), parameter);
			break;
		case "click":
			click(getbyobject(locator, locatorvalue));
			break;
		case "dropdownselect":
			dropdownselect(getbyobject(locator, locatorvalue), parameter);
			
		}
	}
	public  static void typetext(By byobj,String parameter)
	{
		WebElement element = wd.findElement(byobj);
		element.sendKeys(parameter);
	}
	
	public static void click(By byobj)
	{
		WebElement element = wd.findElement(byobj);
		element.click();
		
	}
	
	public static void dropdownselect(By byobj,String parameter)
	{
		WebElement element = wd.findElement(byobj);
        Select s = new Select(element);
        s.selectByVisibleText(parameter);
	}
	
	

}
