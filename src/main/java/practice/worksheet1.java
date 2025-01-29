package practice;

import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
public class worksheet1 {
    public static void main(String[] args) {
    	
    	
    	 RestAssured.baseURI="https://reqres.in"; //----> practice website 
    	 
    	 
         String methods = "/api/users";

 
        
    	 String response= given().log().all().header("Content-Type","application/json").
    			
    			
 		       when().get().
 		
 		       then().extract().asString();
    	 
    	 
    	 System.out.println(response);
    	 
    	
    }
}
	
	
		
		         
		          

		          

		  
		        

		        
		   
		    
		
	
	
	

