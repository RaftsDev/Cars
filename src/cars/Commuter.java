package cars;

public class Commuter extends Cars {

    public Commuter(String companyNAme, float price, String model, String size, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
        super(price, model, size, pickUpDate, dropOffDate, pickUpLocation, DropOffLocation);
        this.companyName = "Commuter";
    }
}
