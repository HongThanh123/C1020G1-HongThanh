package bai_6_Abstract_Class_Interface.thuc_hanh.th_2;

import bai_5_Inheritance.bai_tap.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(){

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String str, boolean is, double radius) {
        super(radius, str, is);
    }

    @Override
    public int compareTo(ComparableCircle o){
        if(getRadius()> o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
