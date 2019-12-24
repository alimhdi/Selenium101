package linkedinUIelementLocator;

public class LoginUiElementLocator {
	
	String username = "username";
	String password = "password";
	String singInButton = "//*[@id='app__container']/main/div/form/div[3]/button";

	// Setters to use in main when you need to overwrite the default value
	public void setUsernameWebElement(String username) {
		this.username = username;
	}
	
	public void setPasswordWebElement(String password) {
		this.password = password;
	}
	
	public void setSubmitButtonWebElement(String singInButton) {
		this.singInButton = singInButton;
	}
	
	// Getters identification for login UI elements
	public String getUsernameWebElement() {
		return username;
	}
	
	public String getPasswordWebElement() {
		return password;
	}
	
	public String getSubmitButtonWebElement() {
		return singInButton;
	}

}