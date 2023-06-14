package saeS201_Hernani_Deniz;

import ardoise.*;
import java.util.ArrayList;

public class Maison extends Forme {
    private Quadrilatere corpsMaison;
    private Triangle toitMaison;
    private Quadrilatere porteMaison;

    public Maison(Quadrilatere corpsMaison, Triangle toitMaison, Quadrilatere porteMaison) {
        this.corpsMaison = corpsMaison;
        this.toitMaison = toitMaison;
        this.porteMaison = porteMaison;
    }

    public Quadrilatere getCorpsMaison() {
        return corpsMaison;
    }

    public void setCorpsMaison(Quadrilatere corpsMaison) {
        this.corpsMaison = corpsMaison;
    }

    public Triangle getToitMaison() {
        return toitMaison;
    }

    public void setToitMaison(Triangle toitMaison) {
        this.toitMaison = toitMaison;
    }

    public Quadrilatere getPorteMaison() {
        return porteMaison;
    }

    public void setPorteMaison(Quadrilatere porteMaison) {
        this.porteMaison = porteMaison;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.addAll(corpsMaison.dessiner());
        segments.addAll(toitMaison.dessiner());
        segments.addAll(porteMaison.dessiner());
        return segments;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        corpsMaison.deplacer(deplacementX, deplacementY);
        toitMaison.deplacer(deplacementX, deplacementY);
        porteMaison.deplacer(deplacementX, deplacementY);
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    @Override
    public String toString() {
        return "Maison : Corps = " + corpsMaison + ", Toit = " + toitMaison + ", Porte = " + porteMaison;
    }
}
