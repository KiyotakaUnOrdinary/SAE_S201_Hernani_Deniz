package saeS201_Hernani_Deniz;

import static org.junit.Assert.*;

import ardoise.PointPlan;
import ardoise.Segment;
import org.junit.Test;

import java.util.ArrayList;

public class MaisonTest {

    @Test
    public void testDessiner() {
        // Coordonnées pour chaque structure de la maison
        Quadrilatere corpsMaison = new Quadrilatere(new PointPlan(80, 140), new PointPlan(180, 198));
        Triangle toitMaison = new Triangle(new PointPlan(80, 140), new PointPlan(130, 100), new PointPlan(180, 140));
        Quadrilatere porteMaison = new Quadrilatere(new PointPlan(120, 170), new PointPlan(140, 198));

        // Instanciation de la maison avec les structures
        Maison maison = new Maison(corpsMaison, toitMaison, porteMaison);

        // Vérification des segments générés par la méthode dessiner()
        ArrayList<Segment> segments = maison.dessiner();

        // Vérification du nombre de segments générés
        assertEquals(10, segments.size());

        // Vérification des coordonnées des segments du corps de la maison
        assertEquals(new PointPlan(80, 140), segments.get(0).getPointDepart());
        assertEquals(new PointPlan(180, 140), segments.get(0).getPointArrivee());

        assertEquals(new PointPlan(180, 140), segments.get(1).getPointDepart());
        assertEquals(new PointPlan(180, 198), segments.get(1).getPointArrivee());

        assertEquals(new PointPlan(180, 198), segments.get(2).getPointDepart());
        assertEquals(new PointPlan(80, 198), segments.get(2).getPointArrivee());

        assertEquals(new PointPlan(80, 198), segments.get(3).getPointDepart());
        assertEquals(new PointPlan(80, 140), segments.get(3).getPointArrivee());

        // Vérification des coordonnées des segments du toit de la maison
        assertEquals(new PointPlan(80, 140), segments.get(4).getPointDepart());
        assertEquals(new PointPlan(130, 100), segments.get(4).getPointArrivee());

        assertEquals(new PointPlan(130, 100), segments.get(5).getPointDepart());
        assertEquals(new PointPlan(180, 140), segments.get(5).getPointArrivee());

        // Vérification des coordonnées des segments de la porte de la maison
        assertEquals(new PointPlan(120, 170), segments.get(6).getPointDepart());
        assertEquals(new PointPlan(140, 170), segments.get(6).getPointArrivee());

        assertEquals(new PointPlan(140, 170), segments.get(7).getPointDepart());
        assertEquals(new PointPlan(140, 198), segments.get(7).getPointArrivee());

        assertEquals(new PointPlan(140, 198), segments.get(8).getPointDepart());
        assertEquals(new PointPlan(120, 198), segments.get(8).getPointArrivee());

        assertEquals(new PointPlan(120, 198), segments.get(9).getPointDepart());
        assertEquals(new PointPlan(120, 170), segments.get(9).getPointArrivee());
    }
}
