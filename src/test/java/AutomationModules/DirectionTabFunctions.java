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
}
	
//	public static boolean (WebDriver driver,String strSourceLoc, String strDestinationLoc) 
//	{
//		
//		//Clicking on the Directions Tab
//		ClickDirectionsTab(driver);
//
//		//Clicking on clear Route Button
//		DirectionsTab.getClearBtn().click();
//		if(strSourceLoc)
//		{
//		//Set Source Location
//		DirectionsTab.getSourceLocation().sendKeys(strSourceLoc);
//			//Set Destination Location
//		DirectionsTab.getDestinationLocation().sendKeys(strDestinationLoc);
//				//Click on Get Directions Button
//		DirectionsTab.getGetDirectionsBtn().click();
//				WebDriverWait wait = new WebDriverWait(driver,20);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(getSelectTimeDropDown())));		
//		return true;
//		}
//			}
//			else
//			{
//				System.out.println("The given Destination " + strDestinationLoc + " is not found.Please input correct value");
//				return false;
//			}
//		}
//		else
//		{
//			System.out.println("The given Source Location " + strSourceLoc + " is not found.Please input correct value");
//			return false;
//		}
//	}

//	public static boolean selectValuesFromBootstrapDropdowns(String location) 
//	{
//		WebDriverWait wait = new WebDriverWait(driver,60);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[starts-with(@id,'Autocomplete_')]//div[2][starts-with(@title,'" + location + "')]")));		
//		List<WebElement> wl= getLocationBootstrapDropdown();
//
//		for(int i=0; i< wl.size(); i++)
//		{
//			WebElement wel= wl.get(i);
//			String drpvalue = wel.getAttribute("title");
//			if(drpvalue.equalsIgnoreCase(location))
//			{
//				wel.click();
//				return true;
//			}
//
//		}
//		return false;
//	}
//
//	public void getDirectionsForUnfilledLocations()
//	{
//		getDirectionTab().click();
//		getClearBtn().click();
//		getGetDirectionsBtn().click();
//	}
//
//
//	public void setLocation(String strSourceLoc, String strDestinationLoc)
//	{
//		getDirectionTab().click();
//		getClearBtn().click();
//		getSourceLocation().sendKeys(strSourceLoc);
//		selectValuesFromBootstrapDropdowns(strSourceLoc);
//		getDestinationLocation().sendKeys(strDestinationLoc);
//		selectValuesFromBootstrapDropdowns(strDestinationLoc);
//		getGetDirectionsBtn().click();
//	}
//
//	public boolean ValidateTravelTimeDistanceDisplayedAsPerCheckBoxChecked(String checkBoxName) 
//	{	
//		checkBoxName = checkBoxName.toUpperCase();
//		WebDriverWait wait = new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(getSelectTimeDropDown())));	
//		boolean trafficAwareisDiaplayed = driver.findElement(By.id("divTrafficRouteTravelTimeDistance")).isDisplayed();
//		boolean fastestisDisplayed = driver.findElement(By.id("divFastestRouteTravelTimeDistance")).isDisplayed();
//		boolean tollAwareisDisplayed = driver.findElement(By.id("divErpRouteTravelTimeDistance")).isDisplayed();
//		boolean shortestisDisplayed = driver.findElement(By.id("divShortestRouteTravelTimeDistance")).isDisplayed();
//		
//		switch(checkBoxName) 
//		{
//		case "TRAFFICAWARE" :
//			if(trafficAwareisDiaplayed)
//			{
//				System.out.println("The Travel Time Distance is displayed for Traffic Aware Route");
//				return true;
//			}
//			break;
//		case "FASTEST" :
//			if(fastestisDisplayed)
//			{
//				System.out.println("The Fastest Route Travel Time Distance is displayed");
//				return true;
//			}
//			break;
//		case "TOLLAWARE" :
//			if(tollAwareisDisplayed)
//			{
//				System.out.println("The Travel Time Distance is displayed for Toll Aware");
//				return true;
//			}
//			break;
//		case "SHORTEST" :
//			if(shortestisDisplayed)
//			{
//				System.out.println("The Shortest Route Travel Time Distance is displayed");
//				return true;
//			}
//			break;
//		case "ALL" :
//			if(trafficAwareisDiaplayed && fastestisDisplayed && tollAwareisDisplayed && shortestisDisplayed)
//			{	
//				System.out.println("All the Routes Travel Time Distance is displayed");
//				return true;
//			}
//			break;		
//		}
//		return false;
//	}
//	
//	public WebElement returnCheckBox(String checkBoxName)
//	{
//		checkBoxName = checkBoxName.toUpperCase();
//		switch(checkBoxName) 
//		{
//		case "TRAFFICAWARE" :
//			return getTrafficAwareCheckBox();		
//		case "FASTEST" :
//			return getFastestCheckBox();
//		case "TOLLAWARE" :
//			return getTollAwareCheckBox();
//		case "SHORTEST" :
//			return getShortestCheckBox();
//		}
//		return null;
//	}
//
//	public boolean selectCheckBox(String checkBoxName)
//	{	
//		WebElement checkBoxObj = returnCheckBox(checkBoxName);
//		if(!checkBoxObj.isSelected())
//		{
//			checkBoxObj.click();
//			if(checkBoxObj.isSelected())
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public void uncheckAllCheckBoxes()
//	{
//		getDirectionTab().click();
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[starts-with(@onclick,'toggle_route_checkbox')]"));
//
//		for (int i = 0; i < checkBoxes.size(); i++) 
//		{ 
//			if(checkBoxes.get(i).isSelected())
//			{
//				checkBoxes.get(i).click(); 
//			}
//		} 
//
//	}
//	
//	public void checkAllCheckBoxes()
//	{
//		getDirectionTab().click();
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[starts-with(@onclick,'toggle_route_checkbox')]"));
//
//		for (int i = 0; i < checkBoxes.size(); i++) 
//		{ 
//			if(!checkBoxes.get(i).isSelected())
//			{
//				checkBoxes.get(i).click(); 
//			}
//		} 

//	}



