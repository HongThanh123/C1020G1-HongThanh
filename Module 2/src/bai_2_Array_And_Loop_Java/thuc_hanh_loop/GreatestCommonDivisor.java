package bai_2_Array_And_Loop_Java.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int  a;
        int  b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số a");
        a = input.nextInt();
        System.out.println("Nhập số b");
        b = input.nextInt();
        if (a==0||b==0){
            System.out.println("a và b không phải là ước số chung lớn nhất");
        }
        while (a!=b){
            if(a<b){
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Ước số chung lớn nhất là " + a);

    }
}
