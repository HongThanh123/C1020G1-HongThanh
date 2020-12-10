package bai_5_Inheritance.thuc_hanh;

public class Shape {
    private boolean filled = true;
    private String color = "Green";

    public Shape() {

    }

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return ",A Shape with color of " + getColor() +
                ", and " + (isFilled() ? " filled " : "not filled") + '\'';
    }

    public void howToColor() {
    }
}








