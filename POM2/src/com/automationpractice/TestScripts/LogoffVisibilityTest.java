package com.automationpractice.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.Pages.AccountCreateEmail;
import com.automationpractice.Pages.AccountCreateInfo;
import com.automationpractice.Pages.Homepage;
import com.automationpractice.Pages.MyAccountPage;

import utils.GenericReadExcel;

public class LogoffVisibilityTest extends Base{
	
	@Test
	
	public void verifyLogoffBtn() throws IOException {
		
		Homepage hp = new Homepage(driver);
		AccountCreateEmail ace = new AccountCreateEmail(driver);
		AccountCreateInfo aci = new AccountCreateInfo(driver);
		MyAccountPage map = new MyAccountPage(driver);
		
        String[][] data = GenericReadExcel.getData("C:\\Projects\\WalmartProducts\\WalmartProducts.xlsx", "Sheet2");
		
		for (int i = 3; i <= 3; i++) {

		     hp.clickSignIn();
		     ace.enteringEmail(data[i][0]);
		     aci.enteringInfo(data[i][1], data[i][2], data[i][3], data[i][4], data[i][5], data[i][6], data[i][7]);
		     map.clickSignOut();
		     ace.signInApplication(data[i][0], data[i][3]);
		     boolean isBtnPresent = map.verifyLogoffMenu();
		     Assert.assertTrue(isBtnPresent);
	}

 }
	
}
