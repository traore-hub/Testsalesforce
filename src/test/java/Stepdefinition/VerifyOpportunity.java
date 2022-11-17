package Stepdefinition;

import helpers.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static helpers.BrowserHelper.driver;

public class VerifyOpportunity {

    @BeforeClass
    @Given("launch salesforce plateform opportunity section list")
    public void launch_salesforce_plateform_opportunity_section_list() throws InterruptedException {
       /* if( ConfigFile.property.getProperty("Browsertype").equalsIgnoreCase("Chrome")){
            Helpers.helperbrowserChrome();
        }
        if (ConfigFile.property.getProperty("Browser").equalsIgnoreCase("firefox")) {

            Helpers.helperbrowserfirefox();
        }
      */
        System.out.println("***********************Test started****************");
        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");

    }
    @When("click opportunity")
    public void click_opportunity() {
        System.out.println("tester");
       // driver.findElement(By.xpath("//*/text()[normalize-space(.)='Opportunités']/parent::*")).click();
    }
    @When("select opportunity")
    public void select_opportunity() {
        driver.findElement(By.xpath("//th/span/a")).click();
    }
    @Then("change the date")
    public void change_the_date() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='highlights slds-clearfix slds-page-header slds-page-header_record-home fixed-position']//div[@class='slds-grid primaryFieldRow']//div[@class='slds-col slds-no-flex slds-grid slds-grid_vertical-align-center horizontal actionsContainer']//div//button[@name='Edit'][normalize-space()='Modifier']")).click();
         driver.findElement(By.xpath("//lightning-datepicker/div/div/input")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*/text()[normalize-space(.)='14']/parent::*")).click();
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
    }
    @Then("verify last date and current date")
    public void verify_date_and_current_date() {
       String newDate=driver.findElement(By.xpath("//p[2]/slot/lightning-formatted-text")).getText();
        Assert.assertEquals(newDate,"06/10/2022");
    }
    @Then("change name")
    public void change_name() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).clear();
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).sendKeys("CDI TALAN SUISSE");
        driver.findElement(By.xpath("//records-record-layout-base-input/lightning-input/div/input")).click();
        driver.findElement(By.xpath("//li[3]/runtime_platform_actions-action-renderer/runtime_platform_actions-executor-lwc-headless/slot/slot/lightning-button/button")).click();

    }

    @AfterClass
    @Then("verify name again")
    public void verify_name_again() {
        String newName = driver.findElement(By.xpath("//lightning-formatted-text")).getText();
        System.out.println("le message est: "+ newName);
        Assert.assertEquals(newName,"CDI TALAN");
        //BrowserHelper.helperbrowserclose();

        System.out.println("************Test finish***************");

    }

}
