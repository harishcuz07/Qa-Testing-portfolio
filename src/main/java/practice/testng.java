package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testng {
	
	
	@Test
	public void hk() {
		System.setProperty("webdriver.chrome.driver", "D:\\Hari\\latest (1)\\AutomationConcept\\drivers\\chromedriver.exe");
		
       WebDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.in/");
		driver.quit();
     
		
	}
	
   @Test
	public void kk() {
		System.setProperty("webdriver.chrome.driver", "D:\\Hari\\latest (1)\\AutomationConcept\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.youtube.com/");
	//	driver.quit();
	}
	
	
}
