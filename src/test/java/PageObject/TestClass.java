package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    PageObjectManager pageObjectManager;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        pageObjectManager = new PageObjectManager(driver);
    }

    @Test
    public void searchTest() {
        HomePage homePage = pageObjectManager.getHomePage();
        homePage.enterSearchTerm("Selenium WebDriver");
        homePage.submitSearch();

        SearchResultsPage searchResultsPage = pageObjectManager.getSearchResultsPage();
        String title = searchResultsPage.getPageTitle();
        Assert.assertTrue(title.contains("Selenium WebDriver"));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
