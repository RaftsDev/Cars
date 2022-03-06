

public class DeltaAirline extends Airline {
    public DeltaAirline(float price, String flightNumber, String fromCity, String toCity) {
        super(price, flightNumber, fromCity, toCity);
        super.name = "Delta Airlines";
    }
}
