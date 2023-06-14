package saeS201_Hernani_Deniz;

import ardoise.*;
import java.util.ArrayList;

public class Etoile extends Forme {
    private Chapeau branche1;
    private Chapeau branche2;
    private Chapeau branche3;
    private Chapeau branche4;

    public Etoile(Chapeau branche1, Chapeau branche2, Chapeau branche3, Chapeau branche4) {
        this.branche1 = branche1;
        this.branche2 = branche2;
        this.branche3 = branche3;
        this.branche4 = branche4;
    }

    public Chapeau getBranche1() {
        return branche1;
    }

    public void setBranche1(Chapeau branche1) {
        this.branche1 = branche1;
    }

    public Chapeau getBranche2() {
        return branche2;
    }

    public void setBranche2(Chapeau branche2) {
        this.branche2 = branche2;
    }

    public Chapeau getBranche3() {
        return branche3;
    }

    public void setBranche3(Chapeau branche3) {
        this.branche3 = branche3;
    }

    public Chapeau getBranche4() {
        return branche4;
    }

    public void setBranche4(Chapeau branche4) {
        this.branche4 = branche4;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.addAll(branche1.dessiner());
        segments.addAll(branche2.dessiner());
        segments.addAll(branche3.dessiner());
        segments.addAll(branche4.dessiner());
        return segments;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        branche1.deplacer(deplacementX, deplacementY);
        branche2.deplacer(deplacementX, deplacementY);
        branche3.deplacer(deplacementX, deplacementY);
        branche4.deplacer(deplacementX, deplacementY);
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    @Override
    public String toString() {
        return "Etoile:\n" +
               "Branche 1:\n" +
               branche1 + "\n" +
               "Branche 2:\n" +
               branche2 + "\n" +
               "Branche 3:\n" +
               branche3 + "\n" +
               "Branche 4:\n" +
               branche4;
    }
}
