package keyworddriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

    public static WebDriver wd;
   public static  XSSFWorkbook workbook1;
  public static  XSSFSheet sheet ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		initdriver();
	//	login();
	
		//logout();
	}
	  public static void initdriver() throws IOException
	  {
		  
		String excelfilepath = "C:\\Users\\admin\\Downloads\\test.xlsx";
		 workbook1 = new XSSFWorkbook(excelfilepath);
		sheet = workbook1.getSheet("Config");
		
		switch(sheet.getRow(1).getCell(0).getStringCellValue())
		{	
		case "Firefox" :
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\workspace1\\Practicetest\\lib\\geckodriver.exe");
			 wd = new FirefoxDriver();
			 wd.get(sheet.getRow(1).getCell(1).getStringCellValue());
				wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				wd.manage().window().maximize();
			 break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\workspace1\\keyworddrivenframewk\\lib\\chromedriver.exe");
			 wd = new ChromeDriver();
			 wd.get(sheet.getRow(1).getCell(1).getStringCellValue());
				wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				wd.manage().window().maximize();
		}
	  }
	  public static void login() throws IOException
	  {
		  
		wd.get(sheet.getRow(1).getCell(1).getStringCellValue());
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		 workbook1 = new XSSFWorkbook("C:\\Users\\admin\\Downloads\\test.xlsx");
	     XSSFSheet sheet = workbook1.getSheet("Data");
	     for(int i=1;i<=sheet.getLastRowNum();i++)
	     {
	    	 for(int j=0;j<=sheet.getRow(0).getLastCellNum();j++)
	    	 {
	    		 wd.findElement(By.id("username")).sendKeys(sheet.getRow(i).getCell(j).getStringCellValue());
	    		 wd.findElement(By.id("password")).sendKeys(sheet.getRow(i).getCell(j+1).getStringCellValue());
	    		 wd.findElement(By.id("login")).click();
	    			booking();
	    	 }	   
	    	 }
	  }
	  
	  public static void booking()
	  {
		  wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  sheet =workbook1.getSheet("booking");
		  //Select s = new Select(wd.findElement(By.id("location")));
		new Select(wd.findElement(By.id("location"))).selectByVisibleText(sheet.getRow(0).getCell(0).getStringCellValue());
		  logout();
	  }
	  public static void logout()
	  {
		  wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  wd.findElement(By.linkText("Logout")).click();
		  wd.close();
	  }
	}

	

