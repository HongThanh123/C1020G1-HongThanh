package models.Service;

public class Room extends RentalServices{
    private String roomType;

    public Room() {

    }

    public Room(String roomType) {
        this.roomType = roomType;
    }

    public Room(String nameService, double price, int areaUsing, int numberTenants, String rentalType, String otherAmenities, String idService, String accompaniedService, String roomType) {
        super(nameService, price, areaUsing, numberTenants, rentalType, otherAmenities, idService, accompaniedService);
        this.roomType = roomType;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
                "roomType='" + roomType ;
    }

    public void showInfor() {
    }
}
