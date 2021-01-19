package PinkFloyd;

import fansMatches.Personne;

public class Fan implements Personne {
	
	private String name;
	private String phoneNumber;
	private String emailAdresse;
	private Membre membrePrefere;
	
	public Fan(String name, String phone, String email) {
		this.name = name;
		this.membrePrefere = null;
		this.emailAdresse = email;
		this.phoneNumber = phone;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAdresse() {
		return emailAdresse;
	}


	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}


	public Membre getMembrePrefere() {
		return membrePrefere;
	}


	public void setMembrePrefere(Membre membrePrefere) {
		this.membrePrefere = membrePrefere;
	}


	/**public void participerConcert() {
		// TODO Auto-generated method stub
		
	}


	public void participerRencontre() {
		// TODO Auto-generated method stub
		
	}*/

}
