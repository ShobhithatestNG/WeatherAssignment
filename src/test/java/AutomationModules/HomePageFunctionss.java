package AutomationModules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageObjects.MainPage;
public class HomePageFunctionss {
	
	public void verifyPage(WebDriver driver) {
		
		 //Verify Mapsync logo
		
	        MainPage.getMapsSynqlogo().click();
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        MainPage.gettoggle_collapse().click();
	      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	        
	}
	
	

}
