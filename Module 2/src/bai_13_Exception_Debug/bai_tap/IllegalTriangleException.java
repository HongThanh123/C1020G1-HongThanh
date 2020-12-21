package bai_13_Exception_Debug.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException (){
        super("tổng 2 cạnh không lớn hơn cạnh còn lại ");
    }
    public IllegalTriangleException(String msg){
        super("Cạnh bé hơn 0");
    }
}
