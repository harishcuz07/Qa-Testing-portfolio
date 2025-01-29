package TestNGConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTestNG {

	@DataProvider(name="mydata")
	public Object[] selva() {
		Object[][] obj = new Object[4][2];
		obj[0][0]= "1";
		obj[0][1]= "2";
		obj[1][0]="selva";
		obj[1][1]="raj";
		
		return obj;

	}
	
	private String c;
	
	@Test
	public void hk(String c) {
		System.out.println();
	}
	
	
	@Test(dataProvider="mydata")
	public void dataReading(String uname, String pwd) {

		
		System.out.println(uname);
		System.out.println(pwd);
	}
}
