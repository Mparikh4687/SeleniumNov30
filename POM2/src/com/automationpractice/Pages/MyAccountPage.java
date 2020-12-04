package com.automationpractice.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	@FindBy(css = ".info-account")
	private WebElement text;
	
	@FindBy(linkText = "Sign out")
	private WebElement sOut;
	
	@FindBy(css = ".sf-menu > li:nth-child(1)")
	private WebElement wBtn;
	
	@FindBy(css = ".sf-menu > li:nth-child(2)")
	private WebElement dBtn;
	
	@FindBy(css = ".sf-menu > li:nth-child(3)")
	private WebElement tBtn;
	
	@FindBy(linkText = "Summer Dresses")
	private WebElement sDress;
	
	@FindBy(css = "li.ajax_block_product:nth-child(3) > div:nth-child(1) > div:nth-child(1)")
	private WebElement image;
	
	@FindBy(css = "li.ajax_block_product:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1)")
	private WebElement addToCart;
	
	@FindBy(css = ".continue")
	private WebElement cont;
	
	@FindBy(linkText = "EVENING DRESSES")
	private WebElement eDress;
	
	@FindBy(css = ".product_img_link > img:nth-child(1)")
	private WebElement image1;
	
	@FindBy(css = ".ajax_add_to_cart_button")
	private WebElement addToCart1;
	
	@FindBy(css = ".continue")
	private WebElement cont1;
	
	@FindBy(css = ".product_img_link > img:nth-child(1)")
	private WebElement image2;
	
	@FindBy(css = ".ajax_add_to_cart_button")
	private WebElement addToCart2;
	
	@FindBy(css = "a.button-medium")
	private WebElement ptCheck;  
	
	@FindBy(css = ".standard-checkout")
	private WebElement sCheck;
	
	@FindBy(css = "button.button:nth-child(4)")
	private WebElement ptCheck1;
	
	@FindBy(css = "#cgv")
	private WebElement cBox;
	
	@FindBy(name = "processCarrier")
	private WebElement ptCheck2;
	
	@FindBy(css = ".bankwire")
	private WebElement bWire;
	
	@FindBy(css = "button.button-medium")
	private WebElement cOrder;
	
	@FindBy(css = ".cheque-indent > strong:nth-child(1)")
	private WebElement cText;
	
	public MyAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifySuccessMsg() {
		String sucMsg = text.getText();
		return sucMsg;
	}
	
	public void clickSignOut() {
		sOut.click();
	}
	public boolean verifyLogoffMenu() {
		boolean logOffMenu = sOut.isDisplayed();
		return logOffMenu;
		
	}
	
	public void placingOrder(WebDriver driver) {
		
		Actions hover = new Actions(driver);
		hover.moveToElement(wBtn).perform();
		sDress.click();
		
		Actions hover1 = new Actions(driver);
		hover1.moveToElement(image).perform();
		addToCart.click();
		cont.click();
		
		Actions hover2 = new Actions(driver);
		hover2.moveToElement(dBtn).perform();
		eDress.click();
		
		Actions hover3 = new Actions(driver);
		hover3.moveToElement(image1).perform();
		addToCart1.click();
		cont1.click();
		
		tBtn.click();
		
		Actions hover4 = new Actions(driver);
		hover4.moveToElement(image2).perform();
		addToCart2.click();
		ptCheck.click(); 
		
		sCheck.click();
		
		ptCheck1.click();
		
		cBox.click();
		ptCheck2.click();
		
		bWire.click();
		
		cOrder.click();
		
	   }
	
	public boolean getConfText() {
		boolean confText = cText.isDisplayed();
	    return confText;
	}

}
