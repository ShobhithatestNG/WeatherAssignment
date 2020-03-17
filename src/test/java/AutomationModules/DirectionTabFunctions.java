package AutomationModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.DirectionsTab;

public class DirectionTabFunctions
{

	public static void ClickDirectionsTab(WebDriver driver)
	{	
	WebElement DirTab=DirectionsTab.getDirectionTab(driver);
	DirTab.click();
	}


	public void getDirectionsForUnfilledLocations(WebDriver driver)
	{
		DirectionsTab.getDirectionTab(driver).click();
		DirectionsTab.getClearBtn(driver).click();
		DirectionsTab.getGetDirectionsBtn(driver).click();
	}


	public static void setLocation(WebDriver driver,String strSourceLoc, String strDestinationLoc)
	{
		DirectionsTab.getDirectionTab(driver).click();
		DirectionsTab.getClearBtn(driver).click();
		DirectionsTab.getSourceLocation(driver).sendKeys(strSourceLoc);
		
		DirectionsTab.getDestinationLocation(driver).sendKeys(strDestinationLoc);
		
		DirectionsTab.getGetDirectionsBtn(driver).click();
	}





	}



