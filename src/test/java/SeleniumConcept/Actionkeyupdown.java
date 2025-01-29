package SeleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionkeyupdown 

{
   
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Project\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		Actions sd = new Actions(driver);
		
		
		WebElement g=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
		Action typeInCAPS = sd.keyDown(g, Keys.SHIFT).sendKeys(g, "ART").keyUp(g, Keys.SHIFT).build();
	 System.out.println("sucess");
	//Performing the typeInCAPS action
	typeInCAPS.perform();
	
	}
}
