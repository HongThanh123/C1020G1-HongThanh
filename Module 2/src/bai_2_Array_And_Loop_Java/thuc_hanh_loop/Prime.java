package bai_2_Array_And_Loop_Java.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố: ");
        int num = scanner.nextInt();
        if(num<2){
            System.out.println(num + "Không phải là số nguyên tố");
        }else {
            int i = 2;
            boolean check = true;
            while (i<=Math.sqrt(num)){
                if (num % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(num + "là số nguyên tố");
            }else {
                System.out.println(num + "không phải là số nguyên tố");
            }
        }

    }
}
