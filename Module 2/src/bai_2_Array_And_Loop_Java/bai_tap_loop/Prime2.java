package bai_2_Array_And_Loop_Java.bai_tap;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        for (int N = 2; N<=100;N++){
            boolean check = false;
            for (int i = 2; i<=Math.sqrt(N);i++){
                if(N % i == 0){
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println(N + "là số nguyên tố");
            }


        }
    }
}
