package Stepdefinition;

import helpers.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static helpers.BrowserHelper.driver;

public class DeleteOpportunity {


    @BeforeClass
    @Given("launch salesforce plateform opportunity list")
    public void launch_salesforce_plateform_opportunity_list() {
       /* if(ConfigFile.property.getProperty("Browsertype").equalsIgnoreCase("Chrome")){

            Helpers.helperbrowserChrome();
        }
        if (ConfigFile.property.getProperty("Browser").equalsIgnoreCase("firefox")) {

            Helpers.helperbrowserfirefox();
        }*/
        System.out.println("*******************Test started****************");
        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Opportunity/list?filterName=Recent");

    }
  @Test
    @When("check opportunity by name")
    public void check_opportunity_by_name() throws Exception {
        driver.findElement(By.xpath("//lightning-input/div/input")).click();
        driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys("CDI TALAN");
      BrowserHelper.clickOnElement(driver,driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifier Nom du compte : élément 1'])[1]/preceding::a[1]")));

  }
    @Test
    @When("delete this opportunity")
    public void delete_this_opportunity() throws Exception {
        Thread.sleep(4000);
       driver.findElement(By.xpath("//lightning-button-menu/button")).click();
       driver.findElement(By.xpath("//runtime_platform_actions-ribbon-menu-item/a")).click();
       BrowserHelper.clickOnElement(driver, driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*")));
       //Helpers.driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*"));
       Thread.sleep(2000);
       //Helpers.driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]")).click();
        BrowserHelper.clickOnElement(driver, driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]")));


    }

    @Test
    @Then("verify if opportunity delete")
    public void verify_if_opportunity_delete() {
       BrowserHelper.helperbrowserclose();
        System.out.println("************Test finish***************");
    }

}
