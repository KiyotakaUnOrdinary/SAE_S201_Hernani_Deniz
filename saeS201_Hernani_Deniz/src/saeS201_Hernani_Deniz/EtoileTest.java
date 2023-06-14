package saeS201_Hernani_Deniz;

import static org.junit.Assert.*;
import org.junit.Test;
import ardoise.PointPlan;
import ardoise.Segment;

public class EtoileTest {

	@Test
	public void testDessiner() {
		// Création des segments pour les branches
		Segment segment1 = new Segment(new PointPlan(170, 52), new PointPlan(173, 45));
		Segment segment2 = new Segment(new PointPlan(173, 45), new PointPlan(177, 52));
		Segment segment3 = new Segment(new PointPlan(177, 52), new PointPlan(184, 57));
		Segment segment4 = new Segment(new PointPlan(184, 57), new PointPlan(177, 60));
		Segment segment5 = new Segment(new PointPlan(177, 60), new PointPlan(174, 66));
		Segment segment6 = new Segment(new PointPlan(174, 66), new PointPlan(170, 60));
		Segment segment7 = new Segment(new PointPlan(170, 60), new PointPlan(164, 57));
		Segment segment8 = new Segment(new PointPlan(164, 57), new PointPlan(170, 52));
		
		// Création des branches
		Chapeau branche1 = new Chapeau(new PointPlan(170, 52), new PointPlan(173, 45), new PointPlan(177, 52));
		Chapeau branche2 = new Chapeau(new PointPlan(177, 52), new PointPlan(184, 57), new PointPlan(177, 60));
		 Chapeau branche3 = new Chapeau(new PointPlan(177, 60), new PointPlan(174, 66), new PointPlan(170, 60));
		 Chapeau branche4 = new Chapeau(new PointPlan(170, 60), new PointPlan(164, 57), new PointPlan(170, 52));
		
		// Création de l'objet Etoile
		Etoile etoile = new Etoile(branche1, branche2, branche3, branche4);
		
		// Appel de la méthode dessiner()
		assertEquals("Le nombre de segments doit être égal à 8", 8, etoile.dessiner().size());
		
		// Vérification des segments
		assertTrue("Le segment 1 doit être présent", etoile.dessiner().contains(segment1));
		assertTrue("Le segment 2 doit être présent", etoile.dessiner().contains(segment2));
		assertTrue("Le segment 3 doit être présent", etoile.dessiner().contains(segment3));
		assertTrue("Le segment 4 doit être présent", etoile.dessiner().contains(segment4));
		assertTrue("Le segment 5 doit être présent", etoile.dessiner().contains(segment5));
		assertTrue("Le segment 6 doit être présent", etoile.dessiner().contains(segment6));
		assertTrue("Le segment 7 doit être présent", etoile.dessiner().contains(segment7));
		assertTrue("Le segment 8 doit être présent", etoile.dessiner().contains(segment8));
	}

