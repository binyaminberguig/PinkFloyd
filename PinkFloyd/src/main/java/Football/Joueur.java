package Football;

import fansMatches.Personne;

/**
 * Décrivez votre classe Joueur ici.
 *
 * @author Aidan, Naccache
 * @version (un numéro de version ou une date)
 */
public class Joueur implements Personne
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int age;
    protected String nom;
    private Adresse monAdresse;
    private int nbrBut;
    private int nbrFaute;
    private boolean DroitDeJouer = true;

    /**
     * Constructeur d'objets de classe Joueur
     */
    public Joueur()
    {
         this.age = 25;
         this.nom = "yohan";
         this.monAdresse = new Adresse(); 
         this.nbrBut = 0;
         this.nbrFaute = 0;
    }

 
    public String toString() {
         return "Le joueur à : " + this.age + 
         " ans, il s'appelle : " + this.nom +
         " , il a marqué : " + this.nbrBut +
         " , il a : " + this.nbrFaute +
         " fautes et son adresse est " + this.monAdresse.getVille();
    }
    
     public int getAge()
    {
        return this.age;
    }
    
     public String getNom()
    {
        return this.nom;
    }
    
     public String getAdresse()
    {
        return this.monAdresse.getVille();
    }
     
     public int getNbrBut()
     {
         return this.nbrBut;
     }
     
     public void addNbrBut()
     {
         this.nbrBut+=1;
     }
     
     public int getNbrFaute()
     {
         return this.nbrFaute;
     }
     
     public void addNbrFaute()
     {
         this.nbrFaute+=1;
         
     }
     
     public boolean getDroitDeJouer()
     {
    	 if (this.nbrFaute>1){
        	 this.DroitDeJouer=false;
         }
         return this.DroitDeJouer;
     }
}
