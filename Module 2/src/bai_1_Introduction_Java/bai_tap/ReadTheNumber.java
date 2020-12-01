package bai1_Introduction_java.bai_tap;

import com.sun.xml.internal.messaging.saaj.util.RejectDoctypeSaxFilter;

import java.util.Scanner;

public class ReadTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần dọc là :");
        int a = scanner.nextInt();
        String RedNumber;
        String Red;
        if (a<10){
        switch (a) {
            case 0:
                RedNumber = "Zero";
                break;
            case 1:
                RedNumber ="One";
                break;
            case 2:
                RedNumber = "Two";
                break;
            case 3:
                RedNumber = "three";
                break;
            case 4:
                RedNumber = "Four";
                break;
            case 5:
                RedNumber = "Five";
                break;
            case 6:
                RedNumber = "Six";
                break;
            case 7:
                RedNumber = "Seven";
                break;
            case 8:
                RedNumber = "Eight";
                break;
            case 9:
                RedNumber = "Night";
                break;
            default:
                RedNumber = "";
        }
            System.out.println(RedNumber);
        }else if (a<20){
            int sum = a - 10;
        switch (sum){
            case 0:
                RedNumber = "Ten";
                break;
            case 1:
                RedNumber = "Eleven";
                break;
            case 2:
                RedNumber = "Twelfth";
                break;
            case 3:
                RedNumber = "Thirteen";
                break;
            case 4:
                RedNumber = "Fourteen";
                break;
            case 5:
                RedNumber = "Fifteen";
                break;
            case 6:
                RedNumber = "Sixteen";
                break;
            case 7:
                RedNumber = "Seventy";
                break;
            case 8:
                RedNumber = "Eighty ";
                break;
            case 9:
                RedNumber = "Ninety ";
                break;
            default:
                RedNumber = "";
        }
            System.out.println(RedNumber);
        }else if (a<100){
            int b = a/10;
            int c = a%10;
            switch (b){
                case 2:
                    RedNumber = "Twenty";
                    break;
                case 3:
                    RedNumber = "Thirty";
                    break;
                case 4:
                    RedNumber = "Fouty";
                    break;
                case 5:
                    RedNumber = "Fifty";
                    break;
                case 6:
                    RedNumber = "Sixty";
                    break;
                case 7:
                    RedNumber = "Seventy";
                    break;
                case 8:
                    RedNumber = "Eighty";
                    break;
                case 9:
                    RedNumber = "Ninety";
                    break;
                default:
                    RedNumber = "";
            }
            switch (c){
                case 1:
                    Red ="One";
                    break;
                case 2:
                    Red = "Two";
                    break;
                case 3:
                    Red = "three";
                    break;
                case 4:
                    Red = "Four";
                    break;
                case 5:
                    Red = "Five";
                    break;
                case 6:
                    Red = "Six";
                    break;
                case 7:
                    Red = "Seven";
                    break;
                case 8:
                    Red = "Eight";
                    break;
                case 9:
                    Red = "Night";
                    break;
                default:
                    Red = "";
            }
            System.out.println(RedNumber + Red);
        }
        }
    }
