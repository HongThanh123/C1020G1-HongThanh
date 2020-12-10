package bai_6_Abstract_Class_Interface.bai_tap.bt_1;

import bai_5_Inheritance.thuc_hanh.Square;

public class SquareResizeable extends Square implements Resizeable {
    public SquareResizeable() {
    }

    public SquareResizeable(double side) {
        super(side);
    }

    public SquareResizeable(String color, boolean filled, double side) {
        super(side, color, filled);
    }

    @Override
    public void resize(double rate) {
        this.setSide(this.getSide() + this.getSide()*rate/100);
    }
}
