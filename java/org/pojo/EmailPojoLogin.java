package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPojoLogin extends BaseClass{
	public EmailPojoLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement requestOTP;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getRequestOTP() {
		return requestOTP;
	}
	public void setRequestOTP(WebElement requestOTP) {
		this.requestOTP = requestOTP;
	}
	

}