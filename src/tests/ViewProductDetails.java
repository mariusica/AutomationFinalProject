package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.URL;

public class ViewProductDetails extends BaseTest {
	
	@Test
	public void viewProductDetails() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.chooseTShirt();
		Assert.assertEquals("Test.allTheThings() T-Shirt (Red)", page.shopping.getTShirtDetails());
	}

}
