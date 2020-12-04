package com.automationpractice.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.Pages.*;

import utils.GenericReadExcel;

public class SuccessMessageTest extends Base {
	
	@Test
	
	public void verifyMessage() throws IOException {
		
		Homepage hp = new Homepage(driver);
		AccountCreateEmail ace = new AccountCreateEmail(driver);
		AccountCreateInfo aci = new AccountCreateInfo(driver);
		MyAccountPage map = new MyAccountPage(driver);
		
		String[][] data = GenericReadExcel.getData("C:\\Projects\\WalmartProducts\\WalmartProducts.xlsx", "Sheet2");
		
		for (int i = 1; i <= 1; i++) {
			
			hp.clickSignIn();
			ace.enteringEmail(data[i][0]);
			aci.enteringInfo(data[i][1], data[i][2], data[i][3], data[i][4], data[i][5], data[i][6], data[i][7]);
			String actualMsg = map.verifySuccessMsg();
			String expectedMsg = data[i][8];
			Assert.assertEquals(actualMsg, expectedMsg);
		}
		
		
	}

}
