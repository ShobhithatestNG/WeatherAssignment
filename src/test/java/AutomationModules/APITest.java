package AutomationModules;

import org.json.JSONObject;
import org.junit.Assert;

import Utility.Constant;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	public class APITest 
	{
	    public static void RegistrationSuccessful() {
	        RestAssured.baseURI = Constant.API_URL;
	        RequestSpecification request = RestAssured.given();
	        System.out.println("Executing API Test");
	        
	        JSONObject requestParams = new JSONObject();
	        request.body(requestParams.toString());
	        Response response = request.get("https://api.data.gov.sg/v1/environment/4-day-weather-forecast?date=2021-01-18");
	        System.out.println(response.getBody());
	        //Check the request response status is whether successful or not
	        Assert.assertEquals(response.getContentType(),"application/json");
	        Assert.assertEquals(response.getStatusCode(), 200);
	        
	         }
	}