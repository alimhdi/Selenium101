package projectConfiguration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupBrowserConfiguration {
	
	String baseUrl = "https://www.linkedin.com/login";
	WebDriver chromeDriver= null;
	
	public SetupBrowserConfiguration() {
		// Invoke .exe file to successfully perform action on the browser once opened. 
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		// Instantiating a driver object . this object will allow calling all webelement actions
		//chromeDriver  = new ChromeDriver(); // Do Not instantiate here otherwise 2 browser sessions will open
	}

	public void setWebDriver(WebDriver chromeDriver) {
		this.chromeDriver = chromeDriver;
	}
	public WebDriver getChromeDriver() {
		chromeDriver  = new ChromeDriver();
		return chromeDriver;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
}