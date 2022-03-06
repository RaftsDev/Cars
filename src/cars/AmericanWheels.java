package cars;

public class AmericanWheels extends Cars {

    public AmericanWheels(String companyName, float price, String model, String size, String pickUpDate, String dropOffDate, String pickUpLocation, String DropOffLocation) {
        super(price, model, size, pickUpDate, dropOffDate, pickUpLocation, DropOffLocation);
        this.companyName = "American Wheels";
    }
}
