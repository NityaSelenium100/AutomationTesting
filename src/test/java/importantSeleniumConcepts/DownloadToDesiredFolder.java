package importantSeleniumConcepts;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadToDesiredFolder {
	
	WebDriver driver;
	File folder;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup() throws Exception {
		
		folder=new File(UUID.randomUUID().toString());
		folder.mkdirs();
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(cap);
		driver.get("http://the-internet.herokuapp.com/download");
		
		
		

	}
	
	@Test
	public void DownloadFile() throws Exception {
		
		driver.findElement(By.linkText("some-file.txt")).click();
		
		Thread.sleep(4000);
		
		
		
		File[] listFiles = folder.listFiles();
		System.out.println(listFiles.length);
		Assert.assertTrue(listFiles.length > 0);

		for (File eachfile : listFiles) {

			System.out.println(eachfile);
			Assert.assertTrue(eachfile.length() > 0);
		}
		
		

		
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}

}
