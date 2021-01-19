package test.Football;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Football.Adresse;
import Football.Joueur;

/**
 * Classe-test AdresseTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class AdresseTest
{
    private Adresse adresse1;
    private Joueur joueurs1;

    
    
   
    public AdresseTest()
    {
    }

    @Before
    public void setUp() // throws java.lang.Exception
    {
        adresse1 = new Adresse();
        joueurs1 = new Joueur();
    }

    
    @After
    public void tearDown() // throws java.lang.Exception
    {
       
    }

 

    @Test
    public void testAdresse()
    {
        assertEquals("paris", adresse1.getVille());
    }
}


