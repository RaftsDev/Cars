// Parent class of All Airlines

public abstract class Airline {
    public String name;
    private float price;
    private String flightNumber;
    private String fromCity;
    private String toCity;
    private int seatToBook;

    public Airline(float price, String flightNumber, String fromCity, String toCity) {
        this.price = price;
        this.flightNumber = flightNumber;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.seatToBook = 1;  // Available seat to order for customer
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public int getSeatToBook() {
        return seatToBook;
    }

    public void setSeatToBook(int seatToBook) {
        this.seatToBook = seatToBook;
    }
}
