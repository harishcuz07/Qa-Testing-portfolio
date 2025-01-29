package TestNGConcept;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethodsIf.List;
import org.testng.annotations.Test;

public class GroupingConcept {

	@Test(groups = { "SmokeTest", "SanityTest" })
	public void retryiu() {
		System.out.println("another class smk test");
	}
	
	
	@Test
	public void retrydiu() {
		System.out.println("another class all ");
	}
	
	@Test
	public void retryidu() {
		System.out.println("another class regression");
	}
	
	@Test(groups = { "SmokeTest", "SanityTest" })

	public void retrssyidu() {
		System.out.println("another clas regress smoke");
	}
	@Test (groups= {"firsttry"})
	public void jk() {
		
		System.out.println("grouping -1");
	}
	
	@Test (groups= {"firsttry"})
	public void hk() {
		
		System.out.println("grouping-2");
	}
	
//	<?xml version="1.0" encoding="UTF-8"?>  
//	<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">  
//	<suite name="test_suite">  
//	<test name="Loan">  
//	<groups>  
//	<run>  
//	<include name="SmokeTest"/>  
//	</run>  
//	</groups>  
//	 <classes>  
//	 <class name="com.javatpoint.Personal_loan"/>  
//	 <class name="com.javatpoint.Home_loan"/>  
//	  <class name="com.javatpoint.Car_loan"/>  
//	  </classes>  
//	  </test> <!-- Test -->  
//	 </suite> <!-- Suite -->  
}
