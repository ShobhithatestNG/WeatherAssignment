package Validations;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import AutomationModules.*;
import Utility.Constant;
public class HomePageValidation {
public static WebDriver driver;
	
@BeforeTest
@Parameters("browser") 
	public void VerifyLaunchBrowser(String browser) throws InterruptedException
	{
	try {
		driver =LaunchBrowser.getDriver(browser);
		System.out.print("Login Success");
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
		
@Test(priority = 0, enabled=true)
public void TC01_StartBrowserandValidatePageTitle() 
{
	String actualTitle = "";
	driver.get(Constant.Base_URL);
    driver.manage().window().maximize();
    // get the actual value of the title
    actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, Constant.HomepageTitle);
}

@Test(priority = 0, enabled=true)
public void TC02_VerifyLeftPanel_DirectionTab()
{
	try 
	{
	driver.get(Constant.Base_URL);
	DirectionTabFunctions.ClickDirectionsTab(driver);
	System.out.println("DirectionsTab is visible");
	DirectionTabFunctions.setLocation(driver,Constant.SourceLoc,Constant.DestLoc);
	//currently no results are returned
	driver.navigate().refresh();
	}
		catch (Exception e)
		{
			e.printStackTrace();
		}
}


@Test(enabled=true)	
	public void TC03_VerifyMainPageLiveTab() throws InterruptedException
	{
	driver.get(Constant.Base_URL);
    driver.manage().window().maximize();
    LiveTabFunctions.ClickLiveTab(driver);
	System.out.println("LiveTab is visible");	
	}
	
	@Test(priority =1 ,enabled =false)
	public void TC04_VerifyMainPage_TopPanel()
	{
		
	}
		
	
	@Test(priority =1 ,enabled =false)
	public void TC04_VerifyMainPage_SearchButton()
	{
		
	}
// // close all drivers	
//	@AfterMethod
//	public void CloseDriver(WebDriver driver)
//	{
//		driver.quit();
//	}
//	
	}



