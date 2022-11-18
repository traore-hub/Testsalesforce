package StepDef;


import common.Browserhelper;


import Pages.CreateAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CreateAccountSteps {
	
	/***************************************** Scenario 1 : create an account **********************************************/
	
	/****************************************** Step 1: login Salesforce Steps **********************************************/
	
	@Given("User navigate to Salesforce group page")
	public void user_navigate_to_salesforce_group_page() throws Throwable { 
		
			Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
			CreateAccountPage.authenticateInWebPortal(Browserhelper.driver); 
	}
	
	/********************************************* Step 2: navigate to Sales page Steps **********************************************/
	
	@Given("User navigate to Sales Portal")
	public void user_navigate_to_sales_portal() throws Throwable {
		CreateAccountPage.navigateToSales(Browserhelper.driver); 
	}
	
	/*********************************************** Step 3 : Create Account **********************************************/

	
	@When("User Creates An Account with : account name {string}, type {string}, web site {string}, phone number {string} and click submit")
	public void user_creates_an_account_with_account_name_type_web_site_phone_number_activity_sector_engineering_and_click_submit(String string, String string2, String string3, String string4)throws Throwable {
	    CreateAccountPage.createAccount(Browserhelper.driver, string, string2, string3, string4);
	}
	
	
	/********************************************** Step 4: Check Account creation************************************************/
	
	@Then("The account should be created with correct information")
	public void the_account_should_be_created_with_correct_information() throws Exception {
		CreateAccountPage.checkAccountCreation(Browserhelper.driver);
	}
	
	
	/************************************Scenario 2 : create contact - account portal *****************************/
	
	 /***************************************Step 1 : Navigate to account*******************************************/   
	
	@Given("User navigate to account")
	public void user_navigate_to_account() throws Throwable {
		
		Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
		CreateAccountPage.authenticateInWebPortal(Browserhelper.driver);
		CreateAccountPage.navigateToSales(Browserhelper.driver);
		CreateAccountPage.NavigateToAccount(Browserhelper.driver);
	    
	}
	
	
	/*****************************************Step 2 : Create a new contact *******************************************/
	
	@When("User create a new contact with : civility {string} , contact first name {string}, contact last name {string}, contact phone {string} and click submit")
	public void user_create_a_new_contact_with_civility_contact_first_name_contact_last_name_contact_phone_and_click_submit(String string, String string2, String string3, String string4) throws Exception {
	   
		CreateAccountPage.CreateContact(Browserhelper.driver, string, string2, string3, string4);
	}
	
	
	/*****************************************Step 3 : Verify contact creation  *******************************************/
	@Then("the contact should be created with the correct infomations")
	public void the_contact_should_be_created_with_the_correct_infomations() {
	   
		CreateAccountPage.VerifyAccountCreation(Browserhelper.driver);
	}
	
	
	
	/************************************Scenario 3 : create opportunity - account portal *****************************/
	
	/*****************************************Step 1 : Navigate to account *******************************************/
	
	@Given("user is in his account")
	public void user_is_in_his_account() throws Throwable {
		Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
		CreateAccountPage.authenticateInWebPortal(Browserhelper.driver);
		CreateAccountPage.navigateToSales(Browserhelper.driver);
		CreateAccountPage.NavigateToAccount(Browserhelper.driver);
	}
	
	/*****************************************Step 2 : Create opportunity *******************************************/

	@When("user create a new opportunity with : opportunity name {string}, closure date {string}, step {string} and click submit")
	public void user_create_a_new_opportunity_with_opportunity_name_closure_date_step_and_click_submit(String string, String string2, String string3) throws Exception {
		CreateAccountPage.AccountCreation(Browserhelper.driver, string, string2, string3);
	}
	
	/***************************************Step 3 : verify opportunity creation*******************************************/

	@Then("the opportunity should be created with the correct informations")
	public void the_opportunity_should_be_created_with_the_correct_informations() {
		CreateAccountPage.VerifyOpportunityCreation(Browserhelper.driver);
	}
	
	
	
	/************************************Scenario 4 : create opportunity - account portal *****************************/
	
	/*****************************************Step 1 : Navigate to account  *******************************************/	
	
	@Given("user enter his account")
	
	public void user_enter_his_account() throws Throwable {
		Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
		CreateAccountPage.authenticateInWebPortal(Browserhelper.driver);
		CreateAccountPage.navigateToSales(Browserhelper.driver);
		CreateAccountPage.NavigateToAccount(Browserhelper.driver);
	}
	
	
	/*****************************************Step 2 : Create Request  *******************************************/

	@When("user create new request with : statut {string} , request origin {string} and click submit")
	public void user_create_new_request_with_statut_request_origin_and_click_submit(String string, String string2) throws Exception {
		CreateAccountPage.RequestCreation(Browserhelper.driver, string, string2);
	}
	
	/***************************************Step 3 : Verify request creation  *******************************************/
	
	@Then("the request sould be created with the correct informations")
	public void the_request_sould_be_created_with_the_correct_informations(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	



}
