package bai_2_Array_And_Loop_Java.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi:");
        money = input.nextDouble();
        System.out.println("Nhập tháng gửi : ");
        month = input.nextInt();
        System.out.println("Nhập lãi suất vay:");
        interest_rate = input.nextDouble();
        double total_interest = 0;
        for (int i =0;i<month ; i++){
            total_interest += money * (interest_rate/100)/12 * money;
        }
        System.out.println("Tiền lãi là : " + total_interest);
    }
}
