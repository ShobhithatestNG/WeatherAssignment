package Utility;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserSelection {
	static WebDriver driver;
	public static void SelectBrowserDriver(WebDriver driver)
	{
		String browserName = System.getProperty("browser");		
		if(browserName.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.firefox.driver","drivers/firefox/geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		else if(browserName.equalsIgnoreCase("SAFARI"))
		{
			driver = new SafariDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("invalid Driver");
			System.exit(0);
		}
		
	}
}
	
