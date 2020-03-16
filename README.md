# MapsynqAutomation
This git repository contains QA automation for the website: http://www.mapsynq.com/.

The Code/Programming language used is JAVA

The Tools used to automate this web application are :
Selenium Webdriver - For automating the scripts
Eclipse - For IDE
TestNG - For Framework 
Maven - Build Tool -POM

The following features  are implemented in this Project:
 Tests are runnable from the command line
 Tests are run against a configurable host, we have used http://www.mapsynq.com as the default
 Tests are configured to run on a various browser eg Chrome, FireFox, Safari , IE
 Tests are configurd to run on all OS combinations against a testing service eg: windows, MacOS
 Testing service credentials and all configuration settings are passed as environment variables
 Tests are configured to run in parallel
 The automation runs via the UI within a browser
 Solution produces a detailed and clean report file under target folder inside the solution

Steps to run this Project
Download GitBash - https://git-scm.com/downloads and set up Git for first time
Create a folder and clone this Repository to your local directory 
Open command prompt/Terminal and run this command: git clone https://github.com/ShobhithatestNG/MapsynqAutomation.git
once the Repository is downloaded in the local , go to working DIrectory 
Run the maven commands:
maven command to run the project through command line by passing arguments:
chrome mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="chrome" -DxmlFileName=testng.xml

Firefox mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="firefox" -DxmlFileName=testng.xml

Safari mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="safari" -DxmlFileName=testng.xml
