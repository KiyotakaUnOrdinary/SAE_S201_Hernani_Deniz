package saeS201_Hernani_Deniz;

import static org.junit.Assert.*;

import ardoise.PointPlan;
import ardoise.Segment;
import org.junit.Test;

import java.util.ArrayList;

public class QuadrilatereTest {

    @Test
    public void testDessiner() {
        // Coordonnées du quadrilatère
        PointPlan pointSuperieurGauche = new PointPlan(9, 100);
        PointPlan pointInferieurDroit = new PointPlan(20, 198);

        // Instanciation du quadrilatère
        Quadrilatere quadrilatere = new Quadrilatere(pointSuperieurGauche, pointInferieurDroit);

        // Vérification des segments générés par la méthode dessiner()
        ArrayList<Segment> segments = quadrilatere.dessiner();

        // Vérification du nombre de segments générés
        assertEquals(4, segments.size());

        // Vérification des coordonnées des segments
        assertEquals(pointSuperieurGauche, segments.get(0).getPointDepart());
        assertEquals(new PointPlan(pointSuperieurGauche.getAbscisse(), pointInferieurDroit.getOrdonnee()), segments.get(0).getPointArrivee());

        assertEquals(new PointPlan(pointSuperieurGauche.getAbscisse(), pointInferieurDroit.getOrdonnee()), segments.get(1).getPointDepart());
        assertEquals(pointInferieurDroit, segments.get(1).getPointArrivee());

        assertEquals(pointInferieurDroit, segments.get(2).getPointDepart());
        assertEquals(new PointPlan(pointInferieurDroit.getAbscisse(), pointSuperieurGauche.getOrdonnee()), segments.get(2).getPointArrivee());

        assertEquals(new PointPlan(pointInferieurDroit.getAbscisse(), pointSuperieurGauche.getOrdonnee()), segments.get(3).getPointDepart());
        assertEquals(pointSuperieurGauche, segments.get(3).getPointArrivee());
    }

    @Test
    public void testDeplacer() {
        // Coordonnées du quadrilatère
        PointPlan pointSuperieurGauche = new PointPlan(9, 100);
        PointPlan pointInferieurDroit = new PointPlan(20, 198);

        // Instanciation du quadrilatère
        Quadrilatere quadrilatere = new Quadrilatere(pointSuperieurGauche, pointInferieurDroit);

        // Déplacement du quadrilatère
        int deplacementX = 5;
        int deplacementY = -10;
        quadrilatere.deplacer(deplacementX, deplacementY);

        // Vérification des nouvelles coordonnées des points du quadrilatère
        assertEquals(pointSuperieurGauche.getAbscisse() + deplacementX, quadrilatere.getPointSuperieurGauche().getAbscisse());
        assertEquals(pointSuperieurGauche.getOrdonnee() + deplacementY, quadrilatere.getPointSuperieurGauche().getOrdonnee());

        assertEquals(pointInferieurDroit.getAbscisse() + deplacementX, quadrilatere.getPointInferieurDroit().getAbscisse());
        assertEquals(pointInferieurDroit.getOrdonnee() + deplacementY, quadrilatere.getPointInferieurDroit().getOrdonnee());
    }

    @Test
    public void testTypeForme() {
        // Coordonnées du quadrilatère
        PointPlan pointSuperieurGauche = new PointPlan(9, 100);
        PointPlan pointInferieurDroit = new PointPlan(20, 198);

        // Instanciation du quadrilatère
        Quadrilatere quadrilatere = new Quadrilatere(pointSuperieurGauche, pointInferieurDroit);

        // Vérification du type de forme
        assertEquals("Quadrilatere", quadrilatere.typeForme());
    }

    @Test
    public void testPointSuperieurGauche() {
        // Coordonnées du quadrilatère
        PointPlan pointSuperieurGauche = new PointPlan(9, 100);
        PointPlan pointInferieurDroit = new PointPlan(20, 198);

        // Instanciation du quadrilatère
        Quadrilatere quadrilatere = new Quadrilatere(pointSuperieurGauche, pointInferieurDroit);

        // Vérification du point supérieur gauche
        assertEquals(pointSuperieurGauche, quadrilatere.getPointSuperieurGauche());
    }

    @Test
    public void testPointInferieurDroit() {
        // Coordonnées du quadrilatère
        PointPlan pointSuperieurGauche = new PointPlan(9, 100);
        PointPlan pointInferieurDroit = new PointPlan(20, 198);

        // Instanciation du quadrilatère
        Quadrilatere quadrilatere = new Quadrilatere(pointSuperieurGauche, pointInferieurDroit);

        // Vérification du point inférieur droit
        assertEquals(pointInferieurDroit, quadrilatere.getPointInferieurDroit());
    }
}
