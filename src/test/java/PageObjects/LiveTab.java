package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LiveTab {

	static WebDriver driver;
	//All the objects of Directions tab are defined in this class
	
     //	
    	public static WebElement getLiveTab(WebDriver driver)
    	{
    		WebElement DirTab  = driver.findElement(By.xpath("//a[@data-tabid='2']"));
    		return DirTab;
    	}

    	public static WebElement getIncidnetsbutton()
    	{
    		
    		WebElement Incidnetsbutton = driver.findElement(By.xpath("//div[1]/label[1]/span/h2"));
    		return Incidnetsbutton;
    	}
    	public static WebElement getCamerabutton()
    	{
    		
    		WebElement Camerabutton = driver.findElement(By.xpath("//div[1]/label[2]/span/h2"));
    		return Camerabutton;
    	}
    	public static WebElement getTollsButton()
    	{
    		
    		WebElement Tollsbutton = driver.findElement(By.xpath("//div[1]/label[3]/span/h2"));
    		return Tollsbutton;
    	}
    
    	
    	public static WebElement getSearchIncidentbox()
    	{	
    		WebElement IncidentsSearch = driver.findElement(By.id("txtSearchIncidentsingapore"));
        	return IncidentsSearch;
    	}
    	public static WebElement getSearchcamerabox()
    	{	
    		WebElement CameraSearch = driver.findElement(By.id("txtSearchCamerasingapore"));
        	return CameraSearch;
    	}
 //add elements
		
    	By directionlink = By.xpath("//*[@id='info_panel']/div[1]/div/a[1]");
    	By incidentLink = By.id("rdIncidents");
    	By camerasLink = By.id("rdCameras");
    	By tollsLink = By.id("rdErp");
    	By incidentslink = By.id("search_incident_singapore");
    	By cameraLocationSingapore = By.id("camera_location_singapore");
    	By cameraLocationMalaysia = By.id("camera_location_malaysia");
    	By cameraLocationSrilanka = By.id("camera_location_srilanka");
    	By tollerplocationsingapore = By.id("erp_locationsingapore");
    	By tollerplocationmalaysia = By.id("erp_locationmalaysia");
    	By tollerplocationthiland = By.id("erp_locationthailand");
    	By selectpricechart = By.id("select_price_chart");
    	//private WebDriver driver;
    	private String txtplaceholder = "document.getElementById('txtSearchIncidentsingapore')";
    	private String txtplaceholdercamera = "document.getElementById('txtSearchCamerasingapore')";
    	private String txtplaceholdertoll = "document.getElementById('txtSearchERPsingapore')";
    	By carSaturday = By.id("car_s");
    	By motorCycleWeekdays = By.id("mc_m");
    	By motorCycleSaturday = By.id("mc_s");
    	By carWeekdays = By.id("car_m");
    	By largeVehicleWeekdays = By.id("lgv_m");
    	By largeVehicleSaturday = By.id("lgv_s");
    	By heavyVehicleWeekdays = By.id("hgv_m");
    	By heavyVehicleSaturday = By.id("hgv_s");
    	By veryHeavhVehicleWeekdays = By.id("vhgv_m");
    	By veryHeavhVehicleSaturday = By.id("vhgv_s");

    	By xPathTabCarSaturday = By.xpath("id('car_s')/tbody/tr");
    	By xPathTableMotorCycleWeekdays = By.xpath("id('mc_m')/tbody/tr");
    	By xPathTableMotorCycleSaturday = By.xpath("id('mc_s')/tbody/tr");
    	By xPathTableCarWeekdays = By.xpath("id('car_m')/tbody/tr");
    	By xPathTableLargeVehicleWeekdays = By.xpath("id('lgv_m')/tbody/tr");
    	By xPathTableLargeVehicleSaturday = By.xpath("id('lgv_s')/tbody/tr");
    	By xPathTableHeavyVehicleWeekdays = By.xpath("id('hgv_m')/tbody/tr");
    	By xPathTableHeavyVehicleSaturday = By.xpath("id('hgv_s')/tbody/tr");
    	By xPathTableVeryHeavhVehicleWeekdays = By.xpath("id('vhgv_m')/tbody/tr");
    	By xPathTableVeryHeavhVehicleSaturday = By.xpath("id('vhgv_s')/tbody/tr");

    	private String visbleTextCarSaturday = "Car (Saturday)";
    	private String visbleTextMotorcycleWeekdays = "Motorcycle (Weekdays)";
    	private String visbleTextMotorcycleSaturday = "Motorcycle (Saturday)";
    	private String visbleTextCarWeekdays = "Car (Weekdays)";
    	private String visbleTextLargeVehicleWeekdays = "Large Vehicle (Weekdays)";
    	private String visbleTextLargeVehicleSaturday = "Large Vehicle (Saturday)";
    	private String visbleTextHeavyVehicleWeekdays = "Heavy Vehicle (Weekdays)";
    	private String visbleTextHeavyVehicleSaturday = "Heavy Vehicle (Saturday)";
    	private String visbleTextVeryHeavhVehicleWeekdays = "Very Heavh Vehicle (Weekdays)";
    	private String visbleTextVeryHeavhVehicleSaturday = "Very Heavh Vehicle (Saturday)";

    	
    	public String getPlaceHolder()
    	{
    		return txtplaceholder;

    	}

    	public String getPlaceHolderforCamera()
    	{
    		return txtplaceholdercamera;

    	}

    	public String getPlaceHolderforTolls()
    	{
    		return txtplaceholdertoll;

    	}


}
