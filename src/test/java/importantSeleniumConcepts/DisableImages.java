package importantSeleniumConcepts;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImages {

	String isImageRequired = System.getProperty("isImageRequired");
	String url=System.getProperty("url");
	WebDriver driver;

	@Test
	public void ImageDisable() {

		if (isImageRequired.equalsIgnoreCase("n")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");

			ChromeOptions options = new ChromeOptions();

			HashMap<String, Object> images = new HashMap<String, Object>();
			images.put("images", 2);

			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values", images);

			options.setExperimentalOption("prefs", prefs);

			driver = new ChromeDriver(options);
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
		} else {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);

		}

		System.out.println("Done");

		driver.quit();

	}

}
