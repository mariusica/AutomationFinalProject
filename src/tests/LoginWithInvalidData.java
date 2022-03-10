package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.Login;
import messages.URL;



public class LoginWithInvalidData extends BaseTest {
	
	@Test
	public void loginWithInvalidData() {
		testdata.standardUser.setPassword("secretsauce");
		page.login.authenticate(testdata.standardUser);

		Assert.assertEquals(Login.WRONG_CREDENTIALS_ERROR, page.login.getLoginErrorMessage());
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
	}

}
