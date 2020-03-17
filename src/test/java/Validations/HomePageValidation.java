package Validations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import AutomationModules.*;
import PageObjects.DirectionsTab;
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

@Test(enabled=false)	
	public void TC02_VerifyMainPage() throws InterruptedException
	{

	driver.get(Constant.Base_URL);
    driver.manage().window().maximize();
	WebElement PersonalTab  = driver.findElement(By.xpath("//div[1]/div/a[1]"));
		PersonalTab.click();
		
		DirectionTabFunctions.ClickDirectionsTab(driver);
		System.out.println("DirectionsTab is visible");
		//driver.wait(5000);
		PersonalTabFunctions.ClickPersonalTab(driver);
		
		System.out.println("PersonalTab is visible");
		LiveTabFunctions.ClickLiveTab(driver);
		
		System.out.println("LiveTab is visible");
	
	}
	
	
//	@Test(priority = 0, enabled=true)
//	public void TC03_VerifyLeftPanel_DirectionTab()
//	{
//		driver=LaunchBrowser.getDriver();
//		DirectionTabFunctions.ClickDirectionsTab(driver);
//		//String SourceLoc ="RAFFLES PLACE";
////		String DestLoc = "CHANGI AIRPORT";
////		driver.wait(10000);
////		DirectionTabFunctions.ClickDirectionsTab(driver);
////		driver.wait(10000);
////		System.out.println(DirectionsTab.getSourceLocation().getAttribute("name"));
////		System.out.println(DirectionsTab.getDestinationLocation().getAttribute("name"));
////			try
////			{
////				if(DirectionsTab.setLocation("RAFFLES PLACE", "CHANGI AIRPORT"))
////				{
////					System.out.println("The direction between" + SourceLoc + " and " + DestLoc +" Is Displayed");
////				}
////				else
////				{
////					System.out.println("The direction between" + SourceLoc + " and " + DestLoc +" Is Displayed");
////					System.exit(1);
////				}
////			}
////			catch (Exception e)
////			{
////				e.printStackTrace();
////			}
//	}
//		
//			
//	
//	
//	@Test(priority =1 ,enabled =true)
//	public void TC04_VerifyMainPage_TopPanel()
//	{
//		
//	}
//		
//	
//	@Test(priority =1 ,enabled =true)
//	public void TC04_VerifyMainPage_SearchButton()
//	{
//		
//	}	

}
