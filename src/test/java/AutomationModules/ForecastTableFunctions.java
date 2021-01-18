package AutomationModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.MainPage;

public class ForecastTableFunctions {

	public static void getweatherdetails_dayaftertom_getdate(WebDriver driver) {
		
		WebElement element=MainPage.getweatherdetails_date(driver);
		element.getText();   
		System.out.println("Date from weather website: " +element.getText());
	}
	public static int getweatherdetails_dayaftertom_low(WebDriver driver) {
		
		WebElement element=MainPage.getweatherdetails_DayAfterTom_low(driver);
		System.out.println("Temp low from weather website: " +element.getText());
		String e= element.getText(); 
		return Integer.parseInt(e.substring(0,2));  
		
	}
	
public static int getweatherdetails_dayaftertom_high(WebDriver driver) {
		
		WebElement element=MainPage.getweatherdetails_DayAfterTom_high(driver);  
		System.out.println("Temp high from weather website: " +element.getText());
		String e= element.getText(); 
		return Integer.parseInt(e.substring(0,2));
		
	}
}
