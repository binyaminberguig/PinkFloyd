package Football;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipe {
	
	private ArrayList<Joueur> mesJoueurs ;
	private String pays;
	private String couleurMaillot;
	private int nbrFaute;

	public Equipe(Joueur monJoueur, String pays, String couleurMaillot){
		this.mesJoueurs = new ArrayList<Joueur>();
		this.mesJoueurs.add(monJoueur);
		this.pays = pays;
		this.couleurMaillot = couleurMaillot;
		this.nbrFaute = 0;
	}
	
	public ArrayList<Joueur> getMesJoueurs() {
		return mesJoueurs;
	}
	
	public String getPays() {
		return pays;
	}
	
	public int getNbrFaute() {
		return this.nbrFaute;
	}
	
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	public void setFaute() {
		this.nbrFaute +=1;
	}
	
	public String getCouleurMaillot() {
		return couleurMaillot;
	}
	
	public void setCouleurMaillot(String couleurMaillot) {
		this.couleurMaillot = couleurMaillot;
	}
	

}
