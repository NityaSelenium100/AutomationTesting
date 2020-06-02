package importantSeleniumConcepts;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImages {
	
	WebDriver driver;
	@Test
	public void ImageDisable() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		
		HashMap<String, Object> images=new HashMap<String, Object>();
		images.put("images", 2);
		
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);
		
		driver=new ChromeDriver(options);
		driver.get("http://amazon.com");
		
		System.out.println("Not Done");
		
	}

}
