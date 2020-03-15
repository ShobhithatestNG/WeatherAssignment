package Utility;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserSelection {
	WebDriver driver;
	public WebDriver SelectBrowserDriver()
	{
		String browserName = System.getProperty("browser");	
		
		switch(browserName) 
		{
		case "CHROME" :
			driver = new ChromeDriver();
			break;
		case "FIREFOX" :
			driver = new FirefoxDriver();
			break;	
		case "SAFARI" :   
			driver = new SafariDriver();
			break;
		case "IE" :
			driver : new InternetExplorerDriver();
		break;
		default:
			System.out.println("invalid Driver");
			
		}
		return driver;
	}
	

}
