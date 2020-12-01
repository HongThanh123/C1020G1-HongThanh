package bai_1_Introduction_Java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner a = new Scanner(System.in);
        System.out.println("Nhập số tiền USD : ");
        vnd = a.nextDouble();
        double quydoi = vnd * 23000;
        System.out.println("Số tiền VND : " + quydoi);
    }
}
