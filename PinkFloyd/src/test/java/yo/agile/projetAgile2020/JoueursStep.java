package yo.agile.projetAgile2020;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Football.Joueur;

import org.junit.Assert;

@RunWith(Cucumber.class) 
public class JoueursStep{
	
	Joueur joueurs1 = new Joueur();
	
	  	@Given("un joueur")
	    public void creationJoueur() {
	        Assert.assertTrue(this.joueurs1!=null);
	    }
	    @When("il marque un but")
	    public void ilMarqueUnBut() {
	        this.joueurs1.addNbrBut();
	        Assert.assertTrue(this.joueurs1.getNbrBut()==1);
	    	
	    }
	    @Then("Son nombre de but augmente")
	    public void CompteurDeButIncrementer() {
	    	Assert.assertTrue(this.joueurs1.getNbrBut()==1);
	    }
	    
	    @When("il commet deux fautes")
	    public void ilCommetUneFaute() {
	        this.joueurs1.addNbrFaute();
	        Assert.assertTrue(this.joueurs1.getNbrFaute()==1);
	        this.joueurs1.addNbrFaute();
	        Assert.assertTrue(this.joueurs1.getNbrFaute()==2);
	    	
	    }
	    @Then("il prend un carton rouge")
	    public void ilPrendUnCartonRouge() {
	    	Assert.assertTrue(this.joueurs1.getDroitDeJouer()==false);
	    	Assert.assertTrue(this.joueurs1.getNbrFaute()==2);
	    }
}
