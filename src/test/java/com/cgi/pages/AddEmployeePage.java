package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.AutomationHooks;
import com.cgi.base.WebDriverKeywords;

public class AddEmployeePage extends WebDriverKeywords {
	private By firstnameLocator=By.name("firstName");
	private By middlenameLocator=By.name("middleName");
	private By lastnameLocator=By.name("lastName");
	private By saveEmployeeLocator=By.xpath("//button[normalize-space()='Save']");
	
	
	private final WebDriver driver;

	public AddEmployeePage(AutomationHooks hooks) {
		super(hooks.driver);
		this.driver = hooks.driver;
	}
	
	
	public void fillEmployeeDetails(String firstname,String middlename,String lastname)
	{
		driver.findElement(firstnameLocator).sendKeys(firstname);
		driver.findElement(middlenameLocator).sendKeys(middlename);
		driver.findElement(lastnameLocator).sendKeys(lastname);
	}
	
	public void clickOnSaveEmployee()
	{
		driver.findElement(saveEmployeeLocator).click();
	}
}
