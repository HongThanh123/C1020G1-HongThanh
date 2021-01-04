package controllers;

import commons.Validate;
import models.Service.House;
import models.Service.Room;
import models.Service.Villa;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceControllers {
    private static Scanner scannerService = new Scanner(System.in);
    public static String IdVilla(){
        System.out.println("Input Id Villa : ");
        String idVilla=scannerService.nextLine();
        while (!Validate.checkIdVilla(idVilla)){
            if (Validate.checkIdVilla(idVilla)){
                idVilla=scannerService.nextLine();
            } else {
                System.out.println("Not satisfied,please input again");
                idVilla=scannerService.nextLine();
            }
        }
        return idVilla;
    }

    public static String IdHouse(){
        System.out.println("Input Id House: ");
        String idHouse=scannerService.nextLine();
        while (!Validate.checkIdHouse(idHouse)){
            if (Validate.checkIdHouse(idHouse)){
                idHouse=scannerService.nextLine();
            } else {
                System.out.println("Not satisfied,please input again!!");
                idHouse=scannerService.nextLine();
            }
        }
        return idHouse;
    }

    public static String IdRoom(){
        System.out.println("Input Id Room: ");
        String idRoom=scannerService.nextLine();
        while (!Validate.checkIdRoom(idRoom)){
            if (Validate.checkIdRoom(idRoom)){
                idRoom=scannerService.nextLine();
            } else {
                System.out.println("Not satisfied,please input again!!");
                idRoom=scannerService.nextLine();
            }
        }
        return idRoom;
    }

    public static String nameserrvice(){
        System.out.println("Input name service: ");
        String nameservice =scannerService.next();
        while (!Validate.checkNameService(nameserrvice())){
            System.out.println("Not satisfied,please input again!!");
            nameservice=scannerService.next();
        }
        return nameservice;
    }

    public static double areausing() {
        double area=0.0;
        do {
            System.out.println("Input Area Using : ");
            try {
                double area1 = scannerService.nextDouble();
                if (area1 < 30) {
                    System.out.println("The area must be greater than 30m2!!");
                    area = 0.0;
                } else {
                    area = area1;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Area must be number!!");
                scannerService.nextLine();
            }
        } while (area==0.0);

        return area;
    }

    public static double cost(){ // chi phí thuê
        System.out.println("Input rental costs : ");
        double cost= scannerService.nextDouble();
        while (cost<=0){
            System.out.println("The cost should be positive!!");// chi phí là số dương
            cost=scannerService.nextDouble();
        }
        return cost;
    }

    public static int amount(){ // số lượng người
        System.out.println("Input amount people : ");
        int amount = scannerService.nextInt();
        while (amount<0 || amount>20){
            System.out.println("Not satisfied,please input again!!");
            amount=scannerService.nextInt();
        }
        return amount;
    }

    public static String typerent(){ // kiểu thuê
        System.out.println("Input type rent: ");
        String typerent= scannerService.next();
        while (!Validate.checkTypeRent(typerent)){
            System.out.println("Not satisfied,please input again!!");
            typerent=scannerService.next();
        }
        return typerent;
    }

    public static String standardroom(){ // tiêu chuẩn phòng
        System.out.println("Input standard room: ");
        String standardroom= scannerService.next();
        while (!Validate.checkStandardRoom(standardroom)){
            System.out.println("Not satisfied,please input again!!");
            standardroom=scannerService.next();
        }
        return standardroom;
    }

    public static String Otherfacilities(){ // tiện nghi khác
        System.out.println("Input other facilities: ");
        return scannerService.next();
    }

    public static double areapool(){ // diện tích hồ bơi
        System.out.println("Input area pool: ");
        double areapool=scannerService.nextDouble();
        do {
            System.out.println("The area must be greater than 30m2!!");
            areapool=scannerService.nextDouble();
        }while (areapool<30);
        return areapool;
    }

    public static int floot(){// tầng
        System.out.println("Input number of floot: ");
        int numfloot = scannerService.nextInt();
        while (numfloot<=0){
            System.out.println("Not satisfied,please input again!!");
            numfloot =scannerService.nextInt();
        }
        return numfloot;
    }

    public static String accompanied(){ //dịch vụ đi kèm
        System.out.println("Input accompanied service : ");
        String accompanied= scannerService.next();
        while (!Validate.checkAccompaniedService(accompanied)){
            System.out.println("Not satisfied,please input again!!");
            accompanied=scannerService.next();
        }
        return accompanied;
    }



    public static void addNewService() {
        System.out.println("1.\tAdd New Villa\n" +
                "2.\tAdd New House\n" +
                "3.\tAdd New Room\n"+
                "4.\tBack to menu\n"+
                "5.\tExit");
        System.out.println("Chọn 1 đến 5");
        int choose = scannerService.nextInt();
        switch (choose){
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
            case 4:
                System.out.println("existed !");
                break;
            default:
                System.out.println("please choose again");

        }

    }
    private static void addNewRoom() {
        System.out.println("input name service : " );
        String nameService = scannerService.next();
        System.out.println("input price : " );
        double price = scannerService.nextDouble();
        System.out.println("input area using : " );
        int areaUsing = scannerService.nextInt();
        System.out.println("input number tenants : " );
        int numberTenants = scannerService.nextInt();
        System.out.println("input rental type : " );
        String rentalType = scannerService.next();
        System.out.println("input other amenities : " );
        String otherAmenities = scannerService.next();
        System.out.println("input id service : " );
        String idService = scannerService.next();
        System.out.println("input accompanied service : " );
        String accompaniedService = scannerService.next();
        System.out.println("input room type : " );
        String roomType = scannerService.next();
        Room room = new Room(nameService,price,areaUsing,numberTenants,rentalType,otherAmenities,idService,accompaniedService,roomType);
        try {
            FileWriter fw = new FileWriter("src/data/Room.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(room.toString());
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void addNewHouse() {
        System.out.println("input name service : " );
        String nameService = scannerService.next();
        System.out.println("input price : " );
        double price = scannerService.nextDouble();
        System.out.println("input area using : " );
        int areaUsing = scannerService.nextInt();
        System.out.println("input number tenants : " );
        int numberTenants = scannerService.nextInt();
        System.out.println("input rental type : " );
        String rentalType = scannerService.next();
        System.out.println("input other amenities : " );
        String otherAmenities = scannerService.next();
        System.out.println("input id service : " );
        String idService = scannerService.next();
        System.out.println("input accompanied service : " );
        String accompaniedService = scannerService.next();
        System.out.println("input floor number : " );
        int floorNumber = scannerService.nextInt();
        House house = new House(nameService,price,areaUsing,numberTenants,rentalType,otherAmenities,idService,accompaniedService,floorNumber);
        try {
            FileWriter fw = new FileWriter("src/data/House.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(house.toString());
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private static void addNewVilla() {
        System.out.println("input name service : " );
        String nameService = scannerService.next();
        System.out.println("input price : " );
        double price = scannerService.nextDouble();
        System.out.println("input area using : " );
        int areaUsing = scannerService.nextInt();
        System.out.println("input number tenants : " );
        int numberTenants = scannerService.nextInt();
        System.out.println("input rental type : " );
        String rentalType = scannerService.next();
        System.out.println("input other amenities : " );
        String otherAmenities = scannerService.next();
        System.out.println("input id service : " );
        String idService = scannerService.next();
        System.out.println("input accompanied service : " );
        String accompaniedService = scannerService.next();
        System.out.println("input pool area : " );
        int poolArea = scannerService.nextInt();
        System.out.println("input floor number : " );
        int floorNumber = scannerService.nextInt();
        Villa villa = new Villa(nameService,price,areaUsing,numberTenants,rentalType,otherAmenities,idService,accompaniedService,poolArea,floorNumber);
        try {
            FileWriter fw = new FileWriter("src/data/Villa.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(villa.toString());
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void showService() {
        System.out.println("1.\tShow all Villa\n" +
                "2.\tShow all House\n" +
                "3.\tShow all Room\n" +
                "4.\tShow All Name Villa Not Duplicate\n" +
                "5.\tShow All Name House Not Duplicate\n" +
                "6.\tShow All Name Name Not Duplicate\n" +
                "7.\tBack to menu\n" +
                "8.\tExit");
        System.out.println("Chọn 1 đến 8");
        boolean isExit =false;
        int choose = scannerService.nextInt();
        switch (choose){
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
            case 4:
//                showAllNameVillaNotDuplicate();
                break;
            case 5:
//                showAllNameHouseNotDuplicate();
                break;
            case 6:
//                showAllNameRoomNotDuplicate();
                break;
            case 8:
                System.out.println("Existed !");
                isExit = true;
                break;
            default:
                System.out.println("Please choose again");

        }


    }

    private static void showAllVilla() {
        try {
            FileReader fr = new FileReader("src/data/Villa.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            FileWriter fw1 = new FileWriter("src/data/Villa.csv");
            while ((line=br.readLine()) !=null){
                fw1.write(line);
            }
            fw1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void showAllHouse() {
        try {
            FileReader fr = new FileReader("src/data/House.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            FileWriter fw1 = new FileWriter("src/data/House.csv");
            while ((line=br.readLine()) !=null){
                fw1.write(line);
            }
            fw1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showAllRoom() {
        try {
            FileReader fr = new FileReader("src/data/Room.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            FileWriter fw1 = new FileWriter("src/data/Room.csv");
            while ((line=br.readLine()) !=null){
                fw1.write(line);
            }
            fw1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

