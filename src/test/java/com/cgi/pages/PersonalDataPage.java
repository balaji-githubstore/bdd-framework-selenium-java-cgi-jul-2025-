package com.cgi.pages;

import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

public class PersonalDataPage extends WebDriverKeywords{

	private final WebDriver driver;

	public PersonalDataPage(AutomationHooks hooks) {
		super(hooks.driver);
		this.driver = hooks.driver;
	}
	
}
