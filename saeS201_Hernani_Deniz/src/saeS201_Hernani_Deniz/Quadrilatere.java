package saeS201_Hernani_Deniz;

import ardoise.*;
import java.util.ArrayList;

public class Quadrilatere extends Forme {
    private PointPlan pointSuperieurGauche;
    private PointPlan pointInferieurDroit;

    public Quadrilatere(PointPlan pointSuperieurGauche, PointPlan pointInferieurDroit) {
        this.pointSuperieurGauche = pointSuperieurGauche;
        this.pointInferieurDroit = pointInferieurDroit;
    }

    public PointPlan getPointSuperieurGauche() {
        return pointSuperieurGauche;
    }

    public void setPointSuperieurGauche(PointPlan pointSuperieurGauche) {
        this.pointSuperieurGauche = pointSuperieurGauche;
    }

    public PointPlan getPointInferieurDroit() {
        return pointInferieurDroit;
    }

    public void setPointInferieurDroit(PointPlan pointInferieurDroit) {
        this.pointInferieurDroit = pointInferieurDroit;
    }

    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();

        Segment segment1 = new Segment(pointSuperieurGauche, new PointPlan(pointSuperieurGauche.getAbscisse(), pointInferieurDroit.getOrdonnee()));
        Segment segment2 = new Segment(new PointPlan(pointSuperieurGauche.getAbscisse(), pointInferieurDroit.getOrdonnee()), pointInferieurDroit);
        Segment segment3 = new Segment(pointInferieurDroit, new PointPlan(pointInferieurDroit.getAbscisse(), pointSuperieurGauche.getOrdonnee()));
        Segment segment4 = new Segment(new PointPlan(pointInferieurDroit.getAbscisse(), pointSuperieurGauche.getOrdonnee()), pointSuperieurGauche);
        
        segments.add(segment1);
        segments.add(segment2);
        segments.add(segment3);
        segments.add(segment4);

        return segments;
    }

    public void deplacer(int deplacementX, int deplacementY) {
        pointSuperieurGauche.deplacer(deplacementX, deplacementY);
        pointInferieurDroit.deplacer(deplacementX, deplacementY);
    }

    public String typeForme() {
        return "Q";
    }

    public String toString() {
        return "Quadrilatere: Point supérieur gauche = " + pointSuperieurGauche + ", Point inférieur droit = " + pointInferieurDroit;
    }
}
