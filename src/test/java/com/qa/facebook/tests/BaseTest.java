package com.qa.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.facebook.pages.Page;

public class BaseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	Page page;
	
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		wait=new WebDriverWait(driver, 30);
		driver.manage().window().fullscreen();
		
		page=new Page(driver, wait);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}

}
