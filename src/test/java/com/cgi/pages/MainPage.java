package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;

/**
 * All menu and common elements will be handled here
 */
public class MainPage {
	
	private By pimLocator=By.xpath("//span[text()='PIM']");
	
	private final WebDriver driver;
	
	public MainPage(AutomationHooks hooks)
	{
		this.driver=hooks.driver;
	}
	
	public void clickOnPIMMenu()
	{
		driver.findElement(pimLocator).click();
	}

}
