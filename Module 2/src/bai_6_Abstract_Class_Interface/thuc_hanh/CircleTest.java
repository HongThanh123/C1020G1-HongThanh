package bai_6_Abstract_Class_Interface.thuc_hanh;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("red", false);
        System.out.println(circle);
    }
}