	@Test
	public void testDeplacer() {
		// Création des branches
		Chapeau branche1 = new Chapeau(new PointPlan(170, 52), new PointPlan(173, 45), new PointPlan(177, 52));
		Chapeau branche2 = new Chapeau(new PointPlan(177, 52), new PointPlan(184, 57), new PointPlan(177, 60));
		 Chapeau branche3 = new Chapeau(new PointPlan(177, 60), new PointPlan(174, 66), new PointPlan(170, 60));
		 Chapeau branche4 = new Chapeau(new PointPlan(170, 60), new PointPlan(164, 57), new PointPlan(170, 52));
		
		// Création de l'objet Etoile
		Etoile etoile = new Etoile(branche1, branche2, branche3, branche4);
		
		// Déplacement de l'étoile
		etoile.deplacer(10, 20);
		
		// Vérification des coordonnées après déplacement
		assertEquals("Coordonnée X du point 1 de la branche 1 doit être 180", 180, branche1.getPoint1().getAbscisse());
		assertEquals("Coordonnée Y du point 1 de la branche 1 doit être 72", 72, branche1.getPoint1().getOrdonnee());
		assertEquals("Coordonnée X du point 2 de la branche 1 doit être 183", 183, branche1.getPoint2().getAbscisse());
		assertEquals("Coordonnée Y du point 2 de la branche 1 doit être 65", 65, branche1.getPoint2().getOrdonnee());
		assertEquals("Coordonnée X du point 3 de la branche 1 doit être 187", 187, branche1.getPoint3().getAbscisse());
		assertEquals("Coordonnée Y du point 3 de la branche 1 doit être 72", 72, branche1.getPoint3().getOrdonnee());
		
		assertEquals("Coordonnée X du point 1 de la branche 2 doit être 187", 187, branche2.getPoint1().getAbscisse());
		assertEquals("Coordonnée Y du point 1 de la branche 2 doit être 72", 72, branche2.getPoint1().getOrdonnee());
		assertEquals("Coordonnée X du point 2 de la branche 2 doit être 194", 194, branche2.getPoint2().getAbscisse());
		assertEquals("Coordonnée Y du point 2 de la branche 2 doit être 77", 77, branche2.getPoint2().getOrdonnee());
		assertEquals("Coordonnée X du point 3 de la branche 2 doit être 187", 187, branche2.getPoint3().getAbscisse());
		assertEquals("Coordonnée Y du point 3 de la branche 2 doit être 80", 80, branche2.getPoint3().getOrdonnee());
		
		assertEquals("Coordonnée X du point 1 de la branche 3 doit être 187", 187, branche3.getPoint1().getAbscisse());
		assertEquals("Coordonnée Y du point 1 de la branche 3 doit être 80", 80, branche3.getPoint1().getOrdonnee());
		assertEquals("Coordonnée X du point 2 de la branche 3 doit être 184", 184, branche3.getPoint2().getAbscisse());
		assertEquals("Coordonnée Y du point 2 de la branche 3 doit être 86", 86, branche3.getPoint2().getOrdonnee());
		assertEquals("Coordonnée X du point 3 de la branche 3 doit être 180", 180, branche3.getPoint3().getAbscisse());
		assertEquals("Coordonnée Y du point 3 de la branche 3 doit être 80", 80, branche3.getPoint3().getOrdonnee());
		
		assertEquals("Coordonnée X du point 1 de la branche 4 doit être 180", 180, branche4.getPoint1().getAbscisse());
		assertEquals("Coordonnée Y du point 1 de la branche 4 doit être 80", 80, branche4.getPoint1().getOrdonnee());
		assertEquals("Coordonnée X du point 2 de la branche 4 doit être 174", 174, branche4.getPoint2().getAbscisse());
		assertEquals("Coordonnée Y du point 2 de la branche 4 doit être 77", 77, branche4.getPoint2().getOrdonnee());
		assertEquals("Coordonnée X du point 3 de la branche 4 doit être 180", 180, branche4.getPoint3().getAbscisse());
		assertEquals("Coordonnée Y du point 3 de la branche 4 doit être 72", 72, branche4.getPoint3().getOrdonnee());
	}

	@Test
	public void testTypeForme() {
		// Création des branches
		Chapeau branche1 = new Chapeau(new PointPlan(170, 52), new PointPlan(173, 45), new PointPlan(177, 52));
		Chapeau branche2 = new Chapeau(new PointPlan(177, 52), new PointPlan(184, 57), new PointPlan(177, 60));
		 Chapeau branche3 = new Chapeau(new PointPlan(177, 60), new PointPlan(174, 66), new PointPlan(170, 60));
		 Chapeau branche4 = new Chapeau(new PointPlan(170, 60), new PointPlan(164, 57), new PointPlan(170, 52));
		
		// Création de l'objet Etoile
		Etoile etoile = new Etoile(branche1, branche2, branche3, branche4);
		
		// Vérification du type de forme
		assertEquals("Le type de forme doit être 'GF'", "GF", etoile.typeForme());
	}

	@Test
	public void testToString() {
		// Création des branches
		Chapeau branche1 = new Chapeau(new PointPlan(170, 52), new PointPlan(173, 45), new PointPlan(177, 52));
		Chapeau branche2 = new Chapeau(new PointPlan(177, 52), new PointPlan(184, 57), new PointPlan(177, 60));
		 Chapeau branche3 = new Chapeau(new PointPlan(177, 60), new PointPlan(174, 66), new PointPlan(170, 60));
		 Chapeau branche4 = new Chapeau(new PointPlan(170, 60), new PointPlan(164, 57), new PointPlan(170, 52));
		
		// Création de l'objet Etoile
		Etoile etoile = new Etoile(branche1, branche2, branche3, branche4);
		
		// Vérification de la méthode toString()
		String expectedString = "Etoile:\n" +
                                "Branche 1:\n" +
                                branche1 + "\n" +
                                "Branche 2:\n" +
                                branche2 + "\n" +
                                "Branche 3:\n" +
                                branche3 + "\n" +
                                "Branche 4:\n" +
                                branche4;
		assertEquals("La méthode toString() doit renvoyer la chaîne de caractères attendue", expectedString, etoile.toString());
	}
}
