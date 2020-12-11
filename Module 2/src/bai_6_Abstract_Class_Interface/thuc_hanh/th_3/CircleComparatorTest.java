package bai_6_Abstract_Class_Interface.thuc_hanh.th_3;

import bai_5_Inheritance.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3 );
        circles[1] = new Circle(5);
        circles[2] = new Circle(3.5);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getAreaAndColor());
        }
//
//        Arrays.sort(circles);
//        System.out.println("After-sorted:");
//        for (Circle circle : circles) {
//            System.out.println(circle.getAreaAndColor());
//        }
        Arrays.sort(circles, new CircleComparatorByRadius());
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            circle.getAreaAndColor("su khi sap xep");
        }
    }
}
