package keyWordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	WebDriver driver;
	public void openingBrowser() {
		driver = new ChromeDriver();
	}
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	public void implementImpWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void openingApplication(String url) {
		driver.get(url);
	}
	
	public void enteringText(String locValue, String data) {
		driver.findElement(By.id(locValue)).sendKeys(data);
	}
	
	public void clickOnButton(String loc, String locValue) {
		if (loc.equals("name")) {
			driver.findElement(By.name(locValue)).click();
		}
		else if (loc.equals("cssSelector")) {
			driver.findElement(By.cssSelector(locValue)).click();
		}
		
	}
	
	public String getErrorMsg(String loc, String locValue) {
		String errorText = null;
		if(loc.equals("cssSelector")) {
			errorText = driver.findElement(By.cssSelector(locValue)).getText();
		}
		else if(loc.equals("id")) {
			errorText = driver.findElement(By.id(locValue)).getText();
		}
		return errorText;
		
	}
	
	public void closingApplication() {
		driver.close();
	}

}
