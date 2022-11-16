package StepDef;

import Pages.groupe;
import common.Browserhelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class groupestep {
	groupe grp;

	@Given("cliquer sur groupe")
	public void cliquer_sur_groupe() throws Throwable {
		grp = new groupe(Browserhelper.driver);
		grp.cliquer_sur_groupe(Browserhelper.driver);
	}

	@When("Cliquer sur un nouveau groupe")
	public void cliquer_sur_un_nouveau_groupe() throws Throwable {
		grp.cliquer_sur_un_nouveau_groupe(Browserhelper.driver);
	}

	@When("Entrer le nom {string}")
	public void modifier_objet_avec_le_nom(String Nomgrp) throws Throwable {
		grp.entrer_le_nom(Browserhelper.driver, Nomgrp);
	}

	@When("Selectionner le type daccee")
	public void selectionner_le_type_daccee() throws Throwable {
		grp.selectionner_le_type_daccee(Browserhelper.driver);
	}

	@Then("Cliquer sur enregistrer et suivant")
	public void cliquer_sur_enregistrer_et_suivant() throws Throwable {
		grp.cliquer_sur_enregistrer_et_suivant(Browserhelper.driver);
	}

	@When("Cliquer sur charger limage")
	public void cliquer_sur_charger_limage() throws Throwable {
		grp.cliquer_sur_charger_limage(Browserhelper.driver);
	}

	@When("Cliquer sur enregistrer le groupe")
	public void cliquer_sur_enregistrer_le_groupe() throws Throwable {
		grp.cliquer_sur_enregistrer_le_groupe(Browserhelper.driver);
	}

	@When("verifier le nom du groupe")
	public void verifier_le_nom_du_groupe() throws Throwable {
		grp.verifier_le_nom_du_groupe(Browserhelper.driver);
	}

	@When("Chercher le groupe par le nom")
	public void chercher_le_groupe_par_le_nom() throws Throwable {
		grp.chercher_le_groupe_par_le_nom(Browserhelper.driver);
	}

	@When("Selectionner le groupe")
	public void selectionner_le_groupe() throws Throwable {
		grp.selectionner_le_groupe(Browserhelper.driver);
	}

	@When("Cliquer sur modifier groupe")
	public void cliquer_sur_modifier_groupe() throws Throwable {
		grp.cliquer_sur_modifier_groupe(Browserhelper.driver);
	}

	@Then("Modifier  le nom du groupe {string}")
	public void modifier_le_nom_du_groupe(String ngrp) throws Throwable {
		grp.modifier_le_nom_du_groupe(Browserhelper.driver, ngrp);
	}

	@Then("Modifier le Type daccès")
	public void modifier_le_type_daccès() throws Throwable {
		grp.modifier_le_type_daccès(Browserhelper.driver);
	}

	@Then("Cliquer sur enrigistrer modification")
	public void cliquer_sur_enrigistrer_modification() throws Throwable {
		grp.cliquer_sur_enrigistrer_modification(Browserhelper.driver);
	}

	@When("Cliquer sur supprimer groupe")
	public void Cliquer_sur_supprimer_groupe() throws Throwable {
		grp.Cliquer_sur_supprimer_groupe(Browserhelper.driver);
	}
	@Then("Cliquer sur nouvelle opportunité")
	public void cliquer_sur_nouvelle_opportunité()throws Throwable {
		grp.cliquer_sur_nouvelle_opportunité(Browserhelper.driver);

	}

	@Then("Entrer le nom de lopportunité {string}")
	public void entrer_le_nom_de_lopportunité(String nomopp)throws Throwable {
		grp.entrer_le_nom_de_lopportunité(Browserhelper.driver, nomopp);

	}

	@Then("Selectionner etape")
	public void selectionner_etape()throws Throwable {
		grp.selectionner_etape(Browserhelper.driver);

	}

	@Then("Cliquer sur enregistrer opportunité")
	public void cliquer_sur_enregistrer_opportunité()throws Throwable {
		grp.cliquer_sur_enregistrer_opportunité(Browserhelper.driver);

	}
	@Then("verification  creation  opportunité dans un groupe")
	public void verification_creation_opportunité_dans_un_groupe()throws Throwable {
		grp.verification_creation_opportunité_dans_un_groupe(Browserhelper.driver);
	   
	}

}
