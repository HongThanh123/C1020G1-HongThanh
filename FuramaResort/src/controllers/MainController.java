package controllers;

import models.Person.Customer;
import models.Service.House;
import models.Service.Room;
import models.Service.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println(" Show Main Menu \n " +
                "1.\t Add New Services\n" +
                "2.\tShow Services\n" +
                "3.\tAdd New Customer\n" +
                "4.\tShow Information of Customer\n" +
                "5.\tAdd New Booking\n" +
                "6.\tBook Movie Ticket\n" +
                "7.\tShow Information of Employee\n" +
                "8.\tSearch Employee By Id\n" +
                "9.\tExit");
        System.out.println("Chọn 1 đến 9");
        String choose;
        choose = scanner.nextLine();
        switch (choose) {
            case "1":
                addNewService();
                break;
            case "2":
                showService();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInfoCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInfoEmployee();
                break;
            case "7":
                bookMovieTicket();
                break;
            case "8":
                searchEmployeeById();
                break;
            case "9":
                System.exit(1);
            default:
                System.out.println("please choose again !");
                displayMainMenu();

        }

    }



    private static void searchEmployeeById() {
    }

    private static void bookMovieTicket() {
    }

    private static void showInfoEmployee() {
    }


    private static void showInfoCustomer() {
        CustomerControllers.showInfoCustomer();
    }


    private static void addNewCustomer() {
        CustomerControllers.addNewCustomer();
    }

    private static void showService() {
        ServiceControllers.showService();
    }

    private static void addNewService() {
        ServiceControllers.addNewService();
    }

    public static List<Customer> ReadFileCustomer(){
        List<Customer> customerList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("src/Data/Customer.csv")
            );
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                String[] strings=line.split(",");
                Customer customer = new Customer(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],strings[7]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
    private static void addNewBooking() {

    }


}

