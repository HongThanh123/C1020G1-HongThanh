package bai_5_Inheritance.thuc_hanh;

public class Circle extends Shape implements Comparable<Circle> {
    private double radius = 1.0;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius() +
                ", Area is " +
                getArea();

    }

    public String toString(String text) {
        return "A Circle with radius="
                + getRadius() +
                ", Area is " +
                getArea();

    }

    public String getAreaAndColor(){
        return "A Circle with radius = "
                + getRadius() +
                ", color" +
                getColor();
    }
    public void getAreaAndColor(String text){
        System.out.println( "A Circle with radius = "
                + getRadius() +
                ", color" +
                getColor()+ text);
    }



    @Override
    public int compareTo(Circle o) {
        if (this.getRadius()>o.getRadius()){
            return 1;
        }else if(this.getRadius()<o.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }


}
