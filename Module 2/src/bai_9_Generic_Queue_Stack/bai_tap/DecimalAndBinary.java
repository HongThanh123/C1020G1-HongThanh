package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DecimalAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập số thập phân: " + "\n");
        int num = scanner.nextInt();
        while (num != 0){
            int a = num%2;
            stack.push(a);
            num /= 2;
        }
        System.out.print("Giá trị nhị phân là: " + "\n");
        String str = "" ;
        while (!(stack.isEmpty())){
            str += stack.pop();
        }
        System.out.println(str);
    }
}
