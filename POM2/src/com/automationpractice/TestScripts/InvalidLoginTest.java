package com.automationpractice.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationpractice.Pages.*;

import utils.GenericReadExcel;

public class InvalidLoginTest extends Base {
	
	@Test
	
	public void verifyErrorMsg() throws IOException {
		Homepage hp = new Homepage(driver);
		AccountCreateEmail ace = new AccountCreateEmail(driver);
		
		String[][] data = GenericReadExcel.getData("C:\\Projects\\WalmartProducts\\WalmartProducts.xlsx", "Sheet2");
		
		for (int i = 2; i <= 2; i++) {
			
			hp.clickSignIn();
			ace.signInApplication(data[i][0], data[i][3]);
			String actualMsg = ace.ErrorMsgVerify();
			String expectedMsg = data[i][9];
			Assert.assertEquals(actualMsg, expectedMsg);
		}
		
		
	}

}
