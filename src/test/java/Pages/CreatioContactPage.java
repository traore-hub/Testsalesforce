package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.*;


import static org.junit.Assert.assertEquals;
public class CreatioContactPage {
	public CreatioContactPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public static WebDriver driver;
	
	
	public void seconnecter(WebDriver driver) throws Throwable{



	       String projectPath = System.getProperty("user.dir");
	        System.out.println("Project path is : "+projectPath);
	        	Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
	        		connexion.navigate(Browserhelper.driver);
	        			System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
	        				//connexion.enterEmail(Browserhelper.driver);
	        			WebElement loginField = Browserhelper.driver.findElement(By.xpath("//input[@id='username']"));
	        	        loginField.sendKeys(Utils.getProperty("user_name"));
	        			WebElement passwordField = Browserhelper.driver.findElement(By.xpath("//input[@id='password']"));
	        		    passwordField.sendKeys(Utils.getProperty("user_pass"));
	        					//connexion.enterMdp(Browserhelper.driver);
	        						Browserhelper.driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
	        	//Browserhelper.driver.findElement(By.xpath("//a[contains(text(),'Me le rappeler ultérieurement')]")).click();
	        								Thread.sleep(4000);
	        
	    }
	
	public void accesSalesModule(WebDriver driver) throws Throwable {
		
			Thread.sleep(3000);
				Browserhelper.driver.findElement(By.xpath("//div[contains(@class,'slds-icon-waffle')]")).click();
					Thread.sleep(4000);
						WebElement txt;
							txt = Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez des applications et des éléments...')]"));
								Thread.sleep(2000);
									txt.click();
										txt.sendKeys("Ventes");
											Thread.sleep(2000);
												Browserhelper.driver.findElement(By.xpath("(//*[@class='slds-truncate']/b)[1]")).click();
													Thread.sleep(1000);
		
		
		
	}
	
	public void click_on_contact(WebDriver driver) throws Throwable{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")));
																																											}
		public void click_on_new(WebDriver driver) throws Throwable{
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@title='Nouveau'][contains(text(),'Nouveau')]")));
																																										}
	
			public void selectCv(WebDriver driver) throws Throwable{
		
					((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[contains(@name,'salutation')]")));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//lightning-base-combobox-item[2]/span[2]")));
																																									}
				public void fillNameLastName(WebDriver driver) throws Throwable{
					Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys(Utils.getProperty("first_name"));
					Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys(Utils.getProperty("last_name"));	
					}
				
					public void fillAccountClientName (WebDriver driver)throws Throwable {
						Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez dans les Comptes...')]")).sendKeys(Utils.getProperty("Accoun_name"));
						((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Account'])[1]/following::span[2]")));
																																																					}
						public void clickOnSave(WebDriver driver)throws Throwable{
							((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[contains(@name,'SaveEdit')]")));
																																										}
								public void verifyContact(WebDriver driver)throws Throwable{
									String a =Browserhelper.driver.findElement(By.xpath("//span[contains(@class,'custom-truncate uiOutputText')]")).getText();
									System.out.println(a);
									assertEquals(a,"Mr. "+Utils.getProperty("first_name")+" "+Utils.getProperty("last_name"));
																		}
										public void clickContactTarget(WebDriver driver)throws Throwable{
											((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),'fares ayeche')]")));
										}
												public void clickOnrEMOVE(WebDriver driver)throws Throwable{
													((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[8]/span/div/a/span/span")));
													Thread.sleep(1000);
													((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(@data-target-selection-name,'sfdc:StandardButton.Contact.Delete')]")));
													Thread.sleep(1000);
													((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//*/text()[normalize-space(.)='Supprimer']/parent::*")));
												}
																public void verifyRemovedContact (WebDriver driver) throws Throwable {
																	//Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez dans cette liste...')]")).sendKeys(Utils.getProperty("last_name"));
																	//Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez dans cette liste...')]")).sendKeys(Keys.RETURN);
																	Thread.sleep(2000);
																	
																	String b =Browserhelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='success'])[1]/following::span[1]")).getText();
																	
																	System.out.println(b);
																	assertEquals(b,"Le contact « "+Utils.getProperty("first_name")+" "+Utils.getProperty("last_name")+" » a été supprimé. Annuler");
																}
public void clickOnEdit(WebDriver driver)throws Throwable{
	
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Contacts')]")));
	Thread.sleep(1000);
	//Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez dans cette liste...')]")).sendKeys("Aymen Aymen");
	//Browserhelper.driver.findElement(By.xpath("//input[contains(@placeholder,'Recherchez dans cette liste...')]")).sendKeys(Keys.RETURN);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@id='brandBand_1']/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[8]/span/div/a/span/span")));
		Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(@data-target-selection-name,'sfdc:StandardButton.Contact.Edit')]")));
	
																}			
public void searchOnContact(WebDriver driver)throws Throwable{
	}

public void editField(WebDriver driver)throws Throwable{
	Thread.sleep(2000);
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).clear();
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).clear();
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys(Utils.getProperty("first_name2"));
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys(Utils.getProperty("last_name2"));
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).click();
	
	
}
public void verifyEdition(WebDriver driver)throws Throwable{
	
	Thread.sleep(1000);
	String c =Browserhelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='success'])[1]/following::span[1]")).getText();
	
	System.out.println(c);
	assertEquals(c,"Contact \"Mr. "+Utils.getProperty("first_name2")+" "+Utils.getProperty("last_name2")+"\""+" a été enregistré(e).");
	
}
public void clickOnSaveAndNew(WebDriver driver)throws Throwable{
//	
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[contains(@name,'SaveAndNew')]")));
}
public void FillSecondField(WebDriver driver)throws Throwable{

	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys(Utils.getProperty("first_name3"));
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys(Utils.getProperty("last_name3"));
	Browserhelper.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).click();
}
public void verifyTwoContact(WebDriver driver)throws Throwable{
/*String d =Browserhelper.driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Chargement...'])[4]/following::div[13]")).getText();
	
	System.out.println(d);
	assertEquals(d,"success\r"+ "Contact \"Mr. Fares Ayeche\" créé(e).\r"+ "Fermer");
	//assertEquals(d,"success \r\n"+ "Contact \"Mr. Fares Ayeche\" créé(e) \r\n"+ "Fermer");*/
	String a =Browserhelper.driver.findElement(By.xpath("//span[contains(@class,'custom-truncate uiOutputText')]")).getText();
	System.out.println(a);
	assertEquals(a,"Mr. "+Utils.getProperty("first_name3")+" "+Utils.getProperty("last_name3"));
	

}

																
																
}

