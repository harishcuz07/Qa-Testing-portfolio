package TestNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.java.After;

public class hhf {

	@BeforeTest
	public void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	
	@BeforeSuite
	public void BeforeTest() {
		System.out.println("BeforeTest");

	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");

	}

	@Test (dataProvider = "selva")
	public void Test(String rt, String j,String kj) {
		System.out.println(rt);
		System.out.println(j);
		System.out.println(kj);

	}
    @AfterMethod
	public void AfterMethod() {
    	System.out.println("AfterMethod");

	}
    @AfterClass

	public void AfterClass() {
    	System.out.println("AfterClass");

	}
    @AfterTest

	public void AfterTest() {
    	System.out.println("AfterTest");

	}
    @AfterSuite

	public void AfterSuite() {
    	System.out.println("AfterSuite");

    }
    @DataProvider (name="selva")
    public Object[][] dataProviderMethod() {
    	
    	 Object[][] obj= 	new Object[][] { { "data1", "sel", "ggghh" }, { "data2", "hari", "wweezd"} };
        return obj;
    }

    }



