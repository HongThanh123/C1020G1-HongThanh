package bai_2_Array_And_Loop_Java.thuc_hanh_arry;

import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh : ");
        String value = scanner.nextLine();
        boolean isExit = false;
        for (int i = 0; i<students.length;i++){
            if (students[i].equals(value)){
                System.out.println("Vị trí của sinh viên" + value +"là :"+ i +1);
                isExit= true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Không có" +"\t" + value +"\t" + "trong danh sách");
        }

    }
}
