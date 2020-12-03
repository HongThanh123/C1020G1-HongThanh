package bai_2_Array_And_Loop_Java.thuc_hanh_arry;

import java.util.Scanner;

public class MaxValue {
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
        int max = array[0];
        int index = 1;
        for (int j =0;j<array.length;j++){
            if (max<array[i]){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("Giá trị lớn nhất" + max + "ở vị trí" + index);
    }
}
