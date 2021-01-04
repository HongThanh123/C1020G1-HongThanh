package models.Person;

import models.Service.RentalServices;

public class Booking {
    private RentalServices rentalServices;
    private Customer customer;

    public Booking(RentalServices rentalServices, Customer customer) {
        this.rentalServices = rentalServices;
        this.customer = customer;
    }

    public RentalServices getRentalServices() {
        return rentalServices;
    }

    public void setRentalServices(RentalServices rentalServices) {
        this.rentalServices = rentalServices;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
