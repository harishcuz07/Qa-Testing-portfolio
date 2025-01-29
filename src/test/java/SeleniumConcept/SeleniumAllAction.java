package SeleniumConcept;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAllAction  {
	public static WebDriver driver;
	public static void sendKeys1(String value, String webValue) {

		driver.findElement(By.xpath(value)).sendKeys(webValue);
		
	}
	
	public static void click(String value) {

		driver.findElement(By.xpath(value)).click();
		
	}
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\data\\Project\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		//driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");

		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		Thread.sleep(2000);

		WebElement searchBox=driver.findElement(By.xpath("//*[@name='q']"));
		//searchBox.sendKeys("selenium dependency");
		act.sendKeys(searchBox, "selva").build().perform();
		//sendKeys1("//*[@name='q']","selva");
		
	//	WebElement search=driver.findElement(By.xpath("(//*[@name='btnK'])[1]"));
		//search.click();
		
		click("(//*[@name='btnK'])[1]");
		WebElement privacy=driver.findElement(By.xpath("//*[text()='Privacy']"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", privacy);
		Thread.sleep(2000);
		privacy.click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		String name = "E:\\Selenium\\Believerz\\selvaraaja\\screenshots\\privacy.png";
		File Destination = new File(name);
		FileUtils.copyFile(source, Destination);
		
		WebElement faq=driver.findElement(By.xpath("(//*[text()='FAQ'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(faq));
		faq.click();
		//driver.quit();
	}
}
