package features;

import cucumber.api.java.en.When;
import fansMatches.AdapterJoueur;

import org.junit.Assert;

import PinkFloyd.Fan;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class adaptFanPinkfloydJoueur {
	Fan fan1 = new Fan("Isac" , "0765784939" , "isac.fr201@gmail.com" );
	AdapterJoueur fanJoueur1 = null;
  	@Given("un fan des PinkFloyd")
    public void creerJoueur() {
  		fanJoueur1 = new AdapterJoueur(fan1);
        Assert.assertTrue(this.fanJoueur1!=null);
    }
  	
    @When("marque")
    public void marquerUnBut() {
        this.fanJoueur1.addNbrBut();
        Assert.assertTrue(this.fanJoueur1.getNbrBut()==1);
    	
    }
    @Then("Son nombre de but augmentera")
    public void butsIncrementer() {
    	Assert.assertTrue(this.fanJoueur1.getNbrBut()==1);
    }
    
    @When("le fan commet deux fautes")
    public void commetreFaute() {
        this.fanJoueur1.addNbrFaute();
        Assert.assertTrue(this.fanJoueur1.getNbrFaute()==1);
        this.fanJoueur1.addNbrFaute();
        Assert.assertTrue(this.fanJoueur1.getNbrFaute()==2);
    	
    }
    @Then("le fan prend un carton rouge")
    public void prendreCartonRouge() {
    	Assert.assertTrue(this.fanJoueur1.getDroitDeJouer()==false);
    	Assert.assertTrue(this.fanJoueur1.getNbrFaute()==2);
    }

}
