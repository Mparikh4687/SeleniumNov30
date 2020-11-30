package keyWordDriven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethod;

public class Application {
	
	@Test
	
	public void verifyInvalidLogin() throws IOException {
		
		Methods mtd = new Methods();
		
		String[][] data = GenericMethod.getData("C:\\Projects\\POM\\TestData.xlsx", "Sheet2");
		
		for (int i = 1; i < data.length; i++) {
			
			switch(data[i][3]) {
			
			case "openBrowser":
				mtd.openingBrowser();
				break;
				
			case "maxBrowser":
				mtd.maximizeBrowser();
				break;
				
			case "impWait":
				mtd.implementImpWait();
				break;
				
			case "openApplication":
				mtd.openingApplication(data[i][6]);
				break;
				
			case "enterInText":
				mtd.enteringText(data[i][5], data[i][6]);
				break;
				
			case "clickButton":
				mtd.clickOnButton(data[i][4], data[i][5]);
				break;
				
			case "verifyMessage":
				String actualText = mtd.getErrorMsg(data[i][4], data[i][5]);
				String expectedText = data[i][6];
				Assert.assertEquals(actualText, expectedText);
				break;
				
			case "closeApplication":
				mtd.closingApplication();
				break;	
			}
			
			
			
		}
	}
	
	
}




