package com.qa.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		
	}
	
	By username=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By login=By.xpath("//input[@value='Log In']");
	
	public void enterUsername(String text) {
		
		doSendKeys(username, text);
	}
	
	public void enterPassword(String text) {
		
		doSendKeys(password, text);
	}
	
	public void clickLogin() {
		doClick(login);
	}
	
	

}
