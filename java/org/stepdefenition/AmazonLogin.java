package org.stepdefenition;

import org.base.BaseClass;
import org.pojo.AmazonPojologin;

import cucumber.api.java.en.When;

public class AmazonLogin  extends BaseClass{
	
	
	AmazonPojologin a;
	
	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl("https://www.amazon.in/");
	}

	@When("To click the accountInfo button")
	public void to_click_the_accountInfo_button() {
		a = new AmazonPojologin();
		clickBtn(a.getAccountInfo()); 
	}


	@When("To click signin button")
	public void to_click_signin_button() {
		a = new AmazonPojologin();
		clickBtn(a.getSigninBtn());
	}

	@When("TO enter the username in email field")
	public void to_enter_the_username_in_email_field() {
	    a = new AmazonPojologin();
	    passText("poobesh1@gmail.com", a.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		a = new AmazonPojologin();
		clickBtn(a.getConTinue());
	}


}
