package saeS201_Hernani_Deniz;
import ardoise.*;
import java.util.ArrayList;

public class Triangle extends Forme {
    private PointPlan point1;
    private PointPlan point2;
    private PointPlan point3;

    public Triangle(PointPlan point1, PointPlan point2, PointPlan point3) {
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

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();

        Segment segment1 = new Segment(point1, point2);
        Segment segment2 = new Segment(point2, point3);
        Segment segment3 = new Segment(point3, point1);

        segments.add(segment1);
        segments.add(segment2);
        segments.add(segment3);

        return segments;
    }

    public void deplacer(int deplacementX, int deplacementY) {
        point1.deplacer(deplacementX, deplacementY);
        point2.deplacer(deplacementX, deplacementY);
        point3.deplacer(deplacementX, deplacementY);
    }

    public String typeForme() {
        return "T";
    }

    public String toString() {
        return "Triangle : Point 1 = " + point1 + ", Point 2 = " + point2 + ", Point 3 = " + point3;
    }
}
