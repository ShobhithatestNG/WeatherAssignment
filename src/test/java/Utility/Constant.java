package Utility;

import java.io.File;

public class Constant {
	public static String Project_location = System.getProperty("user.dir");
	//System.out.println()
	public static String Base_URL ="http://www.weather.gov.sg/home/";
	//Copy all browser drivers in this path
	public static String DriverFolder = "C://browers//";
	public static String OutputFolder = "TestOutput";
	public static String ScreenshotFileExtension = ".png";
	public static String screenshotsFolder = "Screenshots";
	public static String ScreenshotsLocation = Project_location+File.separatorChar+OutputFolder+File.separatorChar+screenshotsFolder;
	
	//Constants for Home Page
	public static String HomepageTitle ="Home |";
	
	//URL for API 
	public static String API_URL ="https://data.gov.sg/dataset/weather-forecast";
	
}
