package bai_13_Exception_Debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void Triangle (int x, int y, int z) throws IllegalTriangleException {
        if (x<=0 || y<=0 || z<=0 || x+y<z || x+z<y || y+z<x){
            throw new IllegalTriangleException();
        }
        System.out.println("tổng 2 cạnh không lớn hơn cạnh còn lại");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số x: ");
        int x = scanner.nextInt();
        System.out.println("Nhập số y: ");
        int y = scanner.nextInt();
        System.out.println("Nhập số z: ");
        int z = scanner.nextInt();

        try {
            Triangle(x,y,z);
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }

    }


}
