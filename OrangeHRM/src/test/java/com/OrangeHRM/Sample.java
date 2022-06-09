package com.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
  @Test
  public void launchbrowser() throws InterruptedException  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  
	  driver.findElement(By.name("txtUsername")).click();
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	  Thread.sleep(2000);
	  driver.findElement(By.name("txtPassword")).click();
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  Thread.sleep(2000);
	  
	  
	 // driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode")).click();
	  
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(5000);
	  	clickradiobtn();
  }
  public void clickradiobtn()
  {
	  try
	  {
		  boolean var = driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).isEnabled();
		  if(var)
		  {
			  driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		  }
	  }
	  catch(Exception e)
	  {
		  System.out.println("value is not available");
	  }
  }
}
