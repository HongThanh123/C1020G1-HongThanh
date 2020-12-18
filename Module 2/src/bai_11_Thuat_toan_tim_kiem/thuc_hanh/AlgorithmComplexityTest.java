package bai_11_Thuat_toan_tim_kiem.thuc_hanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String string = scanner.nextLine();
        int[] frequentChar = new int[10];
        for (int i = 0; i < string.length(); i++){
            int ascii = string.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0;
        char charecter = 10;
        for (int j = 0; j<10; j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                charecter = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + charecter + "' with a frequency of " + max + " times");
    }
}
