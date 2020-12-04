package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreateInfo {
	
	@FindBy(id = "customer_firstname")
	private WebElement fName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lName;
	
	@FindBy(id = "passwd")
	private WebElement pass;
	
	@FindBy(id = "address1")
	private WebElement add;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(id = "id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement pCode;
	
	@FindBy(id = "id_country")
	private WebElement country;
	
	@FindBy(id = "phone_mobile")
	private WebElement mPhone;
	
	@FindBy(id = "submitAccount")
	private WebElement reg;
	
	@FindBy(css = ".alert")
	private WebElement aMsg;
	
	public AccountCreateInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteringInfo(String FName, String LName, String Password, String Address, String City, String PCode, String MNumber) {
		fName.sendKeys(FName);
		lName.sendKeys(LName);
		pass.sendKeys(Password);
		add.sendKeys(Address);
		city.sendKeys(City);
		
		Select sdd = new Select(state);
		sdd.selectByIndex(4);
		
		pCode.sendKeys(PCode);
		
		mPhone.sendKeys(MNumber);
		
		reg.click();
	}
	
	public void enteringInfoMC(String FName, String LName, String Password, String Address, String City, String PCode, String mNumber) {
		
		fName.sendKeys(FName);
		lName.sendKeys(LName);
		pass.sendKeys(Password);
		add.sendKeys(Address);
		city.sendKeys(City);
		
		Select sdd = new Select(state);
		sdd.selectByIndex(4);
		pCode.sendKeys(PCode);
		
		Select cdd = new Select(country);
		cdd.selectByIndex(0);
		
		mPhone.sendKeys(mNumber);
		reg.click();
	}
	
	public boolean AlertMsgVerify() {
		boolean alertMsg = aMsg.isDisplayed();
		return alertMsg;
	}


}
