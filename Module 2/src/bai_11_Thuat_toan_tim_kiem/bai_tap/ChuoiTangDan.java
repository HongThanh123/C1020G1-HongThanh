package bai_11_Thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String string = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i<string.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j<string.length(); j++){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
                if(list.size() > max.size()){
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
            }
            for (Character ch : max){
                System.out.println(ch);
            }
            System.out.println();

        }
    }
}
