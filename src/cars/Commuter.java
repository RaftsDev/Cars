package cars;

public class Commuter extends Cars {

    public Commuter(float price, String model, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
        super(price, model, pickUpDate, dropOffDate, pickUpLocation, DropOffLocation);
        this.companyName = "Commuter";
    }
}
