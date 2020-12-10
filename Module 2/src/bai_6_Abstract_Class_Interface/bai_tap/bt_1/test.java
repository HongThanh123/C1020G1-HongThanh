package bai_6_Abstract_Class_Interface.bai_tap.bt_1;

import bai_5_Inheritance.thuc_hanh.Shape;

public class test {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new CircleResizeable(3);
        shapes[1] = new RectangleResizeable(3, 5);
        shapes[2] = new SquareResizeable(2);

        System.out.println("Trước khi tăng kích thước : ");
        for (Resizeable shape : shapes)
            System.out.println("Có thể thay đổi");

        System.out.println();

        System.out.println("Sau khi tăng kích thước : ");
        double randomRate;
        for (Resizeable shape : shapes) {
            randomRate = Math.floor(Math.random() * 99 + 1);
            shape.resize(randomRate);
            System.out.println(shape + "; tỷ lệ= " + randomRate);
        }
    }
}
