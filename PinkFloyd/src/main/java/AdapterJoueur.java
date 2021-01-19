

import Football.Joueur;
import PinkFloyd.Fan;

class AdapterJoueur extends Joueur {
Fan fan ;
	public AdapterJoueur(Fan fan) {
		super();
		this.fan = fan ;
	}

	public String getNom() {
		return this.fan.getName();
	}
	public void setNom(String name) {
		this.fan.setName(name);
	}
	
}
