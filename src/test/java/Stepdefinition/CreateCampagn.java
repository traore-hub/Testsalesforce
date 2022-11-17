package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static helpers.BrowserHelper.driver;

public class CreateCampagn {
    @Given("launch salesforce portals")
    public void launch_salesforce_portals() {

        driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
    }
    @When("navigate salesforce modules campagn")
    public void navigate_salesforce_modules_campagn() {
       driver.findElement(By.xpath("//li/a/div")).click();
    }
    @When("click button campagn")
    public void click_button_campagn() {
       driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).sendKeys("Campagne de recrutement Stagiaire");
        /*driver.findElement(By.xpath("//div[3]/div/div/div/div/input")).click();

        driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/a")).click();
        driver.findElement(By.xpath("//div[9]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[9]/div/ul/li[2]/a")).click();*/
    }
    @When("give the informations the campagn")
    public void give_the_informations_the_campagn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).sendKeys("16/11/2022");
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).sendKeys("12/12/2023");
    }
    @When("click save campagn")
    public void click_save_campagn() {
        driver.findElement(By.xpath("//button[3]/span")).click();
    }
    @Then("verify if campagn is create")
    public void verify_if_campagn_is_create() {
        String message =driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span")).getText();
        System.out.println("le message est :"+message);
        Assert.assertEquals(message,"Campagne est bien crée");
        driver.close();
    }

}
