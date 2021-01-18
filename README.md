# WeatherAssignment
This git repo consists of source code for weather.sg website:
1. Access to home page of Meteorological Service Singapore, http://www.weather.gov.sg
2. Go to 4-Day Outlook page 
3. Send a request using 4-Day Weather Forecast API endpoint.  from https://data.gov.sg/dataset/weather-forecast)
4. Check the request response status is whether successful or not
5. Extract the temperatures of the day after tomorrow from the API response, and verify whether it match the temperatures of the day after tomorrow display

To Execute :
Clone the repository
Install Eclipse IDE - and import as Maven the project

Pre-requisites:
1. Install JAva JDK
2. Install webdriver

The Project Structure is as follows:
 
 1. Automation Modules
  a.APItest.java
  b.ForecastTableFunctions.java
  c.HomePageFunctions.java
  d.LaunchBrowser.java
 
 2.PageObjects
  Mainpage.java
 
 3.Utility
  a.browserseelction.java
  b.constant.java
  c.Createfolder.java
  
 4.Validations
  a.HomePagevalidation.java
  
 5.pom.xml

 6.testng.xml
