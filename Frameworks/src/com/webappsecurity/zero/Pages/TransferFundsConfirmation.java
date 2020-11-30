package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	@FindBy(css = "#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement verText;
	
	@FindBy(css = "#settingsBox > ul > li:nth-child(3) > a")
	private WebElement useName;
	
	@FindBy(linkText = "Logout")
	private WebElement logout;
	
	public TransferFundsConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmText() {
		String getText = verText.getText();
		return getText;
	}
	
	public void clickLogout() {
		useName.click();
		logout.click();
	}

}
