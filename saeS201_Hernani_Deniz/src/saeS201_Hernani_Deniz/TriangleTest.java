package saeS201_Hernani_Deniz;

import static org.junit.Assert.*;

import ardoise.PointPlan;
import ardoise.Segment;
import org.junit.Test;

import java.util.ArrayList;

public class TriangleTest {

    @Test
    public void testDessiner() {
        // Points pour le premier triangle
        PointPlan point1Triangle1 = new PointPlan(3, 14);
        PointPlan point2Triangle1 = new PointPlan(43, 3);
        PointPlan point3Triangle1 = new PointPlan(112, 14);

        // Instanciation du premier triangle
        Triangle triangle1 = new Triangle(point1Triangle1, point2Triangle1, point3Triangle1);

        // Vérification des segments générés par la méthode dessiner()
        ArrayList<Segment> segmentsTriangle1 = triangle1.dessiner();

        // Vérification du nombre de segments générés
        assertEquals(3, segmentsTriangle1.size());

        // Vérification des coordonnées des segments
        assertEquals(point1Triangle1, segmentsTriangle1.get(0).getPointDepart());
        assertEquals(point2Triangle1, segmentsTriangle1.get(0).getPointArrivee());

        assertEquals(point2Triangle1, segmentsTriangle1.get(1).getPointDepart());
        assertEquals(point3Triangle1, segmentsTriangle1.get(1).getPointArrivee());

        assertEquals(point3Triangle1, segmentsTriangle1.get(2).getPointDepart());
        assertEquals(point1Triangle1, segmentsTriangle1.get(2).getPointArrivee());

        // Points pour le deuxième triangle
        PointPlan point1Triangle2 = new PointPlan(152, 7);
        PointPlan point2Triangle2 = new PointPlan(166, 3);
        PointPlan point3Triangle2 = new PointPlan(172, 7);

        // Instanciation du deuxième triangle
        Triangle triangle2 = new Triangle(point1Triangle2, point2Triangle2, point3Triangle2);

        // Vérification des segments générés par la méthode dessiner()
        ArrayList<Segment> segmentsTriangle2 = triangle2.dessiner();

        // Vérification du nombre de segments générés
        assertEquals(3, segmentsTriangle2.size());

        // Vérification des coordonnées des segments
        assertEquals(point1Triangle2, segmentsTriangle2.get(0).getPointDepart());
        assertEquals(point2Triangle2, segmentsTriangle2.get(0).getPointArrivee());

        assertEquals(point2Triangle2, segmentsTriangle2.get(1).getPointDepart());
        assertEquals(point3Triangle2, segmentsTriangle2.get(1).getPointArrivee());

        assertEquals(point3Triangle2, segmentsTriangle2.get(2).getPointDepart());
        assertEquals(point1Triangle2, segmentsTriangle2.get(2).getPointArrivee());
    }
}
