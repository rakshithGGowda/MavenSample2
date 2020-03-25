package scripts.RestAssured1;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class RegisterPOST {
	
	public void registerCostumer() {
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification httprequest  = RestAssured.given();
		JSONObject  requestParams = new JSONObject();
		requestParams.put("FirstName", "rakshith");
		requestParams.put("LastName", "Gowda");
		requestParams.put("UserName", "rakshithgowda");
		requestParams.put("Password", "Sample");
		requestParams.put("Email", "rakshithgowdag89@gmail.com");
		
		httprequest.header("Content-Type","application/json");
		httprequest.body(requestParams.toJSONString());
		
		
		Response response = httprequest.request(Method.POST,"/register");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		 Assert.assertEquals(response.getStatusCode(),200);
		 Assert.assertEquals(response.getStatusLine().toString(),"HTTP/1.1 200 OK");
		 Assert.assertEquals(response.jsonPath().get("ScccessCode"), "OPERATION_SUCCESS");
		 
		
	}

}
