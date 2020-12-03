package bai_2_Array_And_Loop_Java.thuc_hanh_arry;

import java.util.Scanner;

public class TemperatureSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Độ C sang độ F");
            System.out.println("2. Độ F sang độ C");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn : ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập độ C : ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ C sang độ F là " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập độ F : ");
                    celsius = input.nextDouble();
                    System.out.println("Độ F sang độ C là " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return  fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
