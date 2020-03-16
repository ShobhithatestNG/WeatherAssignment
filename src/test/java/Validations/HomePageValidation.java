package Validations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import AutomationModules.*;
import PageObjects.DirectionsTab;

public class HomePageValidation {

WebDriver driver;

	@Test(priority = 0, enabled=true)
	public void TC01_StartBrowserandValidatePageTitle() 
	{
		try {
		driver=LaunchBrowser.getDriver();
		System.out.print("Login Success");
			}
		catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
	
	@Test(priority =1 ,enabled =true)
	public void TC02_VerifyMainPage() throws InterruptedException
	{
		WebDriver driver=LaunchBrowser.getDriver();
		WebElement PersonalTab  = driver.findElement(By.xpath("//div[1]/div/a[1]"));
		PersonalTab.click();
		
		DirectionTabFunctions.ClickDirectionsTab(driver);
		System.out.println("DirectionsTab is visible");
		driver.wait(5000);
		PersonalTabFunctions.ClickPersonalTab(driver);
		driver.wait(5000);
		System.out.println("PersonalTab is visible");
		LiveTabFunctions.ClickLiveTab(driver);
		driver.wait(5000);
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
