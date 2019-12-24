package executeTest;

import org.openqa.selenium.WebDriver;

import linkedInInputData.LoginPageInputData;
import linkedinUIelementLocator.LoginUiElementLocator;
import projectConfiguration.SetupBrowserConfiguration;
import reusableMethods.LoginReusableMethods;

public class Linkedin_Login_Test_Enterprise {


	public static void main(String[] args) {
	
	
		SetupBrowserConfiguration browseUrl = new SetupBrowserConfiguration(); 
		WebDriver driver = browseUrl.getChromeDriver();
		//WebDriver driver = new ChromeDriver();

		LoginPageInputData loginCredential = new LoginPageInputData();
		LoginUiElementLocator loginWebElements = new LoginUiElementLocator();
		LoginReusableMethods login = new LoginReusableMethods();
		
		login.processLogin(driver, loginWebElements, loginCredential);
		
		driver.quit();

	}

	
}	