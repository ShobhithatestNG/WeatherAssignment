package AutomationModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LiveTab;
import PageObjects.PersonalTab;

public class PersonalTabFunctions {

	public static void ClickPersonalTab(WebDriver driver)
	{
			WebElement Personal=PersonalTab.getPersonalTab(driver);
			Personal.click();
			
		}	
	}

