package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalTab {

	public static WebElement getPersonalTab(WebDriver driver)
	{
		WebElement PersonalTab  = driver.findElement(By.xpath("//a[@data-tabid='1']"));
		return PersonalTab;
	}
}
