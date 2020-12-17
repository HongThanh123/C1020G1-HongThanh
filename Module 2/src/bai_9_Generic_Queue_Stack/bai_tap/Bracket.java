package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.Stack;

public class Bracket {
    public boolean test (String str) {
        Stack<Character> bstack = new Stack<>();
        char[] array = str.toCharArray();
        for (char ch : array) {
            if (ch == '(') {
                bstack.push(ch);
            }else if (ch == ')'){
                if (bstack.isEmpty()){
                    return false;
                }else {
                    bstack.pop();
                }
            }

        }
        if (bstack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }




}
