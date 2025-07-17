package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;

public class LoginPage {

	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

	private final WebDriver driver;

	public LoginPage(AutomationHooks hooks) {
		this.driver = hooks.driver;
	}
	
	public void navigateToBaseUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public String getInvalidErrorMessage() {
		return driver.findElement(errorLocator).getText();
	}

	public String getUsernamePlaceholder() {
		return driver.findElement(usernameLocator).getAttribute("placeholder");
	}

}
