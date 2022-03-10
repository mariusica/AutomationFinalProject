package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		
		login = new LoginPage(driver);
		logout = new LogOutPage(driver);
		shopping = new ShoppingPage(driver);
		checkout = new CheckoutPage(driver);
	}
	
	public LoginPage login;
	public LogOutPage logout;
	public ShoppingPage shopping;
	public CheckoutPage checkout;
	
	

}
