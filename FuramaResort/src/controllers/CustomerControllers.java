package controllers;

import commons.*;
import models.Person.Customer;

import java.io.*;
import java.util.*;

public class CustomerControllers {
    static Scanner scannerCustomer = new Scanner(System.in);

    public static String form(String str) {
        String str1 = str.toLowerCase();
        String str2 = str1.substring(0, 1).toUpperCase();
        String str3 = str1.substring(1);
        return str2 + str3;
    }

    public static boolean checkBirthDay(String birthDay) {
        Calendar calendar = Calendar.getInstance();
        boolean check = false;
        if (Validate.checkBirthDay(birthDay)) {
            check = true;
        }
        if (check) {
            String[] strings = birthDay.split("/");
            int str = Integer.parseInt(strings[0]);
            int str1 = Integer.parseInt(strings[1]);
            int str2 = Integer.parseInt(strings[2]);
            if (str < 32 && str1 < 13 && (str2 > 1900 && (calendar.get(Calendar.YEAR) - str2) >= 18)) {
                return true;
            }
        }
        return false;
    }


    public static void addNewCustomer() {
        System.out.println("Full Name: ");
        String fullname;
        do {
            fullname = scannerCustomer.nextLine();
            if (!Validate.checkName(fullname)) {
                System.err.println(new NameException());
                System.out.println("Input name : ");
            }
        } while (!Validate.checkName(fullname));

        System.out.println("Input birthday: ");
        String birthday = scannerCustomer.next();
        checkBirthDay(birthday);
        while (!checkBirthDay(birthday)) {
            System.err.println(new BirthDayException());
            System.out.println("Input birthday: ");
            birthday = scannerCustomer.next();
            checkBirthDay(birthday);
        }
        System.out.println("Nhập Giói Tính (Male/Female/Unknow): ");
        String gender = scannerCustomer.next();
        while (!Validate.checkGenDer(form(gender))) {
            System.err.println(new GenderException());
            System.out.println("Nhập Giói Tính (Male/Female/Unknow): ");
            gender = scannerCustomer.next();
        }
        gender = form(gender);

        System.out.println("Input id: ");
        String idCard = scannerCustomer.next();
        while (!Validate.checkIdCard(idCard)) {
            System.err.println(new IdCardException());
            System.out.println("Input id: ");
            idCard = scannerCustomer.next();
            Validate.checkIdCard(idCard);
        }

        System.out.println("Input number phone: ");
        String numphone = scannerCustomer.next();
        while (!Validate.checkPhoneNumber(numphone)) {
            System.err.println("Wrong format, please input again: ");
            System.out.println("Input number phone: ");
            numphone = scannerCustomer.next();
            Validate.checkPhoneNumber(numphone);
        }

        System.out.println("Input Email: ");
        String email = scannerCustomer.next();
        while (!Validate.checkEmail(email)) {
            System.err.println(new EmailException());
            System.out.println("Input Email: ");
            email = scannerCustomer.next();
            Validate.checkEmail(email);
        }

        System.out.println("Input Customer: ");
        String typecustomer = scannerCustomer.next();
        while (!Validate.checkCustomerType(typecustomer)) {
            System.err.println("Not satisfied,please input again ");
            System.out.println("Input Customer : ");
            typecustomer = scannerCustomer.next();
            Validate.checkCustomerType(typecustomer);
        }

        scannerCustomer.nextLine();
        System.out.println("Input address : ");
        String address = scannerCustomer.nextLine();


        Customer customer = new Customer(fullname, birthday, gender, idCard, numphone, email, typecustomer, address);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(
                    new FileWriter("src/Data/Customer.csv", true)
            );

            bufferedWriter.write(customer.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showInfoCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/Data/Customer.csv"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                Customer customer = new Customer(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7]);
                customerList.add(customer);
            }
            Collections.sort(customerList, new AgeComparator());
            for (Customer element : customerList) {
                element.showInfo();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}




