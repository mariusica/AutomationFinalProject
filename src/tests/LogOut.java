package tests;

import org.junit.Assert;
import org.junit.Test;

import messages.URL;

public class LogOut extends BaseTest {
	
	@Test
	public void logOut() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.logout.logOut();
		Assert.assertEquals(URL.LOGIN,driver.getCurrentUrl());
		
	}
	
	

}
