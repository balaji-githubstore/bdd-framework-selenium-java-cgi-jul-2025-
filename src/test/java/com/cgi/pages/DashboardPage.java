package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;

public class DashboardPage {

	private By timeAtWorkLocator = By.xpath("//p[contains(normalize-space(),'at Work')]");

	private final WebDriver driver;

	public DashboardPage(AutomationHooks hooks) {
		this.driver = hooks.driver;
	}

	public String getTimeAtWorkText() {
		return driver.findElement(timeAtWorkLocator).getText();
	}
}
