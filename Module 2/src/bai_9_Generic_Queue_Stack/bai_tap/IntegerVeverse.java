package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class IntegerVeverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {2,7,9,4,5,0};
        for (int element : arr){
            stack.push(element);
        }
        System.out.println(stack.toString());
        for (int index = 0; index<arr.length;index++){
            arr[index] = stack.pop();

        }
        System.out.print(Arrays.toString(arr));

    }


}
