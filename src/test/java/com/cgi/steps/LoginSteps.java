package com.cgi.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("User have browser with OrangeHRM application")
	public void user_have_browser_with_orange_hrm_application() {
		System.out.println("given ");
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String username) {
		System.out.println("when " + username);
	}

	@When("User enter password as {string}")
	public void user_enter_password_as(String password) {
		System.out.println("when " + password);
	}

	@When("User click on login")
	public void user_click_on_login() {
		System.out.println("when login");
	}

	@Then("User should get access to dashboard page with content as {string}")
	public void user_should_get_access_to_dashboard_page_with_content_as(String expectedValue) {
		System.out.println("then " + expectedValue);
	}
	
	@Then("User should get error message as {string}")
	public void user_should_get_error_message_as(String expectedError) {
	   System.out.println(expectedError);
	}

}
