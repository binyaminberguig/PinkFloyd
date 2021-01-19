package Football;

/**
 * Décrivez votre classe Adresse ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Adresse
{
    private String ville;

    public Adresse()
    {
        this.ville = "paris";
    }

    
     public String getVille()
    {
        return this.ville;
    }
    
      public String setVille(String ville)
    {
        return this.ville = ville;
    }
}
