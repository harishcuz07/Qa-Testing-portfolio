package SeleniumConcept;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RemoteWebDriverExample {
    public static void main(String[] args) throws MalformedURLException {
       // 1ststep download selenium Server standalone jar
    	//2nd step java -jar selenium-server-4.6.0.jar hub in cmd
    	//3rd step java -jar selenium-server-4.6.0.jar node --detect-drivers true --hub http://localhost:4444
       // 4th step java -jar selenium-server-4.6.0.jar node --hub http://<hub-ip-address>:4444

    	
    	// Set the URL for the remote Selenium server (e.g., Selenium Grid Hub or cloud service)
        URL remoteUrl = new URL("http://localhost:4444/wd/hub");
        
        // Define ChromeOptions (or you can use DesiredCapabilities for older Selenium versions)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Start Chrome maximized
        options.addArguments("--disable-extensions"); // Disable extensions
        
        // Initialize the RemoteWebDriver with the hub URL and ChromeOptions
        WebDriver driver = new RemoteWebDriver(remoteUrl, options);
        
        try {
            // Open a webpage (e.g., Google)
            driver.get("https://www.google.com");

            // Perform actions on the webpage (example: search for 'Selenium WebDriver')
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.submit();
            
            // Wait for the page to load
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            // Get and print the page title
            System.out.println("Page title is: " + driver.getTitle());
        } finally {
            // Quit the driver and close the session
            driver.quit();
        }
    }
}
