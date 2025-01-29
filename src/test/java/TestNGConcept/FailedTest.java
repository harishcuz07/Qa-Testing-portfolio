package TestNGConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class FailedTest {
	@Test
	public void retry() throws InterruptedException {
		System.out.println("all");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\selva\\git\\repository3\\Automation\\driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();   // browser launch 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/search?q=ind+vs+eng+2nd+odi&sxsrf=ALeKk00J3zJixYTmPhtjODQJplTMy8-S9g%3A1616867542838&ei=1nBfYKPXMqSc4-EPr8-GyAM&oq=ind+vs+eng+&gs_lcp=Cgdnd3Mtd2l6EAEYATIICAAQsQMQgwEyCAgAELEDEIMBMgUIABCxAzIICAAQsQMQgwEyCAgAELEDEIMBMggIABCxAxCDATIFCAAQsQMyCAgAELEDEIMBMggIABCxAxCDATIICAAQsQMQgwE6BwgjELADECc6BwgAEEcQsAM6CgguELADEMgDEENKBQg4EgExUOikAVjopAFgpbEBaAFwAngAgAFsiAG8AZIBAzEuMZgBAKABAaoBB2d3cy13aXrIAQ_AAQE&sclient=gws-wiz#sie=m;/g/11ll18pzpb;5;/m/021q23;cms;fp;1;;");
	       Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='Scorecard']")).click();
	}
	
	
}