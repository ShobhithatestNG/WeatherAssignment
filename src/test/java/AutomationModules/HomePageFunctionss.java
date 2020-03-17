package AutomationModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.MainPage;
public class HomePageFunctionss {
	
	public void verifyPage(WebDriver driver) {
		
		 //verify signin link
	    	WebElement SignIn =driver.findElement(By.linkText("Sign in"));
	    	SignIn.click();
	    	//Verify Mapsync logo
	    	MainPage.getMapsSynqlogo().click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        MainPage.gettoggle_collapse().click();
	      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	}
	
	

}
