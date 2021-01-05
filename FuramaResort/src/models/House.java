package models;
//Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
public  class House extends Service {
    private String standardRoom;
    private String otherFacilities;
    private int floor;

    public House(){

    }

    public House(String id, String fullName, double area, double rentCost, int amount,
                 String rentType, String standardRoom, String otherFacilities, int floor) {
        super(id, fullName, area, rentCost, amount, rentType);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", floor=" + floor +
                '}' + super.toString();
    }

    @Override
    public void showInfo() {
        System.out.println(this.toString());

    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
