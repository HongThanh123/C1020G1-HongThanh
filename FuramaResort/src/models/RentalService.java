package models;

public class RentalService {
    private String accompaniedName;
    private String unit;
    private double money;

    public RentalService(String accompaniedName, String unit, double money) {
        this.accompaniedName = accompaniedName;
        this.unit = unit;
        this.money = money;
    }

    public String getAccompaniedName() {
        return accompaniedName;
    }

    public void setAccompaniedName(String accompaniedName) {
        this.accompaniedName = accompaniedName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
