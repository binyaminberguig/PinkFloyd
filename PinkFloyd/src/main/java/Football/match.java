package Football;

import java.util.ArrayList;

public class match {
 private String score;
 private int nbrFaute;
 private ArrayList<Equipe> equipeDansLeMatch = new ArrayList<Equipe>();	
 
 
 public match(Equipe equipe1, Equipe equipe2) {
	 	equipeDansLeMatch.add(equipe1);
	 	equipeDansLeMatch.add(equipe2);
		this.score = "0-0";
		this.nbrFaute = 0;
	}
 
 public String getScore() {
		return this.score;
	}
 public int getNbrFaute() {
		return this.nbrFaute;
	}
 public void  setScore(String score) {
	 this.score=score;
	}
 public void setNbrFaute() {
		 this.nbrFaute+=1;
	}
}
