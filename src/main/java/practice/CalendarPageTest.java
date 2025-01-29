package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practice.CalendarPageObject;

public class CalendarPageTest {

  
    private WebDriver driver;

    private CalendarPageObject calendarPage;

    @BeforeMethod
    public void setUp() {
       
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();

     
        driver.get("https://example.com");

  
        calendarPage = new CalendarPageObject(driver);
    }

    @Test
    public void testCalendarFunctionality() {
 
        calendarPage.clkClose.click();

      
        calendarPage.txtMobile.sendKeys("1234567890");

        calendarPage.clckSearch.click();

        String sectionText = calendarPage.validateMobileAccesories.getText();
        System.out.println("Section text: " + sectionText);

        calendarPage.btnSignUp.click();

        
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after test 
        driver.quit();
    }
}
