package bai_6_Abstract_Class_Interface.bai_tap.bt_2;

import bai_5_Inheritance.thuc_hanh.Square;


public class SquareColorable extends Square implements Colorable {

    public SquareColorable() {
    }

    public SquareColorable(double side) {
        super(side);
    }


    public SquareColorable(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    public double getArea(){
        return getWidth()*this.getLength();
    }

    @Override
    public String toString() {
        return "Square  " +
                ", Area is " + getArea();
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }
}
