package testngdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart {
	WebDriver driver;

	@Test(description="Testcase to open an application")
	public void startapp()
	{
	
        System.out.println("Start application");
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
        
        driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();
        
  
	}
	
	@Test(dependsOnMethods = "startapp")
	public void loginapp()
	{
		System.out.println("Successfully logged in");
		 driver.findElement(By.id("Email")).sendKeys("rekhab1@gmail.com");
         driver.findElement(By.name("Password")).sendKeys("rekha1");
         driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(dependsOnMethods = "loginapp")
	public void search() throws InterruptedException
	{
		System.out.println("Search");
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.linkText("Computing and Internet")).click();
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		driver.findElement(By.linkText("Shopping cart")).click();
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Continue' and@onclick='Shipping.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='ShippingMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='paymentmethod_0']")).click();
		driver.findElement(By.xpath("//*[@onclick='PaymentMethod.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='PaymentInfo.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@onclick='ConfirmOrder.save()']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}
	
	@Test(dependsOnMethods ="search")
	public void closebrowser()
	{
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("close browser");
		driver.close();
	}
	

	

}
