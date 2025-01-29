package runnerFile;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
features="D:\\Hari\\latest (1)\\AutomationConcept\\src\\test\\java\\FeatureFiles\\example.feature",
glue="stepDefinitions",
plugin = {"pretty"},
 dryRun=false,
 monochrome=true
)
public class RunnerClassTest extends AbstractTestNGCucumberTests {
	 private static ExtentReports extent;
	    private ExtentTest test;

	    @BeforeClass
	    public static void setup() {
	        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	    }

	    @AfterClass
	    public void tearDown() {
	        extent.flush();
	    }
}
