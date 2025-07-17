package com.cgi.pages;

import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;

public class PersonalDataPage {

	private final WebDriver driver;

	public PersonalDataPage(AutomationHooks hooks) {
		this.driver = hooks.driver;
	}
	
}
