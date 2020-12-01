package bai_2_Array_And_Loop_Java.bai_tap;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố :");
        int num = scanner.nextInt();
        int count = 0;
        int N = 2;
        boolean check = false;
        while (count < num){
            for (int i = 2; i<=Math.sqrt(N);i++){
                check = false;
                if (N % i == 0){
                    check = true;
                    break;
                }
                check = false;

            }
            if (!check){
                System.out.println(N +" là số nguyên tố");
                count++;
            }
            N++;
        }

    }
}
