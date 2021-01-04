package models.Person;

import models.Service.RentalServices;
import models.Service.Villa;

public class Customer extends Person {
    private String customerType;
    private RentalServices rentalServices;

    public Customer(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String fullName, String address, String birthDay, String id, String phoneNumber, String email, String genger, String customerType) {
        super(fullName, address, birthDay, id, phoneNumber, email, genger);
        this.customerType = customerType;
    }


    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public RentalServices getRentalServices() {
        return rentalServices;
    }

    public void setRentalServices(RentalServices rentalServices) {
        this.rentalServices = rentalServices;
    }
    @Override
    public String toString() {
        return  "name=" + getFullName() +
                ", address=" + getAddress() +
                ", birthday=" + getBirthDay() +
                ", id=" + getId() +
                ", phone=" + getPhoneNumber() +
                ", email=" +getEmail() +
                ", gender=" + getGenger() +
                "customerType='" + customerType + '\'' +
                ", rentalServices=" + rentalServices ;
    }

    public void showInfo() {
        System.out.println("name=" + getFullName() +
                ", address=" + getAddress() +
                ", birthday=" + getBirthDay() +
                ", id=" + getId() +
                ", phone=" + getPhoneNumber() +
                ", email=" +getEmail() +
                ", gender=" + getGenger()  +
                "customerType='" + customerType + '\'' +
                ", rentalServices=" + rentalServices);

    }


}
