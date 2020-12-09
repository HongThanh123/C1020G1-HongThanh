package bai_6_Abstract_Class_Interface.thuc_hanh;

//public class ComparableCircle extends Circle  {
//
//    public ComparableCircle() {
//    }
//
//    public ComparableCircle (double radius){
//        super(radius);
//    }
//
//    public ComparableCircle (double radius, boolean filler, String color){
//        super(radius, filler, color);
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, filled, color);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
