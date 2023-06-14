package saeS201_Hernani_Deniz;
import java.util.ArrayList;

import ardoise.*;

public class Chapeau extends Forme {
	private PointPlan point1;
    private PointPlan point2;
    private PointPlan point3;
    
    public Chapeau(PointPlan point1, PointPlan point2, PointPlan point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    public PointPlan getPoint1() {
        return point1;
    }

    public void setPoint1(PointPlan point1) {
        this.point1 = point1;
    }

    public PointPlan getPoint2() {
        return point2;
    }

    public void setPoint2(PointPlan point2) {
        this.point2 = point2;
    }

    public PointPlan getPoint3() {
        return point3;
    }

    public void setPoint3(PointPlan point3) {
        this.point3 = point3;
    }
    
    public String typeForme() {
        return "C";
    }
    
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(new Segment(point1, point2));
        segments.add(new Segment(point2, point3));
        return segments;
    }
    
    public void deplacer(int deplacementX, int deplacementY) {
        point1.deplacer(deplacementX, deplacementY);
        point2.deplacer(deplacementX, deplacementY);
        point3.deplacer(deplacementX, deplacementY);
    }
    @Override
    public String toString() {
        return "Chapeau : Point 1 = " + point1 + ", Point 2 = " + point2 + ", Point 3 = " + point3;
    }
}
