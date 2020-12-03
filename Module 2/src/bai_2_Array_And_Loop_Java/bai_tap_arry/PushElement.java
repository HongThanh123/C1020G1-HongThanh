package bai_2_Array_And_Loop_Java.bai_tap_arry;

import java.util.Arrays;
import java.util.Scanner;

public class PushElement {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước : ");
        size = scanner.nextInt();
        array = new int[size];
        int i =0;
        while (i<array.length){
            System.out.println("Nhập phần tử " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập giá trị :");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí : ");
        int index = scanner.nextInt();
        for (int j = 0; j<array.length+1;j++ ){
            if (array[j] == x){
                array[x] = array[x+1];
            }
            array[array.length-1] = 0;
            j++;
        }
        System.out.println(Arrays.toString(array));
    }



}
