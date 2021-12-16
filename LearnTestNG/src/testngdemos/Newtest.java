package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Newtest {
	WebDriver driver;
	
	@BeforeMethod
	
	public void setbrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	        
	        driver=new ChromeDriver();
	        driver.get("https://www.google.com/");
	        driver.manage().window().maximize();
	}
	
	@Test
	public void checkurl()
	{
		String actualurl =driver.getTitle();
		System.out.println(actualurl);
		Assert.assertEquals(actualurl, "Google");
		System.out.println("This is testCase1");
	}
	@Test(priority = 1)
	public void checklogo()
	{
		boolean view=driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		Assert.assertTrue(view);
		System.out.println("This is testCase0");
		
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("This is testCase2");
		driver.close();
	}

	

}
