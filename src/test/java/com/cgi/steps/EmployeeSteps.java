package com.cgi.steps;

import java.util.List;
import java.util.Map;

import com.cgi.pages.AddEmployeePage;
import com.cgi.pages.MainPage;
import com.cgi.pages.PIMPage;
import com.cgi.pages.PersonalDataPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps {

	private final MainPage mainPage;
	private final PIMPage pimPage;
	private final AddEmployeePage addEmployeePage;
	private final PersonalDataPage personalDataPage;

	public EmployeeSteps(MainPage mainPage, PIMPage pimPage, AddEmployeePage addEmployeePage,PersonalDataPage personalDataPage) {
		this.mainPage = mainPage;
		this.pimPage = pimPage;
		this.addEmployeePage = addEmployeePage;
		this.personalDataPage=personalDataPage;

	}

	@When("User click on PIM menu")
	public void user_click_on_pim_menu() {
		mainPage.clickOnPIMMenu();
	}

	@When("User click on Add Employee")
	public void user_click_on_add_employee() {
		pimPage.clickOnAddEmployee();
	}

	@When("User fill the employee form")
	public void user_fill_the_employee_form(DataTable dataTable) {
		// fill the firstname,lastname,middlename
//		System.out.println(dataTable);
//
		List<Map<String, String>> lists = dataTable.asMaps();
//		System.out.println(lists);
//
//		System.out.println(lists.get(0));
//		System.out.println(lists.get(0).get("firstname"));
//		System.out.println(lists.get(0).get("middlename"));
//		System.out.println(lists.get(0).get("lastname"));

		addEmployeePage.fillEmployeeDetails(lists.get(0).get("firstname"), lists.get(0).get("middlename"),
				lists.get(0).get("lastname"));

	}

	@When("User clicks on save employee")
	public void user_clicks_on_save_employee() {
		addEmployeePage.clickOnSaveEmployee();
	}

	@Then("User should get the profile name as {string}")
	public void user_should_get_the_profile_name_as(String string) {

	}

	@Then("User should get the personal details as per the form filled")
	public void user_should_get_the_personal_details_as_per_the_form_filled() {

	}

}
