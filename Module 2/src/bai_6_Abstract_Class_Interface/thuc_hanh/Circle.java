package bai_6_Abstract_Class_Interface.thuc_hanh;

public class Circle {
    private String color = "Green";
    private boolean filler = true;

    public Circle() {
    }

    public Circle(String color, boolean filler) {
        this.color = color;
        this.filler = filler;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, boolean filler, String color) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }


}
