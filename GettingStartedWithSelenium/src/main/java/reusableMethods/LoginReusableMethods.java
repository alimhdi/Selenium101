package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import linkedInInputData.LoginPageInputData;
import linkedinUIelementLocator.LoginUiElementLocator;
import projectConfiguration.SetupBrowserConfiguration;

public class LoginReusableMethods {

	LoginPageInputData loginCredentials = new LoginPageInputData();
	SetupBrowserConfiguration browserConfig = new SetupBrowserConfiguration();
	LoginUiElementLocator loginWebElements = new LoginUiElementLocator();
	
	public void processLogin(WebDriver driver, LoginUiElementLocator loginWebElements, LoginPageInputData loginCredentials ) {	
		driver.get(browserConfig.getBaseUrl());
		driver.findElement(By.id(loginWebElements.getUsernameWebElement())).sendKeys(loginCredentials.getUsername());
		driver.findElement(By.id(loginWebElements.getPasswordWebElement())).sendKeys(loginCredentials.getPassword());
		driver.findElement(By.xpath(loginWebElements.getSubmitButtonWebElement())).click();
	}
	
}