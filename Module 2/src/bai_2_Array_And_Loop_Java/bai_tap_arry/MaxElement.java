package bai_2_Array_And_Loop_Java.bai_tap_arry;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước:");
        size1 = scanner.nextInt();
        System.out.print("Nhập kich thước mảng 1:");
        size2 = scanner.nextInt();
        array = new int[size1][size2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Nhập phần tử " + i + "," + j + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng: " + max);
    }
}