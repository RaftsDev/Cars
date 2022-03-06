

public class AmericanAirline extends Airline {

    public AmericanAirline(float price, String flightNumber, String fromCity, String toCity) {
        super(price, flightNumber, fromCity, toCity);
        super.name = "American Airlines";
    }
}
