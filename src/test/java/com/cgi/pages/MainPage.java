package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

/**
 * All menu and common elements will be handled here
 */
public class MainPage extends WebDriverKeywords{
	
	private By pimLocator=By.xpath("//span[text()='PIM']");
	
	private final WebDriver driver;
	
	public MainPage(AutomationHooks hooks)
	{
		super(hooks.driver);
		this.driver=hooks.driver;
	}
	
	public void clickOnPIMMenu()
	{
		//driver.findElement(pimLocator).click();
		super.clickOnElement(pimLocator);
	}

}
