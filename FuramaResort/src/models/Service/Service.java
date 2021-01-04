package models.Service;

public class Service  {
    private String nameService;
    private double price;

    public Service(String nameService, double price) {
        this.nameService = nameService;
        this.price = price;
    }


    public Service() {


    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(String price) {
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "Service{" +
                "nameService='" + nameService + '\'' +
                ", price=" + price +
                '}';
    }
}
