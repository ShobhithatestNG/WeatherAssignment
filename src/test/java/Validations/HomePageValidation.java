package Validations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import AutomationModules.*;
import Utility.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
public class HomePageValidation {
public static WebDriver driver;
	
@BeforeTest
public void setup()
{
System.out.println("Starting a new browser session");	
System.setProperty("webdriver.chrome.driver","C:/Automation/chromedriver.exe");
driver = new ChromeDriver();
System.out.print("Login Success");

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
		
@Test

public void TC01_StartBrowserandValidatePageTitle() 
{
//	System.setProperty("webdriver.chrome.driver","C:/Automation/chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	//driver = new ChromeDriver();
	System.out.print("Login Success");

	String actualTitle = "";
	driver.get(Constant.Base_URL);
	
    driver.manage().window().maximize();
    // get the actual value of the title
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, Constant.HomepageTitle);
    HomePageFunctionss.ClickWeathertab(driver);
    HomePageFunctionss.Click4dayoutlook(driver);
   // HomePageFunctionss.ClickWeathertab(driver);
    //HomePageFunctionss.Clicktab2hourNowcast(driver);
    //HomePageFunctionss.Clicktab4hourForecast(driver);
    
    APITest.RegistrationSuccessful();
}
	
//	@Test(priority =1 ,enabled =false)
//	public void TC04_VerifyMainPage_TopPanel()
//	{
//		
//	}
//		

// // close all drivers	
	@AfterTest
	public void CloseDriver()
	{
		System.out.println("closing all browser sessions");
		driver.quit();
	}
	
	}



