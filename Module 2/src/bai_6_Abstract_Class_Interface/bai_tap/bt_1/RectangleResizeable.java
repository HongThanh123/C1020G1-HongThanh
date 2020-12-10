package bai_6_Abstract_Class_Interface.bai_tap.bt_1;

import bai_5_Inheritance.thuc_hanh.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    public RectangleResizeable() {
    }

    public RectangleResizeable(double color, double filled, String width, boolean length) {
        super(color, filled, width, length);
    }

    public RectangleResizeable(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double rate) {
        this.setWidth(this.getWidth() + this.getWidth()*rate/100);
        this.setLength(this.getLength() + this.getLength()*rate/100);
    }
}
