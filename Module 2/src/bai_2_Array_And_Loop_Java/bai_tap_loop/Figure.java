package bai_2_Array_And_Loop_Java.bai_tap;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        menu = input.nextInt();
        switch (menu){
            case 1:
                System.out.println("Print the rectangle");
                for(int i=1; i<=5; i++){
                    for (int j=1; j<=10; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                System.out.println("Vẽ tam giác vuông : \n");
                for(int i=1; i<=7; i++){
                    for(int j=1; j<i; j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                System.out.println("Vẽ tam giác vuông ngược : \n");
                for(int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for(int i = 1;i<=6;i++){
                    for(int j = 7; j>=i;j--) {
                        System.out.print(" ");
                    }
                        for (int z = 1; z<=i; z++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                break;


            case 4:
                System.out.println(" ");
                break;
        }
    }

}
