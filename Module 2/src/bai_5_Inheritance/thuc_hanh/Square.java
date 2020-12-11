package bai_5_Inheritance.thuc_hanh;

public class Square extends Rectangle {


    public Square() {
    }



    public Square(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    public Square(double side) {

    }


    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
    }


    @Override
    public String toString() {
        return "A Square with side = "
                + getSide() +
                ", Area is = "
                 + getArea();

    }
}

