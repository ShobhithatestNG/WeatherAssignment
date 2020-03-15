package AutomationModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.LiveTab;

public class LiveTabFunctions {

	
	public static void ClickLiveTab(WebDriver driver)
	{
		WebElement Live=LiveTab.getLiveTab(driver);
		Live.click();
		}
	}
