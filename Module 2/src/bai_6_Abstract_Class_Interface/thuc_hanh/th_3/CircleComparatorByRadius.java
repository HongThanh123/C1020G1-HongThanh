package bai_6_Abstract_Class_Interface.thuc_hanh.th_3;

import bai_5_Inheritance.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparatorByRadius implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() < c2.getRadius()) return 1;
        else if (c1.getRadius() > c2.getRadius()) return -1;
        else return 0;

     }

             }
