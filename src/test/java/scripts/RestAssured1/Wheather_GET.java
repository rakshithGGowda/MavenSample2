package scripts.RestAssured1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class Wheather_GET {
	
	 public void wheatherapi() {
		 
		 
		 
		 RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
		 
		 RequestSpecification httprequest = RestAssured.given();
		 
		 
		 Response response = httprequest.request(Method.GET,"/bangalore");
		 
		 
		 String responsebody = response.getBody().asString();
		 System.out.println(responsebody+"raks");
		 
		 Assert.assertEquals(response.getStatusCode(),200);
		 Assert.assertEquals(response.getStatusLine().toString(),"HTTP/1.1 200 OK");
		 
				 
		
			
		}
	
	

}
