package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.CheckOut;
import messages.Shopping;
import messages.URL;

public class ValidateSenderInvalidData extends BaseTest {
	
	@Test
	public void validateSenderInvalidData() {		
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.addToCartBikeLight();
		
		page.shopping.enterTheCart();
		Assert.assertEquals(Shopping.CART_TITLE, page.shopping.getCartBadge());	
		Assert.assertEquals(Shopping.ITEM_NAME1, page.shopping.getInventory1Name());
		
		page.shopping.checkout();
		Assert.assertEquals(CheckOut.CHECKOUT_TITLE, page.checkout.getCheckoutTitle());
		
		page.checkout.makeWrongBooking();
		Assert.assertEquals(CheckOut.COMPLETE_CHECKOUT_ERROR, page.checkout.getCheckoutError());
		Assert.assertEquals(CheckOut.COMPLETE_CHECKOUT, page.checkout.getCompleteTitle());
	}

}
