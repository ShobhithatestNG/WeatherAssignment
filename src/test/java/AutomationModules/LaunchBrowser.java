package AutomationModules;
import org.testng.Assert;
import Utility.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

	static WebDriver driver ;

	public static WebDriver getDriver(String browser) throws InterruptedException
	{
		//create new folder for capturing Screenshots
		String FolderName = new SimpleDateFormat("yyyy_MMM_dd").format(new Date());
	    CreateFolder.CreateNewFolder(Constant.ScreenshotsLocation, FolderName);
		//String browserName = System.getProperty("browser");	
		System.out.println("browser is"+ browser);
		
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver","drivers/firefox/geckodriver.exe");
			driver = new FirefoxDriver();
		}	
		else if(browser.equalsIgnoreCase("SAFARI"))
		{
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.edge.driver",".\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("invalid Driver");
			System.exit(0);
		}
		
		return driver;
		
	
	  		 
   
	}
}
