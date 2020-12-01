package Bai1_Introduction_java.thuc_hanh;
import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  a,b,c;
        System.out.println("a : ");
        a = scanner.nextFloat();
        System.out.println("b : ");
        b = scanner.nextFloat();
        System.out.println("c : ");
        c = scanner.nextFloat();
        if (a!=0){
            double y = (c - b) / a;
            System.out.printf("y la : %f!" , y);
        }else {
            if(b == 0){
                System.out.print("The x is all x ");
             }else {
                System.out.print("No x");
            }
        }
    }
}
