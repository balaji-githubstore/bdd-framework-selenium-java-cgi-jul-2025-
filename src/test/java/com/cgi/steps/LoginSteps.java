package com.cgi.steps;

import org.testng.Assert;

import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private final LoginPage login;
	private final DashboardPage dashboard;

	public LoginSteps(LoginPage login, DashboardPage dashboard) {
		this.login = login;
		this.dashboard = dashboard;
	}

	@Given("User have browser with OrangeHRM application")
	public void user_have_browser_with_orange_hrm_application() {
		login.navigateToBaseUrl();
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String username) {
		login.enterUsername(username);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String password) {
		login.enterPassword(password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		login.clickOnLogin();
	}

	@Then("User should get access to dashboard page with content as {string}")
	public void user_should_get_access_to_dashboard_page_with_content_as(String expectedValue) {
		String actualValue = dashboard.getTimeAtWorkText();
		Assert.assertEquals(actualValue, expectedValue);
	}

	@Then("User should get error message as {string}")
	public void user_should_get_error_message_as(String expectedError) {
		String actualError = login.getInvalidErrorMessage();
		Assert.assertTrue(actualError.contains(expectedError));
	}
}
