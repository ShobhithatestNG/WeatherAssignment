package PageObjects;

import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DirectionsTab {
	static WebDriver driver;
	//All the objects of Directions tab are defined in this class
	
     //	
    	public static WebElement getDirectionTab(WebDriver driver)
    	{
    		WebElement DirTab  = driver.findElement(By.xpath("//a[@data-tabid='0']"));
    		return DirTab;
    	}

    	public static WebElement getClearBtn()
    	{
    		WebElement clearBtn = driver.findElement(By.id("btnClear"));
    		return clearBtn;
    	}

    	public static WebElement getSourceLocation()
    	{	
    		WebElement srcLoc = driver.findElement(By.id("poi_from"));
        	return srcLoc;
    	}

    	public static WebElement getDestinationLocation()
    	{
    		WebElement destLoc = driver.findElement(By.id("poi_to"));
    		return destLoc;
    	}

    	public static WebElement getGetDirectionsBtn()
    	{ 
    		WebElement getDirectionBtn = driver.findElement(By.id("get_direction"));
    		return getDirectionBtn;
    	}

    	public WebElement getTrafficAwareCheckBox()
    	{
    		WebElement trafficAware  = driver.findElement(By.id("also_traffic"));
    		return trafficAware;
    	}

    	public WebElement getFastestCheckBox()
    	{
    		WebElement fastest = driver.findElement(By.id("also_fastest"));
    		return fastest;
    	}

    	public WebElement getTollAwareCheckBox()
    	{
    		 WebElement tollAware = driver.findElement(By.id("also_erp"));
    		return tollAware;
    	}

    	public WebElement getShortestCheckBox()
    	{
    	    WebElement shortest = driver.findElement(By.id("also_shortest"));
    		return shortest;
    	}

    	public static List<WebElement> getLocationBootstrapDropdown()
    	{
    		List<WebElement> locationDropDown = driver.findElements(By.xpath("//div[starts-with(@id, 'Autocomplete_') and @class = 'autocomplete']/div"));
    		return locationDropDown;
    	}

    	public static String getSelectTimeDropDown()
    	{
    		String selectTimeDropwDown ="slJourneyTimeTraffic";
    		return selectTimeDropwDown;
    		
    	}


    }

	