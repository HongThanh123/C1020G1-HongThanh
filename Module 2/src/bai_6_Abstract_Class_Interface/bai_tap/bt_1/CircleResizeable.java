package bai_6_Abstract_Class_Interface.bai_tap.bt_1;

import bai_5_Inheritance.thuc_hanh.Circle;

public class CircleResizeable extends Circle implements Resizeable {

    public CircleResizeable() {
    }

    public CircleResizeable(double radius) {
        super(radius);
    }

    public CircleResizeable(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double rate) {
        this.setRadius(this.getRadius() + this.getRadius()*rate/100);
    }
}
