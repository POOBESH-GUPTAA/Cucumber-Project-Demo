package org.stepdefenition;


import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLlogin extends BaseClass{
	
	@Given("To launch the chrome brwoser and maximize window")
	public void to_launch_the_chrome_brwoser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
		launchUrl("");
	}

	@When("TO pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	}

	@When("User has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String string) {
	}

}
