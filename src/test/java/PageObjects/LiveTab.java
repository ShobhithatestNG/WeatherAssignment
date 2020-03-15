package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LiveTab {

	static WebDriver driver;
	//All the objects of Directions tab are defined in this class
	
     //	
    	public static WebElement getLiveTab(WebDriver driver)
    	{
    		WebElement DirTab  = driver.findElement(By.xpath("//a[@data-tabid='2']"));
    		return DirTab;
    	}

    	public static WebElement getIncidnetsbutton()
    	{
    		
    		WebElement Incidnetsbutton = driver.findElement(By.xpath("//div[1]/label[1]/span/h2"));
    		return Incidnetsbutton;
    	}
    	public static WebElement getCamerabutton()
    	{
    		
    		WebElement Camerabutton = driver.findElement(By.xpath("//div[1]/label[2]/span/h2"));
    		return Camerabutton;
    	}
    	public static WebElement getTollsButton()
    	{
    		
    		WebElement Tollsbutton = driver.findElement(By.xpath("//div[1]/label[3]/span/h2"));
    		return Tollsbutton;
    	}
    
    	
    	public static WebElement getSearchIncidentbox()
    	{	
    		WebElement IncidentsSearch = driver.findElement(By.id("txtSearchIncidentsingapore"));
        	return IncidentsSearch;
    	}
    	public static WebElement getSearchcamerabox()
    	{	
    		WebElement CameraSearch = driver.findElement(By.id("txtSearchCamerasingapore"));
        	return CameraSearch;
    	}

		
    	

}
