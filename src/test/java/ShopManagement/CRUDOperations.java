package ShopManagement;

import org.json.simple.JSONObject;

import Utils.WriteTo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CRUDOperations {

	@And("^I delete values from shop array$")
	public void DeleteData() {
		baseURI = "http://localhost:3000/";
		JSONObject request = new JSONObject();


		/***
		 * This is the main code to delete the value
		 */
		when().
			delete("/Shop/27").
		then().
			statusCode(200).
			log().all();
		
		System.out.println("End of Test Function"+"  DeleteData");
	}
	@Given("^I add values to shop array$")
	public void PostData() {
		baseURI = "http://localhost:3000/";
		JSONObject request = new JSONObject();
		WriteTo.Log("Start of POST DATA Function");
		/***
		 * This should be paramaterized via excel input
		 */
		request.put("ShopID", 45);
		request.put("ShopName", "CanadianStore");
		request.put("ShopDesc", "All Grocery items");
		
		/***
		 * This is the main code to post the value
		 */
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/Shop").
		then().
			statusCode(201).
			log().all();
		
		System.out.println("End of Test Function"+"  PostData");
	}
	@When("^update the value for shop array$")
	public void PutData() {
		baseURI = "http://localhost:3000/";
		JSONObject request = new JSONObject();
		
		/***
		 * This should be paramaterized via excel input
		 */
		request.put("ShopName", "Canadian Tire");
		request.put("ShopDesc", "No Grocery items");
		
		/***
		 * This is the main code to change the value for the id 
		 */
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("/Shop/27").
		then().
			statusCode(200).
			log().all();
		
		System.out.println("End of Test Function"+"  PutData");
	}
	@Then("^replace the value for the array$")
	public void PatchData() {
		baseURI = "http://localhost:3000/";
		JSONObject request = new JSONObject();
		
		/***
		 * This should be paramaterized via excel input
		 */
		request.put("ShopAddress", "All over canada");
		
		/***
		 * This is the main code to change the value for the id 
		 */
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("/Shop/27").
		then().
			statusCode(200).
			log().all();
		
		System.out.println("End of Test Function"+"  PatchData");
	}
	@And("^finally get all the value of the shop available$")
	public void GetData() {
		baseURI = "http://localhost:3000/";
		given().
		when().
			get("http://localhost:3000/Shop?offset=10,limit=50").
		then().
			statusCode(200).log().all();
		System.out.println("End of Test Function"+"  GetData");
	}
}
