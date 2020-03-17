package Utility;

import java.io.File;

public class Constant {
	public static String Project_location = System.getProperty("user.dir");
	//System.out.println()
	public static String Base_URL ="http://www.mapsynq.com";
	//Copy all browser drivers in this path
	public static String DriverFolder = "C://browers//";
	public static String OutputFolder = "TestOutput";
	public static String ScreenshotFileExtension = ".png";
	public static String screenshotsFolder = "Screenshots";
	public static String ScreenshotsLocation = Project_location+File.separatorChar+OutputFolder+File.separatorChar+screenshotsFolder;
	public static String SourceLoc ="RAFFLES PLACE";
	public static String DestLoc = "CHANGI AIRPORT";
	
	//Constants for Home Page
	public static String HomepageTitle ="mapSYNQ - Live Traffic Information Platform";
	
	
	
}
