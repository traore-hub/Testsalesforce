package StepDef;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import Pages.*;
import common.*;
public class tacheStep {
	connexion log;
	tache tch ;
	@Given("Se connecter sur saleforce")
	public void se_connecter_sur_saleforce() throws Throwable {	
		tch = new tache(Browserhelper.driver);
	tch.seconnecter(Browserhelper.driver);  
	}
	@Given("cliquer sur tache")
	public void cliquer_sur_tache() throws Throwable {
		
		tch.cliquer_sur_tache(Browserhelper.driver);	
	}
	@When("Cliquer sur une nouvelle tache")
	public void cliquer_sur_une_nouvelle_tache() throws Throwable {
		tch.Cliquer_sur_unenouvellle_tache(Browserhelper.driver);	  
	}
	@When("Entrer lobjet")
	public void entrer_lobjet() throws Throwable {
		tch.entrer_lobjet(Browserhelper.driver);    
	}
	@When("Selectionner le priorité")
	public void selectionner_le_priorité() throws Throwable {
		tch.selectionner_le_priorité(Browserhelper.driver);
	}
	@Then("Selectionner le statut")
	public void selectionner_le_statut() throws Throwable {
	tch.selectionner_le_statut(Browserhelper.driver);
	}
	@Then("Cliquer sur enregistrer")
	public void cliquer_sur_enregistrer() throws Throwable {
		tch.cliquer_sur_enregistrer(Browserhelper.driver);
		String message = Browserhelper.driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div/span")).getText();
		System.out.println("le resultat est : "+message); 
		Browserhelper.driver.quit();
	}
	@When("Chercher la tache par le nom")
	public void chercher_la_tache_par_le_nom()throws Throwable {
	 tch.chercher_la_tache_par_le_nom(Browserhelper.driver);
	}

	@When("Selectionner la tache")
	public void selectionner_la_tache()throws Throwable {
	  tch.selectionner_la_tache(Browserhelper.driver);
	}

	@When("Cliquer sur modifier")
	public void cliquer_sur_modifier() throws Throwable {
		
		tch.cliquer_sur_modifier(Browserhelper.driver);
	  
	}
	@Then("Modifier objet avec le nom {string}")
	public void modifier_objet_avec_le_nom(String modifobj)throws Throwable {
		tch.modifier_objet_avec_le_nom(Browserhelper.driver, modifobj);
	   
	}
	/*@Then("Modifier objet")
	public void modifier_objet()throws Throwable {
		tch.modifier_objet(Browserhelper.driver);
	 
	}*/

	@Then("Modifier le statut")
	public void modifier_le_statut()throws Throwable {
		tch.modifier_le_statut(Browserhelper.driver);
	  
	}

	@Then("Modifier le priorité")
	public void modifier_le_priorité()throws Throwable {
		tch.modifier_le_priorité(Browserhelper.driver);
	  
	}

	@Then("Cliquer sur enrigistrer")
	public void cliquer_sur_enrigistrer()throws Throwable {
		tch.cliquer_sur_enrigistrer(Browserhelper.driver);
		tch.verfication_du_modification(Browserhelper.driver);
	   
	}
	@When("Cliquer sur supprimer")
	public void cliquer_sur_supprimer() throws Throwable{
		tch.cliquer_sur_supprimer(Browserhelper.driver);
	    
	}

}
