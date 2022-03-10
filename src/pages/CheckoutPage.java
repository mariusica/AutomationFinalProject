package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import messages.CheckOut;

public class CheckoutPage {
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By checkoutTitle = By.xpath("//span[@class=\"title\"]");
	private By firstName = By.xpath("//input[@data-test=\"firstName\"]");
	private By lastName = By.xpath("//input[@data-test=\"lastName\"]");
	private By postalCode = By.xpath("//input[@data-test=\"postalCode\"]");
	private By submit = By.xpath("//input[@data-test=\"continue\"]");
	private By finish = By.xpath("//button[@data-test=\"finish\"]");
	private By checkoutComplete = By.xpath("//span[@class=\"title\"]");
	private By checkoutOverview = By.xpath("//span[@class=\"title\"]");
	private By checkoutError = By.xpath("//h3[@data-test=\"error\"]");
	
	public String getCheckoutTitle() {
		return driver.findElement(checkoutTitle).getText();
	}	
	public void sendFirstName() {
		driver.findElement(firstName).sendKeys(CheckOut.FIRST_NAME);
	}
	public void sendWrongFirstName() {
		driver.findElement(firstName).sendKeys(CheckOut.WRONG_FIRST_NAME);
	}
	public void sendLastName() {
		driver.findElement(lastName).sendKeys(CheckOut.LAST_NAME);
	}
	public void sendWrongLastName() {
		driver.findElement(lastName).sendKeys(CheckOut.WRONG_LAST_NAME);
	}
	public void sendPostalCode() {
		driver.findElement(postalCode).sendKeys(CheckOut.POSTAL_CODE);
	}
	public void sendWrongPostalCode() {
		driver.findElement(postalCode).sendKeys(CheckOut.WRONG_POSTAL_CODE);
	}
	public String getCheckoutError() {
		return driver.findElement(checkoutError).getText();
	}
	public void submit() {
		driver.findElement(submit).click();
	}
	public void makeBooking() {
		sendFirstName();
		sendLastName();
		sendPostalCode();
		submit();
	}
	public void makeWrongBooking() {
		sendWrongFirstName();
		sendWrongLastName();
		sendWrongPostalCode();
		submit();
	}
	public void finish() {
		driver.findElement(finish).click();
	}
	public String getCompleteTitle () {
		return driver.findElement(checkoutComplete).getText();
	}
	public String getOverviewTitle() {
		return driver.findElement(checkoutOverview).getText();
	}

}
