package models.Service;

import models.Service.RentalServices;

public class Villa extends RentalServices {
    private int poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(int poolArea) {
        this.poolArea = poolArea;
    }

    public Villa(String nameService, double price, int areaUsing, int numberTenants, String rentalType, String otherAmenities, String idService, String accompaniedService, int poolArea, int floorNumber) {
        super(nameService, price, areaUsing, numberTenants, rentalType, otherAmenities, idService, accompaniedService);
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }



    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }


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
                "poolArea=" + poolArea +
                ", floorNumber=" + floorNumber;
    }

    public void showInfor() {
        System.out.println( "nameService=" + getNameService() +
                ", Price=" + getPrice() +
                ", areaUsing=" + getAreaUsing() +
                ", numberTenants=" + getNumberTenants() +
                ", rentalType=" + getRentalType() +
                ", otherAmenities=" + getOtherAmenities() +
                ", idService=" + getIdService() +
                ", accompaniedService=" + getAccompaniedService()+
                "poolArea=" + poolArea +
                ", floorNumber=" + floorNumber);
    }

}
