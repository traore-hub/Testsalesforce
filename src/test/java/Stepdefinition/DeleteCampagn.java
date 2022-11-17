package Stepdefinition;

import helpers.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static helpers.BrowserHelper.driver;

public class DeleteCampagn {

    @Given("launch salesforce portal")
    public void launch_salesforce_portal() {
      System.out.println("*********Test started******************");
        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/page/home");
    }
    @When("navigate to url salesforces")
    public void navigate_to_url_salesforces() {
        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
    }
    @When("search campagn name")
    public void search_campagn_name() throws Exception {
      // driver.findElement(By.xpath("//th/span/a")).click();
        BrowserHelper.clickOnElement(driver, driver.findElement(By.xpath("//th/span/a")));
       driver.findElement(By.xpath("//div[2]/ul/li[4]/div/div/div/div/a")).click();

    }
    @When("delete this campagn")
    public void delete_this_campagn() throws Exception {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cloner'])[1]/preceding::a[1]")).click();
       BrowserHelper.clickOnElement(driver, driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*")));
       driver.close();
    }

}
