## This git repo consists of source code for weather.sg website:


## Programming language
- Java 

## The Tools used to automate this web application are :
	 • Selenium Webdriver - For automating the scripts
	 • Eclipse - For IDE
	 • TestNG - For Framework 
	 • Maven - Build Tool -POM

## Steps being Automated:
1. Access to home page of Meteorological Service Singapore, http://www.weather.gov.sg
2. Go to 4-Day Outlook page
3. Send a request using 4-Day Weather Forecast API endpoint. from https://data.gov.sg/dataset/weather-forecast)
4. Check the request response status is whether successful or not
5. Extract the temperatures of the day after tomorrow from the API response, and verify whether it match the temperatures of the day after tomorrow display

## Pre-requisites:

1. Install Java JDK and Setup path
2. Downlaod Selenium webdriver jar( Also added as Maven Dependency)
3. Install Eclipse IDE , Download Maven

## Steps to run this Project :
	• Download GitBash -[GitHub](https://git-scm.com/downloads) and set up Git for first time
	• Create a folder and clone this Repository to your local directory 
	• Open from Eclipse IDE and import as Maven the project 
	
