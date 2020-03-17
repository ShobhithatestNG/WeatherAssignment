# MapsynqAutomation
This git repository contains QA automation for the website: http://www.mapsynq.com/.

The Programming language used is Java 

The Tools used to automate this web application are :
	- • Selenium Webdriver - For automating the scripts
	- • Eclipse - For IDE
	- • TestNG - For Framework 
	- • Maven - Build Tool -POM

The following features  are implemented in this Project:
	1.  Tests are runnable from the command line
	2.  Tests are run against a configurable host, we have used http://www.mapsynq.com as the default
	3.  Tests are configured to run on a various browser eg Chrome, FireFox, Safari , IE
	4.  Tests are configured to run on all OS combinations against a testing service eg: windows, MacOS
	5.  Testing service credentials and all configuration settings are passed as environment variables
	6.  Tests are configured to run in parallel
	7.  The automation runs via the UI within a browser
	8.  Solution produces a detailed and clean report file under target folder inside the solution
	9.  Screenshots are captured in Test-output
	10.  Exceptions are handled

Steps to run this Project :
	• Download GitBash - https://git-scm.com/downloads and set up Git for first time
	• Create a folder and clone this Repository to your local directory 
	• Open command prompt/Terminal and run this command: git clone https://github.com/ShobhithatestNG/MapsynqAutomation.git
	• once the Repository is downloaded in the local , go to working Directory 

Run the maven commands:
maven command to run the project through command line by passing arguments:
chrome mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="chrome" -DxmlFileName=testng.xml

Firefox mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="firefox" -DxmlFileName=testng.xml

Safari mvn clean test -Durl="http://www.mapsynq.com/" -Dbrowser="safari" -DxmlFileName=testng.xml
