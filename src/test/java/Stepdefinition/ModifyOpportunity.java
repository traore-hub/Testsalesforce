package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.BrowserHelper.driver;


public class ModifyOpportunity {

    @BeforeClass
    @Given("navigate to url salesforce modify")
    public void navigate_to_url_salesforce_modify() {
      /*  if( ConfigFile.property.getProperty("Browsertype").equalsIgnoreCase("Chrome")){
            Helpers.helperbrowserChrome();
        }
        if (ConfigFile.property.getProperty("Browser").equalsIgnoreCase("firefox")) {
            Helpers.helperbrowserfirefox();
        }
       */
        System.out.println("Test started****************");
        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");

    }
    @Test
    @When("user check opportunity list")
    public void user_check_opportunity_list() {
        System.out.println("check list");
    }
    @Test
    @When("select opportunity and click")
    public void select_opportunity_and_click() {
        driver.findElement(By.xpath("//th/span/a")).click();
    }
    @Test
    @When("click button modify")
    public void click_button_modify() {
        driver.findElement(By.xpath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//div[@class='slds-grid primaryFieldRow']//div[@class='slds-col slds-no-flex slds-grid slds-grid_vertical-align-center horizontal actionsContainer']//div//button[@name='Edit'][normalize-space()='Modifier']")).click();
    }
    @Test
    @When("modify information the opportunity")
    public void modify_information_the_opportunity() {
     driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).clear();
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys("CDI TALAN FRANCE");

    }
    @Test
    @Then("click save")
    public void click_save() {
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
        //BrowserHelper.helperbrowserclose();
        System.out.println("************Test finish***************");
    }

}
