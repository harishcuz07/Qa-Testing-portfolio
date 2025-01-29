package TestNGConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SeleniumConcept.PageObjectModelConcept;

public class CrossBrowsingTestingConcept {

	@Test
	@Parameters("browser")
	public void crossBrowsing(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		      System.setProperty("webdriver.chrome.driver", "C:\\Users\\selva\\git\\repository3\\Automation\\driver\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();   // browser launch 
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
		      System.setProperty("webdriver.gecko.driver", "C:\\Users\\selva\\git\\repository3\\Automation\\driver\\geckodriver.exe");
		       WebDriver driver = new FirefoxDriver();   // browser launch 
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
		}
		
	}
	
	
}
