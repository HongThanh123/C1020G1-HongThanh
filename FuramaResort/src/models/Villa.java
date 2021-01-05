package models;

public class Villa extends Service {
    private String standardRoom;
    private String otherFacilities;
    private double areaPool;
    private int floor;

    public Villa(String id, String fullName, double area, double rentCost, int amount,
                 String rentType, String standardRoom, String otherFacilities, double areaPool, int floor) {
        super(id, fullName, area, rentCost, amount, rentType);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa() {

    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", otherFacilities='" + otherFacilities + '\'' +
                ", areaPool=" + areaPool +
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

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
