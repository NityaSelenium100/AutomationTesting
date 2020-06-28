package com.qa.facebook.tests;

import org.testng.annotations.Test;

import com.qa.facebook.pages.LoginPage;

public class FaceBookTest extends BaseTest {
	
	
	@Test
	public void LoginTest() {
		
		driver.get("http://facebook.com");
		
		page.getInstance(LoginPage.class).enterUsername("7303709376");
		
		page.getInstance(LoginPage.class).enterPassword("nilamani100");
		
		page.getInstance(LoginPage.class).clickLogin();
	}

}
