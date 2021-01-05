package controllers;
import Views.Main;
import commons.*;
import models.*;

import java.util.*;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit;
    private static String VILLA = "villa";
    private static String HOUSE = "house";
    private static String ROOM = "room";
    private static String CUSTOMER = "customer";
    private static String BOOKING = "booking";
    private static boolean isBackToMenu;

    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println(" Show Main Menu \n " +
                    "1.\t Add New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit");
            System.out.println("Chọn 1 đến 7");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewService();
                    Main.main(new String[]{});
                    break;
                case 2:
                    showService();
                    Main.main(new String[]{});
                    break;
                case 3:
                    addNewCustomer(CUSTOMER);
                    Main.main(new String[]{});
                    break;
                case 4:
                    showInfoCustomer(CUSTOMER);
                    Main.main(new String[]{});
                    break;
                case 5:
                    addNewBooking();
                    Main.main(new String[]{});
                    break;
                case 6:
                    showInfoEmployee();
                    Main.main(new String[]{});
                    break;
                case 7:
                    isExit = true;
                    break;
                default:
                    System.out.println("please choose again !");
                    displayMainMenu();

            }
        } while (choose >= 1 && choose <= 5);
    }
    

    private static void addNewService() {
        int choose = 0;
        do {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n" +
                    "5.\tExit");
            System.out.println("Chọn 1 đến 5");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addNewServices(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    addNewServices(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    addNewServices(ROOM);
                    isBackToMenu = false;
                case 4:
                    isBackToMenu = true;
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.out.println("please choose again !");
                    displayMainMenu();
            }
            if (isBackToMenu || isExit){
                return;
            }
        } while (choose >= 1 && choose <= 5);
    }

    private static void addNewServices(String fileName) {
        String id = null;
        do {
            System.out.println("input id : ");
            id = scanner.next();
        }while (!Validate.isValidRegex(id, Validate.ID_REGEX));

        String fullName = null;
        do {
        System.out.println("input full name  : " );
        fullName = scanner.next();
        }while (!Validate.isValidRegex(fullName, Validate.NAMESERVICE_REGEX));

        double area = 0;
        do {
            System.out.println("input area : ");
            area = scanner.nextDouble();
        }while (!Validate.isMoreThan(area, 30));

        double rentCost = 0;
        do {
            System.out.println("input rent cost : ");
            rentCost = scanner.nextDouble();
        }while (!Validate.isMoreThan(area, 0));

        int amount = 0;
        do {
            System.out.println("input amount : ");
            amount = scanner.nextInt();
        }while (!Validate.isMoreThan(amount,0,20));

        String rentType = null;
        do {
           System.out.println("input rent type : " );
           rentType = scanner.next();
        }while (!Validate.isValidRegex(rentType, Validate.NAMESERVICE_REGEX));
        FileRead.setPath(fileName);

        if (fileName.equals(VILLA)){

            String standardRoom = null;
            do {
                System.out.println("input standard room : ");
                standardRoom = scanner.next();
            } while (!Validate.isValidRegex(standardRoom, Validate.NAMESERVICE_REGEX));
            System.out.println("input other facilities  : " );
            String otherFacilities = scanner.next();

            double areaPool = 0;
            do {
                System.out.println("input area pool : ");
                areaPool = scanner.nextDouble();
            }while (!Validate.isMoreThan(area, 30));
            int floor = 0;
            do {
                System.out.println("input floor : ");
                floor = scanner.nextInt();
            }while (!Validate.isMoreThan(floor, 0));
            FileRead.writeFile(new String[]{id, fullName, String.valueOf(area), String.valueOf(rentCost), String.valueOf(amount), rentType,
            standardRoom, otherFacilities, String.valueOf(areaPool), String.valueOf(floor)} );
        }else if (fileName.equals(HOUSE)){
            System.out.println("input standard room : " );
            String standardRoom = scanner.next();
            System.out.println("input other facilities  : " );
            String otherFacilities = scanner.next();

            int floor = 0;
            do {
                System.out.println("input floor : ");
                floor = scanner.nextInt();
            }while (!Validate.isMoreThan(floor, 0));
            FileRead.writeFile(new String[]{id, fullName, String.valueOf(area), String.valueOf(rentCost), String.valueOf(amount), rentType,
                    standardRoom, otherFacilities, String.valueOf(floor)} );
        }else if (fileName.equals(ROOM)){
            String accompaniedName = null;
            do {
                System.out.println("input accompanied name : ");
                accompaniedName = scanner.next();
            }while (!Validate.isValidAccompanied(accompaniedName));
            System.out.println("input unit  : " ); // don vi
            String unit = scanner.next();
            System.out.println("input money : " );
            double money = scanner.nextDouble();
            FileRead.writeFile(new String[]{id, fullName, String.valueOf(area), String.valueOf(rentCost), String.valueOf(amount), rentType,
                     accompaniedName,unit, String.valueOf(money)} );
        }

    }

    private static void showService() {
        int choose = 0;
        do {
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit");
            System.out.println("Chọn 1 đến 8");
            boolean isExit = false;
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    showAllService(VILLA);
                    isBackToMenu = false;
                    break;
                case 2:
                    showAllService(HOUSE);
                    isBackToMenu = false;
                    break;
                case 3:
                    showAllService(ROOM);
                    isBackToMenu = false;
                    break;
                case 4:
                    showAllNameNotDuplicate(VILLA);
                    isBackToMenu = true;
                    break;
                case 5:
                    showAllNameNotDuplicate(HOUSE);
                    isBackToMenu = true;
                    break;
                case 6:
                    showAllNameNotDuplicate(ROOM);
                    isBackToMenu = true;
                    break;
                case 7:
                    isBackToMenu = true;
                    break;
                case 8:
                    isExit = true;
                    break;
                default:
                    System.out.println("please choose again !");
                    displayMainMenu();

            }
            if (isBackToMenu || isExit){
                return;
            }
        } while (choose >= 1 && choose <= 8);


    }

    public static List<Service> readAllService(String fileName){
        FileRead.setPath(fileName);
        List<String> propertiesService = FileRead.readFile();
        List<Service> serviceList = new ArrayList<>();
        String[] pro = null;

        Service service = null;
        RentalService rentalService = null;
        for (String properties : propertiesService){
            pro = properties.split(StringUtils.COMMA);
            if (fileName.equals(VILLA)){
                service = new Villa();

                ((Villa) service).setStandardRoom(pro[6]);
                ((Villa) service).setOtherFacilities(pro[7]);
                ((Villa) service).setAreaPool(Double.parseDouble(pro[8]));
                ((Villa) service).setFloor(Integer.parseInt(pro[7]));
            }else if (fileName.equals(HOUSE)){
                service = new House();

                ((House) service).setStandardRoom(pro[6]);
                ((House) service).setOtherFacilities(pro[7]);
                ((House) service).setFloor(Integer.parseInt(pro[8]));
            }else if (fileName.equals(ROOM)){
                rentalService = new RentalService(pro[6],pro[7], Double.parseDouble(pro[8]));
                service = new Room();

                ((Room) service).setRentalService(rentalService);
            }
            service.setId(pro[0]);
            service.setFullName(pro[1]);
            service.setArea(Double.parseDouble(pro[3]));
            service.setRentCost(Double.parseDouble(pro[4]));
            service.setAmount(Integer.parseInt(pro[5]));
            service.setRentType(pro[6]);
            serviceList.add(service);
        }
        return serviceList;

    }

    private static void showAllNameNotDuplicate(String fileName) {
        Set<String> stringSet = new TreeSet<>();
        System.out.println("-----------------");
        System.out.println("List Service not duplicate name : ");
        for (Service service : readAllService(fileName)){
            stringSet.add(service.getFullName());
        }
        for (String name : stringSet){
            System.out.println(name);
        }
    }

    private static void showAllService(String fileName) {
        System.out.println("-----------------");
        System.out.println("List Service : ");
        List<Service> serviceList = readAllService(fileName);


        Service service = null;
        for (int i = 0; i < serviceList.size(); i++){
            service = serviceList.get(i);
            System.out.println((i+1) + " . ");
            service.showInfo();
        }
    }

    private static void addNewCustomer(String fileName) {
        boolean flag = true;
        String name = null;
        do {
            System.out.println(" Name: ");
            name = scanner.next();

            try {
                flag = true;
                Validate.isValidName(name);
            } catch (NameException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);

        System.out.println("Input birthday: ");
        String birthDay = scanner.next();

        String gender = null;
        do {
            System.out.println("Input Gender : ");
            gender = scanner.next();
            try {
                flag = true;
                Validate.isValidGender(gender);
            } catch (GenderException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);
        gender = ConvertUtils.normalize(gender);

        String idCard = null;
        do {
            System.out.println("Input id: ");
            idCard = scanner.next();

            try {
                flag = true;
                Validate.isValidIdCard(idCard);
            } catch (IdCardException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);

        System.out.println("Input number phone: ");
        String numPhone = scanner.next();

        String email = null;
        do {
            System.out.println("Input Email: ");
            email = scanner.next();

            try {
                flag = true;
                Validate.isValidEmail(email);
            } catch (EmailException e) {
                flag = false;
                e.printStackTrace();
            }
        }while (!flag);

        System.out.println("Input type Customer: ");
        String typeCustomer = scanner.next();

        System.out.println("Input address : ");
        String address = scanner.nextLine();

        FileRead.setPath(fileName);
        FileRead.writeFile(new String[]{name , birthDay , gender , idCard , numPhone , email , typeCustomer , address});
    }




    private static List<Customer> readAllCustomer(String fileName){
        FileRead.setPath(fileName);
        List<String> propertiesCustomer = FileRead.readFile();
        List<Customer> customerList = new ArrayList<>();
        String[] arrCustomer = null;

        Customer customer = null;
        for (String properties : propertiesCustomer){
            arrCustomer = properties.split(StringUtils.COMMA);
            customer = new Customer();
            customer.setName(arrCustomer[0]);
            customer.setBirthDay(arrCustomer[1]);
            customer.setGender(arrCustomer[2]);
            customer.setIdCard(arrCustomer[3]);
            customer.setPhoneNumber(arrCustomer[4]);
            customer.setEmail(arrCustomer[5]);
            customer.setTypeCustomer(arrCustomer[6]);
            customer.setAddress(arrCustomer[7]);
            customerList.add(customer);
        }
        return customerList;

    }

    private static void showInfoCustomer(String fileName) {
        System.out.println("-----------------");
        System.out.println("List Customer : ");

        List<Customer> customerList = readAllCustomer(fileName);

        Collections.sort(customerList);
        Customer customer = null;
        for (int i = 0; i < customerList.size(); i++){
            customer = customerList.get(i);
            System.out.println((i+1) + " . ");
            customer.showInfo();
        }
    }

    private static void addNewBooking() {
//        List<Customer> list = readAllCustomer(CUSTOMER);
//        showInfoCustomer(CUSTOMER);
//        System.out.println(" Booking : ");
//        int choose = scanner.nextInt();
//        System.out.println("1.\tBooking Villa\n" +
//                "2.\tBooking House\n" +
//                "3.\tBooking Room\n");
//        System.out.println("Chon 1-3");
//        int iCustomer = scanner.nextInt();
//
//        List<Service> list1 =  null;
//        switch (iCustomer){
//            case 1:
//                list1 = readAllService(VILLA);
//                showAllService(VILLA);
//                break;
//            case 2:
//                list1 = readAllService(HOUSE);
//                showAllService(HOUSE);
//                break;
//            case 3:
//                list1 = readAllService(ROOM);
//                showAllService(ROOM);
//                break;
//        }
//        System.out.println("Please choose : ");
//        int iService = scanner.nextInt();
//
//        Customer customer = list.get(iCustomer-1);
//        customer.setService(list1.get(iService-1));
//        FileRead.setPath(BOOKING);
//        FileRead.writeFile(new String[]{customer.toString()});
//
//        System.out.println("Booking is done");

    }

    private static void showInfoEmployee() {
    }


}

