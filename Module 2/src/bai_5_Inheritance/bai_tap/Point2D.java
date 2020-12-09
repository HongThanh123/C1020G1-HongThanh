package bai_5_Inheritance.bai_tap;

import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double[] getXY(){
        double[] arr = new double[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", Array is " + Arrays.toString(getXY()) +
                '}';
    }

    static class Point2Dtest {
        public static void main(String[] args) {
            Point2D point2D = new Point2D();
            point2D = new Point2D(4,6);
            System.out.println(point2D.toString());
        }
    }
}
