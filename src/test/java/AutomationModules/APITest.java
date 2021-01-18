package AutomationModules;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import Utility.Constant;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	public class APITest 
	{
	    public static ArrayList<Integer> RegistrationSuccessful() {
	        RestAssured.baseURI = Constant.API_URL;
	        RequestSpecification request = RestAssured.given();
	        System.out.println("Executing API Test");
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        Date datetoday = new Date();
	        String todate = dateFormat.format(datetoday);
	        System.out.println("The today is"+todate);
	        
	    
	        Response response = request.get("https://api.data.gov.sg/v1/environment/4-day-weather-forecast?date="+todate);
	        System.out.println(response.getBody());
	        //Check the request response status is whether successful or not
	        Assert.assertEquals(response.getContentType(),"application/json");
	        Assert.assertEquals(response.getStatusCode(), 200);
	        //get day after tomorrow response
	        
	        Calendar cal1 = Calendar.getInstance();
	        cal1.add(Calendar.DATE, 0);
	        Date todate1 = cal1.getTime();    
	        String dayafter = dateFormat.format(todate1);
	        Response responseDayAfter = request.get("https://api.data.gov.sg/v1/environment/4-day-weather-forecast?date="+dayafter);
	        System.out.println("the day after is");
	        
	        String dataTest = responseDayAfter.prettyPrint();
	        System.out.println(dataTest);
	        JSONObject json = new JSONObject(dataTest);
	        JSONArray result = json.getJSONArray("items");
	        JSONObject result1 = result.getJSONObject(0);
	        System.out.println(result1.toString());
	        System.out.println("test value");
	        System.out.println(result1.get("forecasts"));
	        JSONArray testValue = (JSONArray) result1.getJSONArray("forecasts");
	        JSONObject test2 = testValue.getJSONObject(1);
	        System.out.println("The value is" + test2.toString());
	        JSONObject jsonfield = new JSONObject(test2.toString());
	        String resultdate = (String) jsonfield.get("date");
	        
	        Object resulttemperature = jsonfield.get("temperature");
	        JSONObject jsonfieldTemperature = new JSONObject(resulttemperature.toString());
	        int resultTemphigh = (Integer) jsonfieldTemperature.get("high");
	        int resultTemplow = (Integer) jsonfieldTemperature.get("low");
	        
	        System.out.println("The result date is:" + resultdate.toString());
	        System.out.println("The result temperature high is:" + resultTemphigh);
	        System.out.println("The result temperature low is:" + resultTemplow);
	        ArrayList<Integer> array = new ArrayList();
	        array.add(resultTemphigh );
	        array.add(resultTemplow );
	        return array ;
	     }
	}