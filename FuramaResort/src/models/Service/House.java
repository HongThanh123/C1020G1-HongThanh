package models.Service;

public  class House extends RentalServices {
    private int floorNumber;

    public House(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public House(String nameService, double price, int areaUsing, int numberTenants, String rentalType, String otherAmenities, String idService, String accompaniedService, int floorNumber) {
        super(nameService, price, areaUsing, numberTenants, rentalType, otherAmenities, idService, accompaniedService);
        this.floorNumber = floorNumber;
    }



    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

//String nameService, double price, int areaUsing, int numberTenants, String rentalType, String otherAmenities, String idService, String accompaniedService

    @Override
    public String toString() {
        return "nameService=" + getNameService() +
                ", Price=" + getPrice() +
                ", areaUsing=" + getAreaUsing() +
                ", numberTenants=" + getNumberTenants() +
                ", rentalType=" + getRentalType() +
                ", otherAmenities=" + getOtherAmenities() +
                ", idService=" + getIdService() +
                ", accompaniedService=" + getAccompaniedService()+
                "floorNumber=" + floorNumber;
    }

}
