package SeleniumConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait {

	public static String GetLocatorName(String localReference) throws Throwable{
		
		
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseconnection","root","");
		String sql="select * from facebook "+ "where locatorreference ='" + localReference +"'";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			String getLocatorName = rs.getString(3);
			System.out.println(getLocatorName);
		}
		
			con.close();
			return sql;
		
	}
	@SuppressWarnings("deprecation")
	public static WebElement fluentwaits(String h) {
WebDriver driver = new ChromeDriver();
		
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                       .withTimeout(Duration.ofSeconds(30))
                       .pollingEvery(Duration.ofSeconds(5))
                       .ignoring(NoSuchElementException.class);
				
		
		WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@class='abc']"));
			}
		});
		return foo;
		
	}
}
