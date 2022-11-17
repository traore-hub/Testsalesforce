package Stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static helpers.BrowserHelper.driver;

public class ModifyCampagn {

    @When("chech campagn list")
    public void chech_campagn_list() {
       driver.navigate().to("https://wise-moose-ddixuq-dev-ed.trailblaze.lightning.force.com/lightning/o/Campaign/list?filterName=Recent");
    }

    @When("click campagn")
    public void click_campagn() {
      driver.findElement(By.xpath("//th/span/a")).click();
      driver.findElement(By.xpath("//li[4]/div/div/div/div/a")).click();
      driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Supprimer'])[1]/preceding::a[1]")).click();
    }

    @When("change the name")
    public void change_the_name() {
      driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/input")).sendKeys("recrutement Talan ACADEMY");
    }

    @When("change date")
    public void change_date() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/input")).sendKeys("16/11/2022");
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[7]/div/div/div/div/div/input")).sendKeys("11/11/2023");
        driver.findElement(By.xpath("//button[3]/span")).click();
    }

    @Then("verify if campagn name and date is modify")
    public void verify_if_campagn_name_and_date_is_modify() {
        String newName = driver.findElement(By.xpath("//div[@id='toastDescription13532:0']/span")).getText();
        System.out.println("le message est: "+ newName);
        Assert.assertEquals(newName,"Recruitement Talan Academy");
    }
}
