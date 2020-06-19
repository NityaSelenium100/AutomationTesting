package importantSeleniumConcepts;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void JenkinsTest() {
		
		System.out.println(System.getProperty("username"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("url"));
	}
	

}
