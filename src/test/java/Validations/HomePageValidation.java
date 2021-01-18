package Validations;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import AutomationModules.*;
import Utility.Constant;

public class HomePageValidation {
public static WebDriver driver;
	
@BeforeTest
public void setup()
{
System.out.println("Starting a new browser session");	
System.setProperty("webdriver.chrome.driver","C:/Automation/chromedriver.exe");
driver = new ChromeDriver();
System.out.print("Login Success");
//WebDriverManager.chromedriver().setup();
}
//@Parameters("browser") 
//	public void VerifyLaunchBrowser(String browser) throws InterruptedException
//	{
//	try {
//		driver =LaunchBrowser.getDriver(browser);
//		System.out.print("Login Success");
//		}
//		catch (InterruptedException e) {
//		e.printStackTrace();
//		}
//	}
		
@Test(priority =2 ,enabled =true)
public void TC01_StartBrowserandValidatePageTitle() 
{
	String actualTitle = "";
	driver.get(Constant.Base_URL);
	
    driver.manage().window().maximize();
    // get the actual value of the title
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, Constant.HomepageTitle);

    // HomePageFunctionss.ClickWeathertab(driver);
    //HomePageFunctionss.Clicktab2hourNowcast(driver);
    //HomePageFunctionss.Clicktab4hourForecast(driver);
}

@Test(priority =1 ,enabled =false)
//This test will get the temperature for day after tomorrow from API
	public void TC02_Validate4dayforecast_dayaftertomorrowtempfromAPI() 
	{ 
		//Get 4 day outlook forecast details from the API https://data.gov.sg/dataset/weather-forecast
		ArrayList<Integer> Temperature;  
	    Temperature = APITest.RegistrationSuccessful();
	    System.out.println("The temperature high is"+Temperature.get(0));
	    System.out.println("The temperature low is"+Temperature.get(1));
	}

//This test will validate the temperature for day after tomorrow from web 
@Test(priority =1 ,enabled =false)
	public void TC03_Validate4dayforecast_dayaftertomorrowtempfromweb() 
	{	//Get 4 day outlook forecast details
		driver.get(Constant.Base_URL);	
		driver.manage().window().maximize();
		HomePageFunctionss.ClickWeathertab(driver);
		HomePageFunctionss.Click4dayoutlook(driver);
		//Get day after tomorrow date from web 
		ForecastTableFunctions.getweatherdetails_dayaftertom_getdate(driver);
		//get temperature(high&low) from web
		int web_low=ForecastTableFunctions.getweatherdetails_dayaftertom_low(driver) ;
		int web_high= ForecastTableFunctions.getweatherdetails_dayaftertom_high(driver);
	}

//This test will get the temperature for day after tomorrow from both web and API
@Test(priority =1 ,enabled =true)
	public void TC04_compare_dayaftertomorrowtempfromweb_and_API() 
	{	
		driver.get(Constant.Base_URL);	
		driver.manage().window().maximize();
		HomePageFunctionss.ClickWeathertab(driver);
		HomePageFunctionss.Click4dayoutlook(driver);
		//Get day after tomorrow date from web 
		ForecastTableFunctions.getweatherdetails_dayaftertom_getdate(driver);
		//get temperature(high&low) from web
		int web_low=ForecastTableFunctions.getweatherdetails_dayaftertom_low(driver) ;
		int web_high= ForecastTableFunctions.getweatherdetails_dayaftertom_high(driver);
		//get temperature from API 
		ArrayList<Integer> Temperature;  
	    Temperature = APITest.RegistrationSuccessful();
	    int API_low=Temperature.get(1);
	    int API_high=Temperature.get(0);
	    
	   //compare the temperature (high&low) from web and API 
	    Assert.assertEquals(API_high, web_high);
	    Assert.assertEquals(API_low, web_low);
	}
//	@Test(priority =1 ,enabled =false)
//	public void TC04_VerifyMainPage_TopPanel()
//	{
//		
//	}
//		

// close all drivers	
@AfterTest
	public void CloseDriver()
	{
		System.out.println("closing all browser and webdriver sessions");
		driver.quit();
	}
	
	}



