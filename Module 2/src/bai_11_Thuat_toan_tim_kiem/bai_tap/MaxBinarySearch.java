package bai_11_Thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1) {
                list.getLast();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }

        }
        for (Character ch: max) {
            System.out.print(ch);
        }
        System.out.println();
    }

    }

