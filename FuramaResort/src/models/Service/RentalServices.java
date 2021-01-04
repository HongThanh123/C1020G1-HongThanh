package models.Service;

public class RentalServices extends Service{
    private int areaUsing;
    private int numberTenants;
    private String rentalType;
    private String otherAmenities;
    private String idService;
    private String accompaniedService;

    public RentalServices() {
    }

    public RentalServices(String nameService, double price, int areaUsing, int numberTenants, String rentalType, String otherAmenities, String idService, String accompaniedService) {
        super(nameService, price);
        this.areaUsing = areaUsing;
        this.numberTenants = numberTenants;
        this.rentalType = rentalType;
        this.otherAmenities = otherAmenities;
        this.idService = idService;
        this.accompaniedService = accompaniedService;
    }


    public int getAreaUsing() {
        return areaUsing;
    }

    public void setAreaUsing(int areaUsing) {
        this.areaUsing = areaUsing;
    }

    public int getNumberTenants() {
        return numberTenants;
    }

    public void setNumberTenants(int numberTenants) {
        this.numberTenants = numberTenants;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }


    @Override
    public String toString() {
        return "Services{" +
                "areaUsing=" + areaUsing +
                ", numberTenants=" + numberTenants +
                ", rentalType='" + rentalType + '\'' +
                ", otherAmenities='" + otherAmenities + '\'' +
                ", idService='" + idService + '\'' +
                ", accompaniedService='" + accompaniedService + '\'' +
                '}';
    }
}
