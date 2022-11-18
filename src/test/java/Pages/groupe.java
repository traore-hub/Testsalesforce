package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Utils;

public class groupe {
	static String verifnomgroupe;
	public static String nom_grp;
	WebDriver driver = null;
	static String modifngrp;
	static String nomOPP;
	public static String VerifPub;

	public groupe(WebDriver driver) {
		this.driver = driver;
	}

	public void cliquer_sur_groupe(WebDriver driver) throws Throwable {
		// Cliquer sur Groupe
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//span[@class='slds-truncate'][contains(text(),'Groupes')]")));
	}

	public void cliquer_sur_un_nouveau_groupe(WebDriver driver) throws Throwable {
		// cliquer sur nouveau
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Nouveau']/parent::*")).click();
	}

	public void entrer_le_nom(WebDriver driver, String Nomgrp) throws Throwable {
		WebElement Nomgrpe = driver.findElement(By.xpath(
				"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/article/div[3]/div/div/div/div/div[1]/div/div/div/div/input"));
		Nomgrpe.click();
		Nomgrpe.sendKeys(Keys.CONTROL + "a");
		Nomgrpe.sendKeys(Keys.DELETE);
		Nomgrpe.sendKeys(Nomgrp);
		verifnomgroupe = Nomgrp;
		System.out.println(verifnomgroupe);
	}

	public void selectionner_le_type_daccee(WebDriver driver) throws Throwable {
		// pour trouver l'element qui se trouve a la fin de la page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement typeacc = driver.findElement(By.xpath("//a[contains(text(),'- Aucun -')]"));
		js.executeScript("arguments[0].scrollIntoView();", typeacc);
		typeacc.click();
		driver.findElement(By.xpath("//a[contains(text(),'Public')]")).click();
	}

	public void cliquer_sur_enregistrer_et_suivant(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Enregistrer et suivant']/parent::*")).click();
	}

	public void cliquer_sur_charger_limage(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Charger une image']/parent::*")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\bbounguicha\\Desktop\\test.exe");
		Thread.sleep(2000);
	}

	public void cliquer_sur_enregistrer_le_groupe(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//div[3]/div[3]/button[4]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Terminé']/parent::*")).click();
		driver.quit();
	}

	public void verifier_le_nom_du_groupe(WebDriver driver) throws Throwable {
		WebElement nom_grp = driver.findElement(By.xpath(
				"//*[@id=\"brandBand_2\"]/div[2]/div/div/div/div[1]/div/div[1]/div/header/div[2]/div/div/div[2]/div[1]/b/span"));
		String vrf = nom_grp.getText();
		// pour ingorer les espaces dans une chaine
		verifnomgroupe = verifnomgroupe.replaceAll("\\s", "");
		vrf = vrf.replaceAll("\\s", "");
		// pour faire la verification
		System.out.println("le nom_grp est  " + vrf);
		System.out.println("le verifnomgroupe est :  " + verifnomgroupe);
		assertEquals(vrf, verifnomgroupe);
	}

	public void chercher_le_groupe_par_le_nom(WebDriver driver) throws Throwable {
		WebElement groupe_search = driver.findElement(By.xpath("//lightning-input/div/input"));
		groupe_search.sendKeys(Utils.getProperty("groupesearch"));
		driver.findElement(By.xpath("//button[@name='refreshButton']")).click();
	}

	public void selectionner_le_groupe(WebDriver driver) throws Throwable {
		// cliquer sur le groupe
		driver.findElement(By.xpath("//span/div/div/div/a")).click();
	}

	public void cliquer_sur_modifier_groupe(WebDriver driver) throws Throwable {
		driver.findElement(By.cssSelector(
				"a.slds-grid.slds-grid--vertical-align-center.slds-grid--align-center.sldsButtonHeightFix")).click();
		driver.findElement(By.cssSelector("a[title=\"Modifier le groupe\"]")).click();

	}

