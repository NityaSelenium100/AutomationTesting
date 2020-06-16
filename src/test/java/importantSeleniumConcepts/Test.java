package importantSeleniumConcepts;

public class Test {
	
	@org.testng.annotations.Test
	public void JenkinsTest() {
		
		System.out.println(System.getProperty("userName"));
		System.out.println(System.getProperty("password"));
		System.out.println(System.getProperty("url"));
	}
	

}
