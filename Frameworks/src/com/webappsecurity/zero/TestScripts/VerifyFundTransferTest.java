package com.webappsecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.*;

import utils.GenericMethod;

public class VerifyFundTransferTest extends Base {
	
	@Test
	public void verifyTransferFunds() throws IOException {
	
		Login lp = new Login(driver);
        AccountSummary as = new AccountSummary(driver);
        TransferFunds tf = new TransferFunds(driver);
        TransferFundsVerify tfv = new TransferFundsVerify(driver);
        TransferFundsConfirmation tfc = new TransferFundsConfirmation(driver);
        
        String[][] data = GenericMethod.getData("C:\\Projects\\POM\\TestData.xlsx", "Sheet1");
        
        for (int i = 1; i < data.length; i++) {
        lp.loginApplication(data[i][0], data[i][1] );
        as.clickTransferFunds();
        tf.fundTransfer(data[i][2], data[i][3]);
        tfv.verifyTransferFunds();
        String actualText = tfc.confirmText();
        String expectedText = data[i][4];
        Assert.assertEquals(actualText, expectedText);
        tfc.clickLogout();
        driver.navigate().to("http://zero.webappsecurity.com/login.html");
        }
        
  }

}
