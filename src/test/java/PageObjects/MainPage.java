package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	static WebDriver driver;
	
	public static WebElement getMapsSynqlogo()
	{	
		WebElement logo =driver.findElement(By.cssSelector("a[href*='http://www.mapsynq.com']"));
	     return logo;
	}	
	
	public static WebElement gettoggle_collapse()
	{	
		 WebElement toggle_collapse =driver.findElement(By.id("ad_toggle"));
		     return toggle_collapse;
	}
	
	
	public static WebElement getSignInButton()
	{	
		 WebElement SignIn =driver.findElement(By.linkText("Sign in"));
		     return SignIn;
	}
	
	public static WebElement getSearchButton()
	{	
		 WebElement SearchButton =driver.findElement(By.xpath("//div[1]/div[1]/div/form/span"));
		     return SearchButton;
	}
	
	//*[@id="OpenLayers.Control.Panel_682"]/div[1] 

}
