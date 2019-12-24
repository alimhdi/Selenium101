package executeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import linkedInInputData.LoginPageInputData;
import linkedinUIelementLocator.LoginUiElementLocator;
import projectConfiguration.SetupBrowserConfiguration;

public class Linkedin_Login_Test_Moderate {


	public static void main(String[] args) {
	
	
		SetupBrowserConfiguration browseUrl = new SetupBrowserConfiguration(); 
		WebDriver driver = browseUrl.getChromeDriver();
		LoginPageInputData login = new LoginPageInputData();
		LoginUiElementLocator loginWebElements = new LoginUiElementLocator();
			
		
		browseUrl.setBaseUrl("https://www.linkedin.com/login");
		login.setUsername("Insert Username Here");
		login.setPassword("Insert Password Here");
	
		driver.get(browseUrl.getBaseUrl());
		driver.findElement(By.id(loginWebElements.getUsernameWebElement())).sendKeys(login.getUsername());
		driver.findElement(By.id(loginWebElements.getPasswordWebElement())).sendKeys(login.getPassword());
		driver.findElement(By.xpath(loginWebElements.getSubmitButtonWebElement())).click();
		
		
		driver.quit();



	}

}