package com.cgi.pages;

import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;

/**
 * All menu and common elements will be handled here
 */
public class MainPage {
	
	private final WebDriver driver;
	
	public MainPage(AutomationHooks hooks)
	{
		this.driver=hooks.driver;
	}

}
