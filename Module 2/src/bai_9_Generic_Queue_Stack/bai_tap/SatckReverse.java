package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.Stack;

public class SatckReverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String strings = "Dang Thi Hong Thanh  " ;
        String[] str = strings.split(" ");
//        strings = " ";
        for (String element : str){
            stack.push(element);
        }
        System.out.println(stack);
        for (int index = 0; index<str.length ;index++){
            strings += stack.pop() + " ";
        }
        System.out.println(strings);

    }
}
