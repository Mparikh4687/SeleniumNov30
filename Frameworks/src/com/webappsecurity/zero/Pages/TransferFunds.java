package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	@FindBy(id = "tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy(id = "tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id = "tf_amount")
	private WebElement amnt;
	
	@FindBy(id = "tf_description")
	private WebElement desc;
	
	@FindBy(id = "btn_submit")
	private WebElement subBtn;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fundTransfer(String Amount, String Description) {
		Select fdd = new Select(fromAcc);
		fdd.selectByIndex(2);
		
		Select tdd = new Select(toAcc);
		tdd.selectByIndex(3);
		
		amnt.sendKeys(Amount);
		
		desc.sendKeys(Description);
		
		subBtn.click();
		
		
	}

}
