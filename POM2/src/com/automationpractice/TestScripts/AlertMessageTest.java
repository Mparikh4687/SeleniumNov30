package com.automationpractice.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.Pages.*;

import utils.GenericReadExcel;

public class AlertMessageTest extends Base {
	
	@Test	
	
	public void verifyAlertMessage() throws IOException {
		
		Homepage hp = new Homepage(driver);
		AccountCreateEmail ace = new AccountCreateEmail(driver);
		AccountCreateInfo aci = new AccountCreateInfo(driver);
		
		String[][] data = GenericReadExcel.getData("C:\\Projects\\WalmartProducts\\WalmartProducts.xlsx", "Sheet2");
		
		for (int i = 2; i <= 2; i++) {
			
			hp.clickSignIn();
			ace.enteringEmail(data[i][0]);
			aci.enteringInfoMC(data[i][1], data[i][2], data[i][3], data[i][4], data[i][5], data[i][6], data[i][7]);
			boolean isAlertMsgPresent = aci.AlertMsgVerify();
			Assert.assertTrue(isAlertMsgPresent);
		}
		
		
	}

}
