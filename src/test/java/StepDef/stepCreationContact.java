package StepDef;

import Pages.CreatioContactPage;
import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.*;
import common.*;




public class stepCreationContact {
	
	CreatioContactPage CreatioContactPage;
	///////////////////////////////////////////SC1//////////////////////////////////////////////////////
	@Given("User conected")
	public void user_conected() throws Throwable {
		CreatioContactPage= new CreatioContactPage(Browserhelper.driver);
			CreatioContactPage.seconnecter(Browserhelper.driver);}

	@When("I click on Contact")
		public void i_click_on_contact() throws Throwable {
			CreatioContactPage.accesSalesModule(Browserhelper.driver);
			}

	@When("I click on new contact")
		public void i_click_on_new_contact() throws Throwable {
			Thread.sleep(2000);
				CreatioContactPage.click_on_contact(Browserhelper.driver);
					CreatioContactPage.click_on_new(Browserhelper.driver);
				}

	@When("I fill the field")
		public void i_fill_the_field() throws Throwable {
			CreatioContactPage.selectCv(Browserhelper.driver);
				CreatioContactPage.fillNameLastName(Browserhelper.driver);
					CreatioContactPage.fillAccountClientName(Browserhelper.driver);
						}

	@When("I save")
	public void i_save() throws Throwable {
	CreatioContactPage.clickOnSave(Browserhelper.driver);
							}

	@Then("New contact should be created")
			public void new_contact_should_be_created() throws Throwable {
				Thread.sleep(2000);
					CreatioContactPage.verifyContact(Browserhelper.driver);
							Thread.sleep(2000);
									Browserhelper.driver.quit();
								}
	///////////////////////////////////////////SC2//////////////////////////////////////////////////////
								
								
	@When("I click on contact")
		public void i_click_on_contact2() throws Throwable {
			CreatioContactPage.accesSalesModule(Browserhelper.driver);
				CreatioContactPage.click_on_contact(Browserhelper.driver);
		//CreatioContactPage.clickContactTarget(Browserhelper.driver);
	}

	@When("chose contact click on remove")
		public void chose_contact_click_on_remove()throws Throwable {
			Thread.sleep(2000);
				CreatioContactPage.clickOnrEMOVE(Browserhelper.driver);
}

    @Then("contact should be removed")
		public void contact_should_be_removed()throws Throwable {
			CreatioContactPage.verifyRemovedContact (Browserhelper.driver);
				Browserhelper.driver.quit();
}
	///////////////////////////////////////////SC3//////////////////////////////////////////////////////

	@When("I click on edit")
		public void i_click_on_edit() throws Throwable {
				CreatioContactPage.clickOnEdit(Browserhelper.driver);
}

	@When("I change name and last name")
		public void i_change_name_and_last_name()throws Throwable {
			Thread.sleep(2000);
				CreatioContactPage.editField(Browserhelper.driver); 
					//CreatioContactPage.selectCv(Browserhelper.driver);
						CreatioContactPage.clickOnSave(Browserhelper.driver);
													}

	@Then("modification should be done")
		public void modification_should_be_done()throws Throwable {
			CreatioContactPage.verifyEdition(Browserhelper.driver);
					Browserhelper.driver.quit();
	}
	///////////////////////////////////////////SC4//////////////////////////////////////////////////////

	@When("I click on save and new contact")
		public void i_click_on_save_and_new_contact()throws Throwable {
			CreatioContactPage.clickOnSaveAndNew(Browserhelper.driver);
				Thread.sleep(2000);
						}

	@When("I fill the second field contact")
		public void i_fill_the_second_field_contact() throws Throwable {
			CreatioContactPage.FillSecondField(Browserhelper.driver);
			
				CreatioContactPage.selectCv(Browserhelper.driver);
				Thread.sleep(2000);
				CreatioContactPage.fillAccountClientName(Browserhelper.driver);
					CreatioContactPage.clickOnSave(Browserhelper.driver);
		
						}

	@Then("second contact should be added")
		public void second_contact_should_be_added() throws Throwable {
				CreatioContactPage.verifyTwoContact(Browserhelper.driver);
					Browserhelper.driver.quit();
		
						}
	

}
