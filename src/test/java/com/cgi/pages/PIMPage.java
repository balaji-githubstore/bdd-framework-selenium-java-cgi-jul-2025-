package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

public class PIMPage extends WebDriverKeywords {

	private By addEmployeeLocator = By.xpath("//a[text()='Add Employee']");

	private final WebDriver driver;

	public PIMPage(AutomationHooks hooks) {
		super(hooks.driver);
		this.driver = hooks.driver;
	}

	public void clickOnAddEmployee() {
		driver.findElement(addEmployeeLocator).click();
	}
}
