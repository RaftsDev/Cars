package cars;

public class AmericanRoads extends Cars {

    public AmericanRoads(float price, String model, String size, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
        super(price, model, size, pickUpDate, dropOffDate, pickUpLocation, DropOffLocation);
        this.companyName = "American roads";
    }
}
