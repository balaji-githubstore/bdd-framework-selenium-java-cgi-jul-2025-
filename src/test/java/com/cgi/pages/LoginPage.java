package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords{

	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By errorLocator = By.xpath("//p[contains(normalize-space(),'Invalid')]");

	private final WebDriver driver;

	public LoginPage(AutomationHooks hooks) {
		super(hooks.driver);
		this.driver = hooks.driver;
	}
	
	public void navigateToBaseUrl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	public void enterUsername(String username) {
		//driver.findElement(usernameLocator).sendKeys(username);
		super.sendTextToElement(usernameLocator, username);
	}

	public void enterPassword(String password) {
		//driver.findElement(passwordLocator).sendKeys(password);
		super.sendTextToElement(passwordLocator, password);
	}

	public void clickOnLogin() {
//		driver.findElement(loginLocator).click();
		super.clickOnElement(loginLocator);
	}

	public String getInvalidErrorMessage() {
//		return driver.findElement(errorLocator).getText();
		return super.getTextFromElement(errorLocator);
	}

	public String getUsernamePlaceholder() {
//		return driver.findElement(usernameLocator).getAttribute("placeholder");
		return super.getAttributeValueFromElement(usernameLocator, "placeholder");
	}

}
