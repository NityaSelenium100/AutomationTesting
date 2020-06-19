package importantSeleniumConcepts;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void JenkinsTest() {
		
		
		System.out.println("password is " + System.getProperty("password"));
		System.out.println("url is " + System.getProperty("url"));
		System.out.println("proddata is " + System.getProperty("proddata"));
		System.out.println("predata is " + System.getProperty("predata"));
	}
	

}
