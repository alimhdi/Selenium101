# Selenium101
This project really illustrates different ways of designing your selenium test. You can build everything in one class, or scale your tests by desiging/ foreseeing the best design approach. Depending on the requirements, the buisiness and the size of your coverate, you can choose to write everything in one class, or leverage the OOP skills and design your objects to best reflect a real interaction with the browser.
This is not a framework, this project is only hands on using java with selenium. Attached is a pdf document that has all you need to know to get you started with selenium> I call it Selenium Cheat Sheet(SE_Explore.pdf)

## Tools
* Maven
* Selenium Web Driver

## Requirements
* Maven 4
* Java 1.8+

The chrome driver is available in this repository. Make sure to create a folder in your C:\\ directory and name it Work(case sensitive) and drop the chromedriver.exe file inside this newly created folder. The test will then identify the driver file and execute tests successfully.

## Available Dependencies
* Selenium version 3.141.59

## Usage
### How to run your test from eclipse
Open the project in Eclipse or any other IDE, go to each class and run it as a java program.

### How to run your test from command line
Maven surefire plugin takes care of running your tests from the cmd. To run all the available tests, first you should open the command line, and type the following `mvn test`. Note that this command will execute a build and complile step before running the actual tests.
