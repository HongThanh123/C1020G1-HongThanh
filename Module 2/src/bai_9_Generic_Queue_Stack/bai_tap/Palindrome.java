package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        char[] array = str.toLowerCase().toCharArray();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        for (char ch : array){
           stack.push(ch);
           queue.add(ch);
        }

        boolean check = true;

        while (!stack.isEmpty()){
            char removeFromStack = stack.pop();
            char removeFromQueue = queue.poll();

            if (removeFromQueue != removeFromStack){
                check = false;
                break;
            }

        }
        if (check){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }





    }

}
