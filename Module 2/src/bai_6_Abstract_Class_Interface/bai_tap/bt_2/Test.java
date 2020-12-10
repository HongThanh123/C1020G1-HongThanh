package bai_6_Abstract_Class_Interface.bai_tap.bt_2;


import bai_5_Inheritance.thuc_hanh.Square;

public class Test {
    public static void main(String[] args) {
        Square[] square = new Square[1];
        square[0] = new Square(3,"blue",true);

      for (Square squares : square){
          if(squares instanceof Square){
              System.out.println(squares.toString());
              squares.howToColor();
          }else {
              System.out.println(squares.toString());
          }
      }
    }
}
