package bai_3_Class_And_Object.bai_tap;

import java.util.Scanner;

public class RunQuadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = input.nextDouble();
        System.out.println("Nhập số b");
        double b = input.nextDouble();
        System.out.println("Nhập số c");
        double c = input.nextDouble();
        QuadraticEquation X = new QuadraticEquation(a, b, c);
        X.Discriminant();
    }
}
