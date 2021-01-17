package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	static WebDriver driver;
	
	public static WebElement gettransaction(WebDriver driver)
	{	
		 WebElement Element =driver.findElement(By.xpath("//div/nav/ul/li[1]/a"));
		     return Element;
	}
	
	public static WebElement get4dayOutlook(WebDriver driver)
	{	
		 WebElement Element =driver.findElement(By.xpath("//div/nav/ul/li[1]/div/div/div[1]/div[1]/ul/li[3]/a"));
		     return Element;
	}
	public static WebElement get2hourNowcast(WebDriver driver)
	{	
		 WebElement Element =driver.findElement(By.xpath("//div/nav/ul/li[1]/div/div/div[1]/div[1]/ul/li[1]/a"));
		     return Element;
	}
	public static WebElement Clicktab4hourForecast(WebDriver driver)
	{	
		 WebElement Element =driver.findElement(By.xpath("///div[1]/div/ul/li[3]/a"));
		     return Element;
	}

}
