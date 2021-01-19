package yo.agile.projetAgile2020;

import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import Football.Equipe;
import Football.Joueur;
import Football.match;

import org.junit.Assert;

@RunWith(Cucumber.class) 
public class EquipeStep{
	
	Joueur joueurs = new Joueur();
	Equipe equipe1;
	Equipe equipe2;
	match monMatch;
	
	  	@Given("une premiere equipe")
	    public void creationEquipe1() {
	  		int i =0;
	  		equipe1 = new Equipe(joueurs ,"France", "rouge");
	  		while (i<10){
		  			equipe1.getMesJoueurs().add(joueurs);
		  		i+=1;
	  		}
	        Assert.assertTrue(this.equipe1!=null);
	        Assert.assertTrue(this.equipe1.getMesJoueurs().size()==11);
	        
	    }
	  	
	  	@Given("une deuxieme equipe")
	    public void creationEquipe2() {
	  		int j =0;
	  		equipe2 = new Equipe(joueurs ,"France", "rouge");
	  		while (j<11){
	  			equipe2.getMesJoueurs().add(joueurs);
		  		j+=1;
		  	}
	        Assert.assertTrue(this.equipe2!=null);
	        Assert.assertTrue(this.equipe1.getMesJoueurs().size()==11);
	    }
	  	
	  	@Given("creation du match")
	    public void creationMatch() {
	  		monMatch = new match(equipe1, equipe2);
	        Assert.assertTrue(this.monMatch!=null);
	    }
	  	
	    @When("equipe un marque un but")
	    public void equipeMarqueUnBut() {
	        this.monMatch.setScore("1-0");
	        Assert.assertTrue(this.monMatch.getScore()=="1-0");	
	    }
	    
	    @Then("le score change")
	    public void scoreChange() {
	    	Assert.assertTrue(this.monMatch.getScore()=="1-0");
	    }
	    
	    @When("equipe un commet une faute")
	    public void equipeCommetFaute() {
	        this.monMatch.setNbrFaute();
	        this.equipe1.setFaute();
	        Assert.assertTrue(this.equipe1.getNbrFaute()!=0);	
	    	Assert.assertTrue(this.monMatch.getNbrFaute()!=0);
	    }
	    
	    @Then("le nombre de fautes change")
	    public void nbrFautesChange() {
	    	Assert.assertTrue(this.equipe1.getNbrFaute()==1);	
	    	Assert.assertTrue(this.monMatch.getNbrFaute()==1);
	    }
	    
	   
}