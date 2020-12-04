package com.automationpractice.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.Pages.*;

import utils.GenericReadExcel;

public class PlaceOrderTest extends Base {
	
	@Test
	public void verifyPlaceOrder() throws IOException {
		
		Homepage hp = new Homepage(driver);
		AccountCreateEmail ace = new AccountCreateEmail(driver);
		MyAccountPage map = new MyAccountPage(driver);
		
        String[][] data = GenericReadExcel.getData("C:\\Projects\\WalmartProducts\\WalmartProducts.xlsx", "Sheet2");
		
		for (int i = 1; i <= 1; i++) {
		
		hp.clickSignIn();
		ace.signInApplication(data[i][0], data[i][3]);
		map.placingOrder(driver);
		boolean isConfTextPresent = map.getConfText();
		Assert.assertTrue(isConfTextPresent);
		}
		
	}

}
