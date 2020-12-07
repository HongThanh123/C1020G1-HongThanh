package bai_3_Class_And_Object.bai_tap;


public class Fan {
    private final int slow = 1;
    private final int medium =2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    "speed=" + getSpeed() +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    "far is on}";

        } else {
            return "Fan{" +
                    "speed=" + getSpeed() +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + '\'' +
                    "far is off} ";
        }
    }

    public static void main(String[]args ) {
            Fan fan1 = new Fan(3, true, 10, "yellow");
            Fan fan2 = new Fan(2, false, 5, "blue");
            System.out.println("Status of fan 1:");
            System.out.println(fan1.toString());
            System.out.println("Status of fan 2:");
            System.out.println(fan2.toString());

    }



    }

