package AutomationModules;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjects.MainPage;
public class HomePageFunctionss {
	
	
	public static void ClickWeathertab(WebDriver driver) {
		WebElement TransactionTab=MainPage.gettransaction(driver);
		TransactionTab.click();
	    	
	}
	
	public static void Click4dayoutlook(WebDriver driver) {
	
		WebElement link4dayoutlook=MainPage.get4dayOutlook(driver);
		link4dayoutlook.click();

	    	
	}
	public static void Clicktab2hourNowcast(WebDriver driver) {
		
		WebElement tab2hourNowcast=MainPage.get2hourNowcast(driver);
		tab2hourNowcast.click();	    	
	}
	
public static void Clicktab4hourForecast(WebDriver driver) {
		
		WebElement tab2hourforecast=MainPage.Clicktab4hourForecast(driver);
		tab2hourforecast.click();	    	
	}

	}
