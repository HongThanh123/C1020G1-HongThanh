package bai_5_Inheritance.thuc_hanh;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Shapetest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println();

        shape = new Shape (false , "red");
        System.out.println(shape);
    }
    public static class CircleTest {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle);

            circle = new Circle(3.5);
            System.out.println(circle);

            circle = new Circle();
            System.out.println(circle);
        }
    }

    public static class RectangleTest {
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle();
            System.out.println(rectangle);

            rectangle = new Rectangle(2.3, 5.8);
            System.out.println(rectangle);

            rectangle = new Rectangle();
            System.out.println(rectangle);
        }
    }
    public static class SquareTest {
        public static void main(String[] args) {
            Square square = new Square();
            System.out.println(square);

            square = new Square(2.3);
            System.out.println(square);

            square = new Square(5.8, "yellow", true);
            System.out.println(square);
        }
    }


}
