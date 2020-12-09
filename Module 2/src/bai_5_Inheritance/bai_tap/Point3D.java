package bai_5_Inheritance.bai_tap;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public double[] getXYZ(){
        double[] arr2 = new double[3];
        arr2[0] = getX();
        arr2[1] = getY();
        arr2[2] = getZ();
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", Array2 is " + Arrays.toString(getXYZ()) +
                '}';
    }

    static class Point3Dtest {
        public static void main(String[] args) {
            Point3D point3D = new Point3D();
            point3D = new Point3D(5,7,9);
            System.out.println(point3D.toString());
        }
    }
}
