package Bai1_Introduction_java.thuc_hanh;
import java.util.Scanner;
public class HeightWidth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height , width , bmi;
        System.out.println("Your width (in kilo)");
        width = scanner.nextDouble();
        System.out.println("Your height (in meter");
        height = scanner.nextDouble();
        bmi = width / Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
