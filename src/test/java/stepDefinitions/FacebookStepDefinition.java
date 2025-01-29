package stepDefinitions;
import java.io.FileReader;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import SeleniumConcept.DataDriverFrameworkConcept;
import SeleniumConcept.PageObjectModelConcept;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
public class FacebookStepDefinition extends DataDriverFrameworkConcept {
	public static WebDriver driver;
	public FileReader reader;
	public PageObjectModelConcept objRepository;

	@Before(order=1)
	public void launch() {
		System.out.println("b4 order 1");
		  System.setProperty("webdriver.chrome.driver", "D:\\Software\\data\\Automation\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();   // browser launch 
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		objRepository = new PageObjectModelConcept(driver);
	}
	@Before(order=2)
	public void summa() {
System.out.println("b4 order 2");		
	}
	
	@After(order=1)
	public void quitBrowser() {
		System.out.println(" after order 1");
		driver.quit();

	}

	@After(order=2)
	public void summa2() {

		System.out.println("after order 2");
	}

	@Given("^User launching the facebook application$")
	public void user_launching_the_facebook_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\data\\Automation\\driver\\chromedriver.exe");
		
		/*DesiredCapabilities gh = DesiredCapabilities.chrome();
		gh.setCapability(CapabilityType.BROWSER_NAME,"chrome");
		
		ChromeOptions chrome =  new ChromeOptions();
		chrome.addArguments("--headless");*/
		WebDriver driver = new ChromeDriver();   // browser launch 
		
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		 /*reader = new FileReader("E:\\Selenium\\Believerz\\Automation\\PropertyFiles\\config.properties");
		Properties prop = new Properties();
		prop.load(reader);
		driver.get(prop.getProperty("url"));*/
		driver.get("https://www.facebook.com/login/");
		objRepository = new PageObjectModelConcept(driver);
		
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" in login page$")
	public void user_enters_and_in_login_page(String user, String pass) throws Throwable {
		objRepository.FBUserName.sendKeys(user);
		Thread.sleep(3000);
		objRepository.FBPass.sendKeys(pass);
		Thread.sleep(3000);
	}

	@Then("^User click login button in login page$")
	public void user_click_login_button_in_login_page() throws Throwable {
		//objRepository.FBClick.click();
	}

	@Then("^User validate homepage$")
	public void user_validate_homepage() throws Throwable {
	}
	
	@When("^User enters username and password in login page$")
	public void user_enters_username_and_password_in_login_page(DataTable data) throws Throwable {
		List<List<String>>dataTableValue=data.raw();
		objRepository.FBUserName.sendKeys(dataTableValue.get(1).get(0));
		Thread.sleep(3000);
		objRepository.FBPass.sendKeys(dataTableValue.get(1).get(1));
		Thread.sleep(3000);
	}
	
	@Given("^User launching the google application$")
	public void user_launching_the_google_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Believerz\\Automation\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();   // browser launch 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();   // maximizing  browser
		driver.get("https://www.google.com/");
		objRepository = new PageObjectModelConcept(driver);
		Thread.sleep(3000);
	}

	@When("^User enters valid data$")
	public void user_enters_valid_data() throws Throwable {
		objRepository.txtBx.sendKeys(readingValueFromExcel().get(0).get("password"));
		objRepository.OutsideClick.click();
	}

	@Then("^User click search button$")
	public void user_click_search_button() throws Throwable {
		objRepository.CLickSearchEng.click();
	}

	@Then("^User validate content$")
	public void user_validate_content() throws Throwable {
	    
	}
	
	@When("^selva enter \"([^\"]*)\" and \"([^\"]*)\" in login page$")
	public void selva_enter_and_in_login_page(String user, String pass) throws Throwable {
		objRepository.FBUserName.sendKeys(user);
		Thread.sleep(3000);
		objRepository.FBPass.sendKeys(pass);
		Thread.sleep(3000);
	}
	
	
}
