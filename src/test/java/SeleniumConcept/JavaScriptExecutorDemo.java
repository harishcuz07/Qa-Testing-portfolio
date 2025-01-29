package SeleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo  {
	
	
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Hari\\latest (1)\\AutomationConcept\\driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();  
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	 driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
     WebElement elemendown=driver.findElement(By.xpath("//*[text()='Github Releases']"));
	
     JavascriptExecutor j = (JavascriptExecutor)driver;
	

	 Thread.sleep(1000);
	 WebElement elemenUpt=driver.findElement(By.xpath("//*[@name='email']"));

	 j.executeScript("arguments[0].scrollIntoView(true)",elemendown);
		Thread.sleep(2000);

	 j.executeScript("arguments[0].scrollIntoView(false)",elemenUpt);
		elemenUpt.click();
     j.executeScript("arguments[0].setAttribute('style','background:green;border:solid 2px violet');",elemenUpt);
	
     j.executeScript("window.scrollBy(0,500)");
	
     j.executeScript("arguments[0].click()",elemenUpt);
     
     j.executeScript("arguments[0].click()",elemenUpt);
		
	//	j.executeScript("arguments[0].setAttribute('value','selva')",elemenUpt);
	
	
}
}
