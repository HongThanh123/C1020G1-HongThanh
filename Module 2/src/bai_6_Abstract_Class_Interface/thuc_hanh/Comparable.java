package bai_6_Abstract_Class_Interface.thuc_hanh;

public class Comparable extends Circle  {
    private double radius = 1.0;

    public Comparable() {
    }

    public Comparable(double radius) {
        this.radius = radius;
    }

    public Comparable (double radius, boolean filler, String color){
        super(color,filler);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "radius=" + getRadius() +
                ", Area is" + getArea()+
                ", Perimeter is " + getPerimeter() +
                '}';
    }
}
