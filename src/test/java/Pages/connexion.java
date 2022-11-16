package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.*;

public class connexion {
	
	WebDriver driver = null;
	
	public connexion(WebDriver driver) {
		this.driver = driver;
		}
	public static void navigate(WebDriver driver) throws Exception {
		Browserhelper.openBrowserInMaxWindow(driver);
		Browserhelper.navigate(driver, Utils.getProperty("Web_Portal_Link"));
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


////button[contains(@class,'action submit primary')] 