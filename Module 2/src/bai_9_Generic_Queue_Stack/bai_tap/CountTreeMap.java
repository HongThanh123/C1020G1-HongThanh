package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.*;

public class CountTreeMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new TreeMap<>();
        String str = "Dang Hong Thanh Thi";
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        for (char c : array){
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c , 1);

            }
        }
        System.out.println(map);

    }
}