package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojologin extends BaseClass{
	
	public void AmazounPojologin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "\"//a[@id='nav-link-accountList']\"")
	private WebElement accountInfo;
	
	@FindBy(xpath = "(//span[text()='Sign in'])[1]")
    private WebElement signinBtn;
	
	@FindBy(id = "ap_email")
	private WebElement email;
	
	@FindBy(id = "continue")
	private WebElement conTinue;
	
	public WebElement getAccountInfo() {
		return accountInfo;
	}

	public void setAccountInfo(WebElement accountInfo) {
		this.accountInfo = accountInfo;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public void setSigninBtn(WebElement signinBtn) {
		this.signinBtn = signinBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getConTinue() {
		return conTinue;
	}

	public void setConTinue(WebElement conTinue) {
		this.conTinue = conTinue;
	}

	
}
