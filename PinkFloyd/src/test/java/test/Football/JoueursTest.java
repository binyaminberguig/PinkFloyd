package test.Football;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Football.Joueur;
import junit.framework.TestCase;

/**
 * Classe-test JoueursTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class JoueursTest extends TestCase
{
    private Joueur joueurs1;

    /**
     * Constructeur de la classe-test JoueursTest
     */
    public JoueursTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        joueurs1 = new Joueur();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testAge()
    {
        assertEquals(25, joueurs1.getAge());
    }
    @Test
    public void testNom()
    {
    	Assert.assertEquals("yohan", joueurs1.getNom());
    }
    @Test
    public void testptAdresse()
    {
        assertEquals("paris", joueurs1.getAdresse());
    }
    
    @Test
    public void testNbrBut()
    {
        assertEquals(0, joueurs1.getNbrBut());
    }
    
    @Test
    public void testJoueurs()
    {
    	checkJoueurs();
    }

	private void checkJoueurs() {
		assertEquals(25, joueurs1.getAge());
    	assertEquals("yohan", joueurs1.getNom());
        assertEquals("paris", joueurs1.getAdresse());
        assertEquals(0, joueurs1.getNbrBut());
        assertEquals(0, joueurs1.getNbrFaute());
	}
    
}

