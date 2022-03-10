package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testdata.User;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	private By userNameInput = By.xpath("//form/div[1]/input");
	private By passwordInput = By.xpath("//form/div[2]/input");
	private By loginButton = By.xpath("//form/input");
	private By loginError = By.xpath("//div[@class=\"error-message-container error\"]");

	
	public void enterUserName(String username) {
		driver.findElement(userNameInput).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	public String getLoginErrorMessage() {
		return driver.findElement(loginError).getText();
	}
	public void authenticate(User user) {
		enterUserName(user.getUserName());
		enterPassword(user.getPassword());
		clickLogin();
	}


	

}
