package bai_5_Inheritance.bai_tap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height, double radius , String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", Volume is " + getVolume() +
                '}';
    }
    static class Cylindertest{
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder();
            cylinder = new Cylinder(5,6,"Green");
            System.out.println(cylinder.toString());
        }
    }


}
