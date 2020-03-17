package AutomationModules;
import org.testng.Assert;
import PageObjects.DirectionsTab;
import Utility.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	static WebDriver driver ;

	public static WebDriver getDriver() throws InterruptedException
	{
		//create new folder for capturing Screenshots
		String FolderName = new SimpleDateFormat("yyyy_MMM_dd").format(new Date());
	    CreateFolder.CreateNewFolder(Constant.ScreenshotsLocation, FolderName);
	   
	    // Check browser
	    System.setProperty("webdriver.chrome.driver","drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String actualTitle = "";
		driver.get(Constant.Base_URL);
        driver.manage().window().maximize();

        // get the actual value of the title
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, Constant.HomepageTitle);
        WebElement SignIn =driver.findElement(By.linkText("Sign in"));
        SignIn.click();
        		 
    return driver;
	}
}
