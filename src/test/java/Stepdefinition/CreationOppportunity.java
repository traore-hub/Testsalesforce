package Stepdefinition;

import helpers.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.BrowserHelper.driver;

public class CreationOppportunity {


   @BeforeClass
    @Given("navigate to url salesforce")
    public void navigate_to_url_salesforce() {
     /*  if(ConfigFile.property.getProperty("Browsertype").equalsIgnoreCase("Chrome")){
           Helpers.helperbrowserChrome();

       }
       if (ConfigFile.property.getProperty("Browser").equalsIgnoreCase("firefox")) {
           Helpers.helperbrowserfirefox();
       }*/
       System.out.println("Test started****************");
       driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");

    }


    @Test
    @Given("User navigate to Sales Portal")
    public void user_navigate_to_sales_portal() throws InterruptedException {


        driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div/div/div[2]/ul/li/a")).click();


    }

    @Test
    @When("User Creates An Opportunity with : Amount {string}, Opportunity Stage {string} and Close Date {string}")
    public void user_creates_an_opportunity_with_amount_opportunity_stage_and_close_date(String string, String string2, String string3) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//sfa-input-opportunity-amount/lightning-input/div/input")).sendKeys(string);

        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys("CDI TALAN");
        driver.findElement(By.xpath("//lightning-datepicker/div/div/input")).sendKeys(string3);

               driver.findElement(By.xpath("//lightning-base-combobox/div/div/button")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[3]/span[2]/span")).click();
        driver.findElement(By.xpath("//li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot/slot/lightning-button/button")).click();


        }

        @Test(priority = 0)
    @Then("Opportunity should be created with correct information")
    public void opportunity_should_be_created_with_correct_information() {
       String message = driver.findElement(By.xpath("//lightning-base-combobox/div/div/button")).getText();
        Assert.assertNotEquals(message,"Opportunité à été bien enregistréé");

    }

    @AfterClass
    @Then("close Browser")
    public void close_browser() {
        //BrowserHelper.helperbrowserclose();
        System.out.println("************Test finish***************");

    }

}
