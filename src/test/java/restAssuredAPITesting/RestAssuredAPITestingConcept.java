package restAssuredAPITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class RestAssuredAPITestingConcept {

	public static void main(String[] args) {
		
	  RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").body(PayLoad.addPlace()).
		
		       when().
		post("maps/api/place/add/json").
		
		       then().
		       assertThat()
		.statusCode(200).extract().response().asString();
		
		
		System.out.println("SSSSS"+response);
		
		JsonPath js = new JsonPath(response);
		String placeId=js.getString("place_id");
		System.out.println("XXXX"+placeId);
		
		String addres="Selva the Believers xx";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n" + "\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+addres+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}").when().put("maps/api/place/update/json").then().log().all().assertThat()
		.statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		String getPlaceResponse=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).when().get("maps/api/place/get/json").then().log().all().assertThat()
		.statusCode(200).extract().response().asString();
		JsonPath js1 = new JsonPath(getPlaceResponse);
		String address=js1.get("address");
		System.out.println(address);
		
		Assert.assertEquals(addres, address);
	//        List<String> topStudents = response.jsonPath().getList("school.classes.students[?(@.grades[0] > 90)].name");
	 
}
}
