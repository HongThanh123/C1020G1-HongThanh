package bai_4_Access_Modifier.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return radius * radius * Math.PI;
    }
}

    class TestCircle {
        public static void main(String[] args) {
            Circle c = new Circle(6);
            System.out.println("Radius :" + c.getRadius());
            System.out.println("Area :" + c.getArea());

        }
    }


