package ShopManagement;

import java.util.Map;

import org.json.simple.JSONObject;

import java.util.Collections;
import java.util.HashMap;


import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddingValuesviaJSONObject {

	public void keepthisNotToBeUsed() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("name", "James");
//		map.put("profession", "Movies");
//		System.out.println(map);
		//shop.put("Shop", request.toJSONString());
//		System.out.println(request);
		//System.out.println(request.toJSONString());
//
//		Map<String, Object> item = new HashMap<String, Object>();
//		item.put("AUTOID", "012");
//		item.put("Name", "this is a");

//		JSONObject shop = new JSONObject();
//		//shop.put("Shop", Collections.singleton(item));
//		
		
//		given().
//		when().
//			get("http://localhost:3000/Shop").
//		then().
//			statusCode(200);
//			
	}
	@Given("^I add the values through JSON object$")
	public void addValues() {
		baseURI="http://localhost:3000/";
		JSONObject request = new JSONObject();
		request.put("ShopID", 3);	
		request.put("Name", "RIDDHU KEEP Quite");

		given().
			contentType(ContentType.JSON).accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("/Shop").
		then().
		statusCode(201).
			log().all();
	}
}
