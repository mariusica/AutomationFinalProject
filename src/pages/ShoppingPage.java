package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingPage {
	
	WebDriver driver;
	
	public ShoppingPage(WebDriver driver) {
		this.driver = driver;
	}
	private By bikeLight = By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-bike-light\"]");
	private By boltTShirt = By.xpath("//button[@data-test=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	private By shoppingCartContainer = By.xpath("//div[@class=\"shopping_cart_container\"]");
	private By inventoryItem1Name = By.xpath("//a[@id=\"item_0_title_link\"]/div[@class=\"inventory_item_name\"]");
	private By inventoryItem2Name = By.xpath("//a[@id=\"item_1_title_link\"]/div[@class=\"inventory_item_name\"]");
	private By removeItemButton = By.xpath("//button[@data-test=\"remove-sauce-labs-bike-light\"]");
	private By removedCartItem = By.xpath("//div[@class=\"removed_cart_item\"]");
	private By cartBadge = By.xpath("//span[@class=\"title\"]");
	private By continueShopping = By.xpath("//button[@data-test=\"continue-shopping\"]");
	private By productsTitle = By.xpath("//span[@class=\"title\"]");
	private By tShirt = By.xpath("//div[@class=\"inventory_list\"]/div[6]/div[2]/div/a/div");
	private By tShirtDetails = By.xpath("//div[@class=\"inventory_details_name large_size\"]");
	private By sortSelect = By.xpath("//select");
	private By firstOption = By.xpath("//select/option[1]");
	private By secondOption = By.xpath("//select/option[2]");
	private By thirdOption = By.xpath("//select/option[3]");
	private By fourthOption = By.xpath("//select/option[4]");
	private By checkoutButton = By.name("checkout");
	private By inventoryItemsNames = By.xpath("//div[@class=\"inventory_item_name\"]");
	private By inventoryItemsPrices = By.xpath("//div[@class=\"inventory_item_price\"]");
	
	public void addToCartBikeLight() {
		driver.findElement(bikeLight).click();
	}
	public void addToCartBoltTShirt() {
		driver.findElement(boltTShirt).click();
	}
	public void enterTheCart() {
		driver.findElement(shoppingCartContainer).click();
	}
	public String getCartBadge() {
		return driver.findElement(cartBadge).getText();
	}
	public String getInventory1Name() {
		return driver.findElement(inventoryItem1Name).getText();
	}
	public String getInventory2Name() {
		return driver.findElement(inventoryItem2Name).getText();
	}
	public void removeItem() {
		driver.findElement(removeItemButton).click();
	}
	public String getRemovedItem() {
		return driver.findElement(removedCartItem).getText();
	}
	public void backToProducts() {
		driver.findElement(continueShopping).click();
	}
	public String getProductsTitle() {
		return driver.findElement(productsTitle).getText();
	}
	public void chooseTShirt() {
		driver.findElement(tShirt).click();
	}
	public String getTShirtDetails() {
		return driver.findElement(tShirtDetails).getText();
	}
	public void selectAtoZ() {
		driver.findElement(sortSelect).click();
		driver.findElement(firstOption).click();		
	}
	public void selectZtoA() {
		driver.findElement(sortSelect).click();
		driver.findElement(secondOption).click();
	}
	public void selectLowToHigh() {
		driver.findElement(sortSelect).click();
		driver.findElement(thirdOption).click();
	}
	public void selectHighToLow() {
		driver.findElement(sortSelect).click();
		driver.findElement(fourthOption).click();
	}
	public void checkout() {
		driver.findElement(checkoutButton).click();
	}
	 
	public List<String> getItemsList(){
		List<WebElement> inventoryElements = driver.findElements(inventoryItemsNames);
		List<String> inventoryNames = new ArrayList<String>();
		
		for(WebElement item:inventoryElements) {
			if (!item.getText().isBlank()) {
				inventoryNames.add(item.getText());
			}	
		}
		return inventoryNames;
		
	}
	public List<String> getItemsPrices(){
		List<WebElement> inventoryElements = driver.findElements(inventoryItemsPrices);
		List<String> inventoryPrices = new ArrayList<String>();
		
		for(WebElement item:inventoryElements) {
			if (!item.getText().isBlank()) {
				inventoryPrices.add(item.getText().replace("$",""));
			}	
		}
		return inventoryPrices;
		
	}
	
	
	
	
	

}