	public void modifier_le_nom_du_groupe(WebDriver driver, String ngrp) throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div/div/div/div[1]/div/div/div/div/input"))
				.click();
		WebElement Modifnongroupe = driver.findElement(By.xpath(
				"/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/article/div[3]/div/div/div/div/div[1]/div/div/div/div/input"));
		Modifnongroupe.click();
		Modifnongroupe.sendKeys(Keys.CONTROL + "a");
		Modifnongroupe.sendKeys(Keys.DELETE);
		modifngrp = ngrp;
		Modifnongroupe.sendKeys(ngrp);
	}

	public void modifier_le_type_daccès(WebDriver driver) throws Throwable {
		// pour trouver l'element au dessus de la page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//a[contains(text(),'Public')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		// ouvrir la liste pour selectionner le priorité
		driver.findElement(By.xpath("//a[contains(text(),'Public')]")).click();
		// selectionner le type de priorité
		driver.findElement(By.xpath("//a[contains(text(),'Privé')]")).click();
	}

	public void cliquer_sur_enrigistrer_modification(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//div[2]/button[2]/span")).click();
		// pour verifier le bon enregistrement
		// verifier que le message s'affiche
		WebElement modifVerif = driver.findElement(By.xpath("//*/text()[normalize-space(.)='Groupe']/parent::*"));
		modifVerif.getText();
		System.out.println("le message est : " + modifVerif.getText());
		// verfication du modification
		assertEquals(driver.findElement(By.xpath("//b/span")).getText(), modifngrp);
		driver.quit();
	}

	public void Cliquer_sur_supprimer_groupe(WebDriver driver) throws Throwable {
		// selectionner supprimer le groupe
		driver.findElement(By.cssSelector(
				"a.slds-grid.slds-grid--vertical-align-center.slds-grid--align-center.sldsButtonHeightFix")).click();
		driver.findElement(By.cssSelector("a[title=\"Supprimer le groupe\"]")).click();
		// confirmer la suppression
		driver.findElement(By.xpath("//div[2]/div/div[3]/div/button[2]/span")).click();
		// verification du suppression
		String suppression = driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span")).getText();
		System.out.println("le message est : " + suppression);
		driver.quit();

	}

	public void cliquer_sur_nouvelle_opportunité(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//*/text()[normalize-space(.)='Nouvelle opportunité']/parent::*")).click();

	}

	public void entrer_le_nom_de_lopportunité(WebDriver driver, String nomopp) throws Throwable {
		WebElement Nomopp = driver.findElement(By.xpath("//input[contains(@maxlength,'120')]"));
		Nomopp.click();
		Nomopp.sendKeys(nomopp);
		nomOPP = nomopp;
		System.out.println("le nom de l'opportunité est  : " + nomopp);
	}

	public void selectionner_etape(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'- Aucun -')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Needs Analysis')]")).click();
	}

	public void cliquer_sur_enregistrer_opportunité(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//div[3]/button[2]/span")).click();
		Thread.sleep(700);
	}

	public void verification_creation_opportunité_dans_un_groupe(WebDriver driver) throws Throwable {
		// la verification d'une creation d'une opportunité dans un groupe
		WebElement verifopp = driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span"));
		verifopp.click();
		Thread.sleep(1500);
		System.out.println(
				"le message de confirmation est  :" + verifopp.getText() + "le nom d'opportunité est : " + nomOPP);
		assertEquals(verifopp.getText().contains(nomOPP), true);
		driver.quit();
	}

	public void cliquer_sur_publication(WebDriver driver) throws Throwable {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",
				driver.findElement(By.xpath("//section/div/div/button")));
		Thread.sleep(2000);

	}

	public void ajouter_une_publication(WebDriver driver, String publ) throws Throwable {
		WebElement pub = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/div/div/p"));
		VerifPub = publ;
		pub.sendKeys(VerifPub);

		System.out.println("la publication est  : " + VerifPub);

	}

	public void cliquer_sur_partager_pub(WebDriver driver) throws Throwable {
		// pour trouver l'element au dessus de la page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Elemennt = driver
				.findElement(By.xpath("//div[3]/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div/div"));
		js.executeScript("arguments[0].scrollIntoView();", Elemennt);
		driver.findElement(By.xpath(
				"//button[contains(@class,'slds-button slds-button_brand cuf-publisherShareButton qe-textPostDesktop MEDIUM')]"))
				.click();
		Thread.sleep(1500);
		// pour verifier la creation d'une publication
		WebElement vpub = driver.findElement(By.xpath("//div[2]/div/div/p/span"));
		assertEquals(VerifPub, vpub.getText() + " ");
		driver.quit();

	}

	public void cliquer_sur_sondage(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//section/div/div/div/div/ul/li[2]/a")).click();

	}

	public void remplir_le_champs_du_question(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath("//div[@id='outerContainer']/div/textarea"))
				.sendKeys("le sondage num 1 type de test ? :");

	}

	public void remplir_les_champs_des_choix(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/section/div/div/div[1]/section[2]/div/div[3]/div/div/div/div[1]/section/div/ul/li[2]/div/div/input"))
				.sendKeys("oui");
		driver.findElement(By.xpath(
				"/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div/div/section/div/div/div[1]/section[2]/div/div[3]/div/div/div/div[1]/section/div/ul/li[1]/div/div/input"))
				.sendKeys("non");
	}

	public void cliquer_sur_poser_une_question(WebDriver driver) throws Throwable {
		driver.findElement(By.xpath(
				"//button[contains(@class,'slds-button slds-button_brand cuf-publisherShareButton qe-pollPostDesktop MEDIUM')]"))
				.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
