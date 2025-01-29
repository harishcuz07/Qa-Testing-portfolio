package TestNGConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import SeleniumConcept.PageObjectModelConcept;

public class TestNGAnnotationConcept {
public static WebDriver driver;
public PageObjectModelConcept objRepository;
	
	@Test
	public void testty() {
	     System.out.println(1/0);
	}
	
	

	
	
}
