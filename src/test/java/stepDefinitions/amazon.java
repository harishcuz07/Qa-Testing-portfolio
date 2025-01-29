package stepDefinitions;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumConcept.PageObjectModelConcept;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class amazon {

	public PageObjectModelConcept hk;

@Given("User launching the amazon application")
public void user_launching_the_amazon_application() {
    System.out.println("Harish");
    hk.FBClick.click();
}
@When("user navigating to mobiles tab in amazon application")
public void user_navigating_to_mobiles_tab_in_amazon_application() {
    System.out.println("Kumar");
}
@Then("user search iphone in that page")
public void user_search_iphone_in_that_page() {
    System.out.println("HarishKumar");
    
    
}


@Given("User enters login cred application")
public void user_enters_login_cred_application(io.cucumber.datatable.DataTable dataTable) {
	
	List<List<String>> users = dataTable.asLists(String.class);
	System.out.println(users.get(0).get(1));
}

@When("user navigating to mobijjjles tab in amazon application")
public void user_navigating_to_mobijjjles_tab_in_amazon_application() {
   
}

@Then("user search iphohkhkne in that page")
public void user_search_iphohkhkne_in_that_page() {
    
}

	
}
