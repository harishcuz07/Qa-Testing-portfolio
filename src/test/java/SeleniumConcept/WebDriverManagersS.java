package SeleniumConcept;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class WebDriverManagersS {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Initialize ChromeOptions
        ChromeOptions options = new ChromeOptions();
        
        // Add various ChromeOptions
        options.addArguments("--start-maximized");  // Open Chrome in maximized mode
        options.addArguments("--disable-extensions");  // Disable extensions
        options.addArguments("--disable-infobars");  // Disable "Chrome is being controlled" infobar
        options.addArguments("--ignore-certificate-errors");  // Handle SSL certificate errors

        // Optional: Enable headless mode if running in a CI/CD environment
         options.addArguments("--headless");
        
        // Initialize ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Open the UI application (example: Google)
            driver.get("https://www.google.com");

            // Find the search box element by name
            WebElement searchBox = driver.findElement(By.name("q"));

            // Enter search query and submit the form
            searchBox.sendKeys("Selenium");
            searchBox.submit();
            
            // Wait for a while to let the page load (use WebDriverWait in real cases)
            Thread.sleep(3000);  // Static wait

            // Get the page title and print it
            String pageTitle = driver.getTitle();
            System.out.println("Page title is: " + pageTitle);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser and quit the driver
            driver.quit();
        }
    }
}
