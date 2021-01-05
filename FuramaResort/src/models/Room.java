package models;

public class Room extends Service {
    private RentalService rentalService;

    public Room(String id, String fullName, double area, double rentCost, int amount, String rentType, RentalService rentalService) {
        super(id, fullName, area, rentCost, amount, rentType);
        this.rentalService = rentalService;
    }

    public Room(){

    }

    @Override
    public String toString() {
        return "Room{" +
                "rentalService=" + rentalService +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());

    }

    public RentalService getRentalService() {
        return rentalService;
    }

    public void setRentalService(RentalService rentalService) {
        this.rentalService = rentalService;
    }
}
