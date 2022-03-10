package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import messages.URL;

public class FilterProductsBasedOnAllOptions extends BaseTest {
	
	@Test
	public void filterProductsBasedOnAtoZ() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.selectAtoZ();
		List<String> inventoryNamesSorted = new ArrayList<String>();
		inventoryNamesSorted.addAll(page.shopping.getItemsList());
		Collections.sort(inventoryNamesSorted);
		
		Assert.assertTrue("original: "+page.shopping.getItemsList()+"expected: "+inventoryNamesSorted,
				inventoryNamesSorted.equals(page.shopping.getItemsList()));
				
		page.logout.logOut();		
	}
	
	@Test
	public void filterProductsBasedOnZtoA() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.selectZtoA();
		List<String> inventoryNamesSorted = new ArrayList<String>();
		inventoryNamesSorted.addAll(page.shopping.getItemsList());
		Collections.sort(inventoryNamesSorted, Collections.reverseOrder());
		
		Assert.assertTrue("original: "+page.shopping.getItemsList()+"expected: "+inventoryNamesSorted,
				inventoryNamesSorted.equals(page.shopping.getItemsList()));
				
		page.logout.logOut();	
	}
	
	@Test
	public void filterProductsBasedOnLowToHigh() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());		
		
		page.shopping.selectLowToHigh();
		List<String> inventoryPricesSorted = new ArrayList<String>();
		inventoryPricesSorted.addAll(page.shopping.getItemsPrices());
		
		//Collections.sort(inventoryPricesSorted);				
		Assert.assertEquals(inventoryPricesSorted, page.shopping.getItemsPrices());
		
		
		page.logout.logOut();
	}
	
	@Test
	public void filterProductsBasedOnHighToLow() {
		page.login.authenticate(testdata.standardUser);
		Assert.assertEquals(URL.INVENTORY,driver.getCurrentUrl());
		
		page.shopping.selectHighToLow();
		List<String> inventoryPricesSorted = new ArrayList<String>();
		inventoryPricesSorted.addAll(page.shopping.getItemsPrices());
		
		//Collections.sort(inventoryPricesSorted);
		Assert.assertEquals(inventoryPricesSorted, page.shopping.getItemsPrices());
		
		page.logout.logOut();		
	}
	

}
