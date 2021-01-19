package features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.*;

import PinkFloyd.*;

public class FunctionalTestForPinkFoyd {
	private Membre membre1 = new Membre();
	private Membre membre2 = new Membre();
	@Given("la creation d un membre {string}")
	public void la_creation_d_un_membre(String string) {
	    // Write code here that turns the phrase above into concrete actions
		this.membre1 = new Membre();
	}

	@When("l utilisateur valide la creation")
	public void l_utilisateur_valide_la_creation() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(membre1.getName() != "");
	}
	
	
	@Then("le systeme ne valide pas avec le {string} si l utilisateur existe deja.")
	public void le_systeme_ne_valide_pas_avec_le_si_l_utilisateur_existe_deja(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(string, "L'utilsateur existe deja"); 
	}
	
	
	
	

	@Given("la creation d un membre {string} et d age {int}")
	public void la_creation_d_un_membre_et_d_age(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    this.membre2 = new Membre(string, int1);
	   
	    if (this.membre2.getAge()<0) {
	    	 this.membre2.setMessageError("Age Negatif");
	    } else {
	    	 this.membre2.setMessageError("Age Positif");
	    }
	}

	@Then("le systeme refuse avec le {string}")
	public void le_systeme_refuse_avec_le(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(string, this.membre2.getMessageError() ); 
	}
		

	
}
