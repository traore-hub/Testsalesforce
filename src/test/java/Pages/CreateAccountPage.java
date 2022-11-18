package Pages;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import common.*;




public class CreateAccountPage {
	
	public static WebDriver driver;
	
	public static String expected_name, expected_phone, expected_first_name, expected_last_name, expactedstep;
	
	/********************authenticate in Web Portal**************/
	public static void authenticateInWebPortal(WebDriver driver) throws Exception {
		Browserhelper.openBrowserInMaxWindow(driver);
		Browserhelper.navigate(driver, Utils.getProperty("Web_Portal_Link"));
		WebElement loginField = driver.findElement(By.xpath("//input[@id='username']"));
		loginField.sendKeys(Utils.getProperty("user_name"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		passwordField.sendKeys(Utils.getProperty("user_pass"));
		WebElement button = driver.findElement(By.xpath("//input[@id='Login']"));
		Browserhelper.clickOnElement(driver, button);	
		Browserhelper.checkAuthentication(driver);	
		//driver.findElement(By.xpath("//a[contains(text(),'Me le rappeler ultérieurement')]")).click();;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	}
	
	/********************Navigate to Sales Portal**************/
	public static void navigateToSales(WebDriver driver) throws Exception {

		driver.findElement(By.xpath("//*[contains(@class,'appLauncher')]//button")).click(); 
		driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez des applications et des éléments...')]")).sendKeys("ventes");
		driver.findElement(By.xpath("(//*[@class='slds-truncate']/b)[1]")).click(); 
		Thread.sleep(5000);
	}
	
	/*******************Create Account*********************/
	public static void createAccount(WebDriver driver,String account_name, String type, String web_site, String phone_number) throws Exception {
			
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Comptes')]")));
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Nouveau']/parent::*")).click();
		Thread.sleep(3000);
		expected_name=account_name;
		expected_phone=phone_number;
		
		
		/***Account creation : Fill Template****/
		//select Account Name
		driver.findElement(By.xpath("//*[@name='Name']")).sendKeys(account_name);
		//select Type
	    WebElement Type ;
		Type = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Type'])[1]/following::button[1]"));
		Type.sendKeys(type);
		Type.sendKeys(Keys.ENTER);
		//select web_site
		driver.findElement(By.xpath("//*[@name='Website']")).sendKeys(web_site);
		//select phone number 
		driver.findElement(By.xpath("//*[@name='Phone']")).sendKeys(phone_number);
		//submit
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();	
	}
	
	 /*******************Verify account creation******************/
	
	public static void checkAccountCreation(WebDriver driver) throws Exception {
		
		/***Verify Account Creation****/
		//check account name
		assertEquals(expected_name, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sélectionner l’élément 1'])[1]/following::span[1]")).getText());
		//check phone number
		assertEquals(expected_phone, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modifier Site du compte : élément 1'])[1]/following::span[1]")).getText());		
		driver.quit();
	}
	
	/******************* Navigate to account *********************/
	
	public static void NavigateToAccount(WebDriver driver) throws Exception {
		
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Comptes')]")));
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sélectionner l’élément 1'])[1]/following::a[1]")).click();
	}
	
	/******************* Create contact *********************/
	
	public static void CreateContact (WebDriver driver,String civility, String first_name, String last_name, String contact_phone) throws Exception {
	
		expected_first_name= first_name;
		expected_last_name= last_name;
		
		driver.findElement(By.xpath("//button[@name='Global.NewContact']")).click();
		// insert civility 
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='- Aucun -']/parent::*")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Ms.')]")).click();
		//insert first name
		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys(first_name);
		//insert last name 
		driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys(last_name);
		//insert contact phone 
		driver.findElement(By.xpath("//*[contains(text(),'Téléphone')]/parent::*//div[3]/div/div/div/div/input")).sendKeys(contact_phone);
		//submit 
		driver.findElement(By.xpath("//button[@class= 'slds-button slds-button_brand cuf-publisherShareButton undefined uiButton']")).click();
		
	}
	
	/******************* verify account creation  *********************/
	
	public static void VerifyAccountCreation (WebDriver driver) {
		driver.close();
		//assertEquals(expected_first_name + expected_last_name , driver.findElement(By.xpath("//*[@id='window']")).getText());
	}
	
	
	
	/********************* account creation **********************/
	
	public static void AccountCreation ( WebDriver driver, String opportunity_name, String closure_date, String step ) throws Exception {
		
		expactedstep=step;
		// select new opportunity
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Opportunités'])[2]/following::div[6]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Opportunités'])[2]/following::div[6]")));
		
		//insert opportunity_name
		driver.findElement(By.xpath("//input[@class='slds-input'][@name='Name']")).sendKeys(opportunity_name);
		
		//insert closure date 
		driver.findElement(By.xpath("//input[@class='slds-input'][@name='CloseDate']")).sendKeys(closure_date);
		
		//insert step 
		WebElement etape =driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][@aria-label='Étape, - Aucun -']"));
		etape.sendKeys(step);
		etape.sendKeys(Keys.ENTER);
		
		//click submit 
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	
	}
	/********************* verify opportunity creation **********************/
	
	public static void VerifyOpportunityCreation(WebDriver driver) {
		
		WebElement expected_result =driver.findElement(By.xpath("//div[@class='slds-tile__detail']//lst-formatted-text[contains(text(),'Prospecting')]"));
	    String txt = expected_result.getText();   
	    assertEquals(expactedstep, txt);	
		driver.close();	
	}
	
	/************************ Request creation ***************************/
	
	public static void RequestCreation(WebDriver driver, String statut, String request_origin) throws Exception {
		
	// click on new request 
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Requêtes'])[2]/following::div[6]")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Requêtes'])[2]/following::div[6]")));
		
	//	
	}
	
	
	
}
