package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import common.*;
public class Connexion {
	
	WebDriver driver = null;
	
	public Connexion(WebDriver driver) {
		this.driver = driver;
		}
	public static void navigate(WebDriver driver) throws Exception {
		Browserhelper.openBrowserInMaxWindow(driver);
		Browserhelper.navigate(driver, Utils.getProperty("Web_Portal_Link"));
	}
	public void seconnecter(WebDriver driver) throws Throwable {
		Browserhelper.driver = Browserhelper.initializeDriver(Browserhelper.driver);
		Connexion.navigate(Browserhelper.driver);
		Connexion.enterEmail(Browserhelper.driver);
		Connexion.enterMdp(Browserhelper.driver);
		Browserhelper.driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
		// cliquer sur le menu pour selectionner vente
		Browserhelper.driver.findElement(By.xpath("//button/div/div[8]")).click();
		// chercher ventes
		Browserhelper.driver.findElement(By.xpath("//lightning-input/div/input")).sendKeys("ventes");
		// selectionner ventes
		Browserhelper.driver.findElement(By.xpath("(//*[@class='slds-truncate']/b)")).click();
		Thread.sleep(3000);
	}
	public static void enterEmail(WebDriver driver) throws Exception {

		WebElement loginField = driver.findElement(By.xpath("//input[@id='username']"));
		loginField.sendKeys(Utils.getProperty("user_name"));
	}
public static void enterMdp(WebDriver driver) throws Exception {

	WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	passwordField.sendKeys(Utils.getProperty("user_pass"));
	}
}
