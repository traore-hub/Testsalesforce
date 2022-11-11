package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


import common.Browserhelper;
import common.Utils;


public class tache {
	WebDriver driver=null;
	public tache(WebDriver driver) {
		this.driver = driver;
		}
	public void seconnecter(WebDriver driver) throws Throwable{

		String projectPath = System.getProperty("user.dir");
		Browserhelper.driver=Browserhelper.initializeDriver(Browserhelper.driver);
		connexion.navigate(Browserhelper.driver);
		//log.click_cx();
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/driver/chromedriver.exe");
		connexion.enterEmail(Browserhelper.driver);
		connexion.enterMdp(Browserhelper.driver);
		Browserhelper.driver.findElement(By.xpath("//input[contains(@id,'Login')]")).click();
		//Browserhelper.driver.findElement(By.xpath("//a[contains(text(),'Me le rappeler ultérieurement')]")).click();
		
	}
	public void cliquer_sur_tache(WebDriver driver) throws Throwable {
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Tâches')]"))); 
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//li/div/div/div/div/a")));
	
	
	}
	public void Cliquer_sur_unenouvellle_tache (WebDriver driver) throws Throwable{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("a[title=\"Nouvelle tâche\"]")));
		
	}
	public void entrer_lobjet(WebDriver driver) throws Throwable {
		
		WebElement Objet = driver.findElement(By.xpath("//lightning-base-combobox/div/div/input"));
		Objet.sendKeys(Utils.getProperty("Objet"));
		
	}
	public void selectionner_le_priorité(WebDriver driver) throws Throwable {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),'Normal')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),'Low')]")));
		 
	}
	public void selectionner_le_statut(WebDriver driver) throws Throwable {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),'Not Started')]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[contains(text(),'Completed')]")));	 	
	}
	public void cliquer_sur_enregistrer(WebDriver driver) throws Throwable{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[3]/span")));
		String message = driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span")).getText();
		//System.out.println("le resultat est           : "+message);
	}
	public void chercher_la_tache_par_le_nom(WebDriver driver)throws Throwable {
		WebElement nom_search= driver.findElement(By.xpath("//div[3]/force-list-view-manager-search-bar/div/lightning-input/div/input"));
		nom_search.sendKeys(Utils.getProperty("nomsearch"));
		
		driver.findElement(By.xpath("//div[3]/force-list-view-manager-search-bar/div/lightning-input/div/input")).click();
		driver.findElement(By.cssSelector("div.slds-split-view__header.slds-shrink-none.test-headerRegion.forceListViewManagerHeader")).click();
	}
	public void selectionner_la_tache(WebDriver driver)throws Throwable {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("span.slds-grow.slds-text-body--regular.slds-text-color--default.fade.test-splitViewCardData")));
		//driver.findElement(By.cssSelector("span.slds-grow.slds-text-body--regular.slds-text-color--default.fade.test-splitViewCardData")).click();
		  
	}
	public void cliquer_sur_modifier(WebDriver driver)throws Throwable {
		driver.findElement(By.xpath("//div[2]/button/lightning-primitive-icon")).click();
	}
	public void modifier_objet(WebDriver driver)throws Throwable {
		driver.findElement(By.xpath("//lightning-base-combobox/div/div/input")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[2]")).click();
		driver.findElement(By.xpath("//lightning-base-combobox/div/div/input")).clear();
	WebElement ModifObjet=	driver.findElement(By.xpath("//lightning-base-combobox/div/div/input"));
		 ModifObjet.sendKeys(Utils.getProperty("ModifObjet"));
	}
	public void modifier_le_statut(WebDriver driver) throws Throwable{
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/a")));
		  driver.findElement(By.xpath("//a[contains(text(),'Completed')]")).click();
	}
	public void modifier_le_priorité(WebDriver driver)throws Throwable {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Element = driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/a"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//div[4]/div/div/div/div/div/div/div/div/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Low')]")).click();
		  
	}
	public void cliquer_sur_enrigistrer(WebDriver driver)throws Throwable {
		driver.findElement(By.xpath("//button[2]/span")).click();
		Thread.sleep(2000);
		driver.quit();
		   
	}

}
