package practice;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



   public class seleniumThings {
	    
	    public static void main(String[] args) throws InterruptedException {
	        
	        System.setProperty("webdriver.chrome.driver", "D:\\Hari\\latest (1)\\AutomationConcept\\Driverss\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();
			
			 
			 
			 driver.get("https://www.youtube.com/");
			 
			 driver.manage().window().maximize();
			 
			 CalendarPageObject calendarPage = new CalendarPageObject(driver);

		        // Send text to the input field
		        
			 
			 Thread.sleep(10000);
		//	 CalendarPageObject = new practice.CalendarPageObject(driver);
			 String value = "Commentary box tamil";
			// CalendarPageObject.YTbtn.sendKeys(value); 
			 
		     calendarPage.YTbtn.sendKeys(value);
			  //WebElement textbtn = driver.findElement(By.xpath( btn  ));
			  
				/*
				 * JavascriptExecutor js = (JavascriptExecutor) driver;
				 * 
				 * js.executeScript("arguments[0].setAttribute('value', 'winner')", textbtn);
				 * 
				 * //wait <WebDriver> wait = new Fluentwait<WebDriver>(driver);
				 * 
				 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 * 
				 * Wait<WebDriver> waitt = new FluentWait<WebDriver>(driver)
				 * .withTimeout(Duration.ofSeconds(30)) .pollingEvery(Duration.ofSeconds(5))
				 * .ignoring(NoSuchElementException.class);
				 * 
				 */
	    }
	}

	

