package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

public class DashboardPage extends WebDriverKeywords{

	private By timeAtWorkLocator = By.xpath("//p[contains(normalize-space(),'at Work')]");

	private final WebDriver driver;

	public DashboardPage(AutomationHooks hooks) {
		super(hooks.driver);
		this.driver = hooks.driver;
	}

	public String getTimeAtWorkText() {
		return driver.findElement(timeAtWorkLocator).getText();
	}
}
