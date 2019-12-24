package executeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin_Login_Test_Beginner {
	
	public static void main(String[] args) {
		
		
		// Invoke .exe file to successfully perform action on the browser once opened. 
		// MAKE SURE YOU POINT IT TO THE EXE FILE ON YOUR DEVICE
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		// Instantiating a driver object . this object will allow calling all webelement actions
		WebDriver driver  = new ChromeDriver(); 
		
		//Identify Input Params
		String baseUrl = "https://www.linkedin.com/login";
		String username = "Test"; //Insert your username here
		String password = "Test"; //Insert your password here
		String title= "";
		
		// Navigate to desired URL
		driver.get(baseUrl);
		
		//Interact with Login Page
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='app__container']/main/div/form/div[3]/button")).click();
		
		title= driver.getTitle();
		//System.out.println(title);

		if(!title.equalsIgnoreCase("(1) LinkedIn")) {
			System.out.println("Failed, Title Missmatch");
		}
		
		driver.quit();
		
	}

}