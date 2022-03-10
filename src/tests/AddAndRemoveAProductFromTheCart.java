package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.Shopping;
import messages.URL;

public class AddAndRemoveAProductFromTheCart extends BaseTest {
	
	@Test
	public void addAndRemoveAProductFromTheCart() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.addToCartBikeLight();
				
		page.shopping.enterTheCart();
		Assert.assertEquals(Shopping.CART_TITLE, page.shopping.getCartBadge());	
		Assert.assertEquals(Shopping.ITEM_NAME1, page.shopping.getInventory1Name());
		
		page.shopping.removeItem();
		Assert.assertEquals(Shopping.NOTHING, page.shopping.getRemovedItem());
		
		page.shopping.backToProducts();
		Assert.assertEquals(Shopping.PRODUCTS_TITLE, page.shopping.getProductsTitle());		
	}

}
