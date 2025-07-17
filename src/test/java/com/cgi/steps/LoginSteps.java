package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User have browser with OrangeHRM application")
	public void user_have_browser_with_orange_hrm_application() {
		AutomationHooks.driver = new ChromeDriver();
		AutomationHooks.driver.manage().window().maximize();
		AutomationHooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AutomationHooks.driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String username) {
		AutomationHooks.driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String password) {
		AutomationHooks.driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		AutomationHooks.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("User should get access to dashboard page with content as {string}")
	public void user_should_get_access_to_dashboard_page_with_content_as(String expectedValue) {
		String actualValue = AutomationHooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'at Work')]")).getText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Then("User should get error message as {string}")
	public void user_should_get_error_message_as(String expectedError) {
		String actualError = AutomationHooks.driver.findElement(By.xpath("//p[contains(normalize-space(),'Invalid')]")).getText();
		Assert.assertTrue(actualError.contains(expectedError));
	}
}


