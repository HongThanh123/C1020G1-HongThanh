package bai_2_Array_And_Loop_Java.bai_tap_arry;

import java.util.Scanner;

public class ElementAggregation {
    public static void main(String[] args) {
        int size1;
        int size2;
        int [] array1;
        int [] array2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước 1: ");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        System.out.println("Nhập kích thước 2: ");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        int i =0;
        while (i<array1.length){
            System.out.println("Nhập phần tử " + (i + 1) + ":");
            array1[i] = scanner.nextInt();
            i++;
        }
        int j = 0;
        while (j<array2.length){
            System.out.println("Nhập phần tử " + (j + 1) + ":");
            array2[j] = scanner.nextInt();
            j++;
        }
        System.out.print("Elements in array1: ");
        for (int x = 0; x < array1.length; x++) {
            System.out.print(array1[x]);
        }
        System.out.print("Elements in array2: ");
        for (int y = 0; y < array2.length; y++) {
            System.out.print(array2[y]);
        }
        System.out.println("Kích thước mảng 3");
        int []array3;
        array3 = new int[array1.length + array2.length];
        for (int m = 0; m < array1.length; m++) {
            array3[m]= array1[m];
        }
        for (int m = 0; m < array2.length; m++) {
            array3[m]= array2[m];
        }


        }


    }

