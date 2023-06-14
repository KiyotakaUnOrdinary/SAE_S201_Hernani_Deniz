package saeS201_Hernani_Deniz;

import static org.junit.Assert.*;
import org.junit.Test;
import ardoise.PointPlan;
import ardoise.Segment;

public class ChapeauTest {

	@Test
	public void testDessiner() {
		// Création des points
		PointPlan point1 = new PointPlan(118, 13);
		PointPlan point2 = new PointPlan(123, 20);
		PointPlan point3 = new PointPlan(128, 13);
		
		// Création de l'objet Chapeau
		Chapeau chapeau = new Chapeau(point1, point2, point3);
		
		// Appel de la méthode dessiner()
		assertEquals("Le nombre de segments doit être égal à 2", 2, chapeau.dessiner().size());
		
		// Vérification des segments
		Segment segment1 = chapeau.dessiner().get(0);
		assertEquals("Le segment 1 doit relier le point 1 au point 2", segment1.getPointDepart(), point1);
		assertEquals("Le segment 1 doit relier le point 1 au point 2", segment1.getPointArrivee(), point2);
		
		Segment segment2 = chapeau.dessiner().get(1);
		assertEquals("Le segment 2 doit relier le point 2 au point 3", segment2.getPointArrivee(), point2);
		assertEquals("Le segment 2 doit relier le point 2 au point 3", segment2.getPointArrivee(), point3);
	}

	@Test
	public void testDeplacer() {
		// Création des points
		PointPlan point1 = new PointPlan(118, 13);
		PointPlan point2 = new PointPlan(123, 20);
		PointPlan point3 = new PointPlan(128, 13);
		
		// Création de l'objet Chapeau
		Chapeau chapeau = new Chapeau(point1, point2, point3);
		
		// Déplacement du chapeau
		chapeau.deplacer(10, 20);
		
		// Vérification des nouvelles coordonnées des points
		assertEquals("L'abscisse du point 1 doit être 128", 128, chapeau.getPoint1().getAbscisse());
		assertEquals("L'ordonnée du point 1 doit être 33", 33, chapeau.getPoint1().getOrdonnee());
		
		assertEquals("L'abscisse du point 2 doit être 133", 133, chapeau.getPoint2().getAbscisse());
		assertEquals("L'ordonnée du point 2 doit être 40", 40, chapeau.getPoint2().getOrdonnee());
		
		assertEquals("L'abscisse du point 3 doit être 138", 138, chapeau.getPoint3().getAbscisse());
		assertEquals("L'ordonnée du point 3 doit être 33", 33, chapeau.getPoint3().getOrdonnee());
	}
}
