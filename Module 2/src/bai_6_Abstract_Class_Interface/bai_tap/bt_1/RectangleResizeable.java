package bai_6_Abstract_Class_Interface.bai_tap.bt_1;

import bai_5_Inheritance.thuc_hanh.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    public RectangleResizeable(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public RectangleResizeable(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void resize(double rate) {
        this.setWidth(this.getWidth() + this.getWidth()*rate/100);
        this.setLength(this.getLength() + this.getLength()*rate/100);
    }
}
