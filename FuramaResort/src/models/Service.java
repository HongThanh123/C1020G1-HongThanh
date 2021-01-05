package models;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Service {
    private String id;
    private String fullName ;
    private double area;
    private double rentCost;
    private int amount;
    private String rentType;

    public Service(){

    }

    public Service(String id, String fullName, double area, double rentCost, int amount, String rentType) {
        this.id = id;
        this.fullName = fullName;
        this.area = area;
        this.rentCost = rentCost;
        this.amount = amount;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", area=" + area +
                ", rentCost=" + rentCost +
                ", amount=" + amount +
                ", rentType='" + rentType + '\'' +
                '}';
    }

    public abstract void showInfo();

    }



