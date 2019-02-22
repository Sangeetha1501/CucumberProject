package com.cucumber.stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

	@Given("^User launch the browser and navigate to application$")
	public void user_launch_the_browser_and_navigate_to_application() throws Throwable {
		System.out.println("User launch the browser and navigate to application");
	}

	@When("^User click on Signin button$")
	public void user_click_on_Signin_button() throws Throwable {
		System.out.println("User click on Signin button");

	}

	@When("^User enter the valid credentials$")
	public void user_enter_the_valid_credentials(DataTable arg1) throws Throwable {
			List<Map<String,String>> x = arg1.asMaps(String.class, String.class);
			System.out.println(x.get(0).get("UserName"));
			System.out.println(x.get(1).get("Password"));

		
	}

	@Then("^User validate the username \"([^\"]*)\" displayed in the header$")
	public void user_validate_the_username_displayed_in_the_header(String arg1) throws Throwable {
		System.out.println(arg1);
	}

	@When("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {

		System.out.println("User enter the valid username$");
	}

	@When("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {

		System.out.println("User enter the valid password$");
	}

	@When("^User click the signin button$")
	public void user_click_the_signin_button() throws Throwable {
		System.out.println("User click the signin button$");

	}

	@When("^User enter the valid username \"([^\"]*)\"$")
	public void user_enter_the_valid_username(String arg1) throws Throwable {
		System.out.println("UserName is " + arg1);
	}

	@When("^User enter the valid password \"([^\"]*)\"$")
	public void user_enter_the_valid_password(String arg1) throws Throwable {

		System.out.println("Password is " + arg1);

	}

	@Then("^User validate the username displayed in the header$")
	public void user_validate_the_username_displayed_in_the_header() throws Throwable {

		System.out.println("User validate the username displayed in the header$");
	}

	@Then("^User close the browser$")
	public void user_close_the_browser() throws Throwable {

		System.out.println("User close the browser$");
	}

}
