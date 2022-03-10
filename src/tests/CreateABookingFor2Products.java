package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.CheckOut;
import messages.Shopping;
import messages.URL;

public class CreateABookingFor2Products extends BaseTest {
	
	@Test
	public void createABookingForOneProduct() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.addToCartBikeLight();
		page.shopping.addToCartBoltTShirt();
		
		page.shopping.enterTheCart();
		Assert.assertEquals(Shopping.CART_TITLE, page.shopping.getCartBadge());	
		Assert.assertEquals(Shopping.ITEM_NAME1, page.shopping.getInventory1Name());
		Assert.assertEquals(Shopping.ITEM_NAME2, page.shopping.getInventory2Name());
		
		page.shopping.checkout();
		Assert.assertEquals(CheckOut.CHECKOUT_TITLE, page.checkout.getCheckoutTitle());
		
		page.checkout.makeBooking();
		Assert.assertEquals(CheckOut.CHECKOUT_OVERVIEW, page.checkout.getOverviewTitle());
		
		page.checkout.finish();
		Assert.assertEquals(CheckOut.COMPLETE_CHECKOUT, page.checkout.getCompleteTitle());
	}

}
