package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.URL;

public class LoginWithValidData extends BaseTest {
	
	@Test
	public void loginWithValidData() {
		
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());	
		
	}

}
