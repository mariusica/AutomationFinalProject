package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
	WebDriver driver;
	
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By openButton = By.xpath("//button[contains(.,\"Open Menu\")]");
	private By logOutLink = By.xpath("//a[contains(.,\"Logout\")]");
	
	public void clickOpenButton() {
		driver.findElement(openButton).click();		
	}
	public void clickLogOutButton() {
		driver.findElement(logOutLink).click();
	}
	public void logOut() {
		clickOpenButton();
		clickLogOutButton();
	}

}
