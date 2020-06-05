package importantSeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowManyAnchorTags {
	
	public WebDriver driver;
	
	@Test
	public void Test() {
		// code for get all anchor links from a site.
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://amazon.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement element: links) {
			
			System.out.println(element.getText());
		}
		
		
	}

}
