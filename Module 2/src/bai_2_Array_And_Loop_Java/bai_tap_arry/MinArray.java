package bai_2_Array_And_Loop_Java.bai_tap_arry;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhập kích thước:");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Kích thước không quá 20");
            }
        }while (size>20);
        array = new int[size];
//        khởi tạo mảng
        int i = 0;
        while (i<array.length){
            System.out.println("Số phần tử" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Danh sách :");
        for (int j =0; j<array.length; j++){
            System.out.println(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j =0;j<array.length;j++){
            if (min>array[i]){
                min = array[j];
                index = j+1;
            }
        }
        System.out.println("Giá trị nhỏ nhất" + min + "ở vị trí" + index);
    }
}
