package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreateEmail {
	
	@FindBy(id = "email_create")
	private WebElement email;
	
	@FindBy(id = "SubmitCreate")
	private WebElement cAcc;
	
	@FindBy(id = "email")
	private WebElement emailId;
	
	@FindBy(id = "passwd")
	private WebElement pass;
	
	@FindBy(id = "SubmitLogin")
	private WebElement subBtn;
	
	@FindBy(css = "#center_column > div:nth-child(2) > ol:nth-child(2) > li:nth-child(1)")
	private WebElement eMsg;
	
	public AccountCreateEmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteringEmail(String Email) {
		email.sendKeys(Email);
		cAcc.click();
	}
	
	public void signInApplication(String EmailAdd, String Password) {
		emailId.sendKeys(EmailAdd);
		pass.sendKeys(Password);
		subBtn.click();
	}
	public String ErrorMsgVerify() {
		String getErrorMsg = eMsg.getText();
		return getErrorMsg;
	}
	
	
}
