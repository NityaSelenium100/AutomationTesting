package importantSeleniumConcepts;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void JenkinsTest() {
		
		
		System.out.println("password is " + System.getProperty("password"));
		System.out.println("url is " + System.getProperty("url"));
		System.out.println("username is " + System.getProperty("username"));
	}
	

}
