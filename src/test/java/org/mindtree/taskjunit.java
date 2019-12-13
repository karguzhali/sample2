package org.mindtree;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskjunit {
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ha\\eclipse-workspace\\Excel\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	@AfterClass
	public static void quitBrowser() {
		driver.quit();	
	}
	@Test
	public void tc1() {
		driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.id("email"));
		User.sendKeys("234567890");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("1234567890");
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();	
	}
	@Test
	public void tc2() {
		driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.id("email"));
		User.sendKeys("9159250047");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("nandhui123");
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();	
	}
	@Test
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.id("email"));
		User.sendKeys("9159250047");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("nafkarki");
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();	
	}
	@Test
	public void tc4() {
		driver.get("https://www.facebook.com/");
		WebElement User=driver.findElement(By.id("email"));
		User.sendKeys("9159250047");
		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("nandhukarki");
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();	
	}
	
	
	@After
	public void endTime()
	{
		Date d=new Date();
		System.out.println(d);
		
	}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
		
		
		
	}
	
	
	
	
}
