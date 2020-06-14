package importantSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowManyAnchorTags {
	
	public WebDriver driver;
	
	@Test()
	public void AnchorTagsCount() {
		// code for get all anchor links from a site.
		
		
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("http://amazon.com");
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		
		for(WebElement element: links) {
			
			System.out.println(element.getText());
		}
		
		
		
		
		
		driver.quit();
		
	}

}
