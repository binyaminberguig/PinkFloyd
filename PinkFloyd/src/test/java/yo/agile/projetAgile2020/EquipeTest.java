package yo.agile.projetAgile2020;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Football.Equipe;
import Football.Joueur;

/**
 * Classe-test JoueursTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 */
public class EquipeTest
{
    private Equipe equipe1;
    private Joueur joueurs1;
    private ArrayList<Joueur> mesJoueurs = new ArrayList<Joueur>();
    

    /**
     * Constructeur de la classe-test JoueursTest
     */
    public EquipeTest()
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
        equipe1 = new Equipe(joueurs1 ,new String("France"), new String("rouge"));    
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
    public void testMesJoueurs()
    {
    	ArrayList<Joueur> mesJoueurs = new ArrayList<Joueur>();
    	mesJoueurs.add(joueurs1);
        assertEquals(mesJoueurs, equipe1.getMesJoueurs());
    }
    
    @Test
    public void testPays()
    {
        assertEquals("France", equipe1.getPays());
    }
    
    @Test
    public void testCouleurMaillot()
    {
        assertEquals("rouge", equipe1.getCouleurMaillot());
    }
}

