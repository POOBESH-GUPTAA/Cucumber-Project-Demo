package org.stepdefenition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass{
	
	@Before
	private void precondition() {
		launchBrowser();
		windowMaximize();
	}
	
	@After 
	private void postcondition() {
		closeEntireBrowser();
	}

}
