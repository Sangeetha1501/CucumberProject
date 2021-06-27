package com.amazon.stepdefinition;


import java.io.FileNotFoundException;
import java.util.Map;

import com.amazon.am_helper.PageObjectManager;
import com.amazon.am_helper.ScenarioContext;
import com.baseclass.BaseClass;
import com.enums.Context;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistrationSteps extends BaseClass {
	
	//PageObjectManager pm = new PageObjectManager(driver);
	
	@When("^User click on sign in link$")
	public void user_click_on_sign_in_link() {
	    elementClick(PageObjectManager.Instance().getRegistrationPage().getSingInLink());
	}

	@When("^User Enters '(.*)' in Create and account section$")
	public void user_Enters_email_address_in_Create_and_account_section(String email) throws InterruptedException {
	   inputValuestoElement(PageObjectManager.Instance().getRegistrationPage().getEmailField(), email);
	   Thread.sleep(2000);
	}

	@When("^User Clicks on Create an Account button$")
	public void user_Clicks_on_Create_an_Account_button()  {
		 elementClick(PageObjectManager.Instance().getRegistrationPage().getCreateButton());
	}
	
	@When("^User Enter '(.*)','(.*)','(.*)','(.*)','(.*)','(.*)','(.*)','(.*)' and '(.*)' details$")
	public void user_Enter_and_details(String firstName, String lastName, String Password, String Address1,String State, String ZipCode, String Country, String City, String contactNumber) {
		PageObjectManager.Instance().getRegistrationPage().fillRegistrationDetails(firstName, lastName, Password, Address1, State, ZipCode, Country, City, contactNumber);
	}
	
	@When("^User Click on Register button$")
	public void user_Click_on_Register_button() {
		 elementClick(PageObjectManager.Instance().getRegistrationPage().getAccountSubmitButton());
	}

	@Then("^Validate that user is created$")
	public void validate_that_user_is_created() {
	    PageObjectManager.Instance().getRegistrationPage().verifyUserCreated();
	}
	
	@When("^User enter the mailid from excel data$")
	public void user_enter_the_mailid_from_excel_data() throws Throwable  {
		elementClick(PageObjectManager.Instance().getRegistrationPage().getSingInLink());
		Map<String, String> credentials =	PageObjectManager.Instance().getRegistrationPage().captureDataFromExcelBasedOnColumn("LoginData", "Sheet1");
		ScenarioContext.Instance().setContext(Context.credentialList, credentials);
		PageObjectManager.Instance().getRegistrationPage().sendCredentialsToLogin();
	}

	@When("^User enter the password from excel data$")
	public void user_enter_the_password_from_excel_data() {
		
	}

	@Then("^User enter the status in the excel sheet$")
	public void user_enter_the_status_in_the_excel_sheet() {
	   
	}


}
