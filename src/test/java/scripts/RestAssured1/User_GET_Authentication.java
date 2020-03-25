package scripts.RestAssured1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class User_GET_Authentication {
	
	public void Autherzie() {
	
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckforAuthentication";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET,"/");
		System.out.println(response.getBody().asString());
		
	}
	

}
