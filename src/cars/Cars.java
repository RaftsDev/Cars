package cars;// Parent class of All Airlines

public abstract class Cars {
    public String companyName;
    private float price;
    private String model;
    private String size;
    private String pickUpDate;
    private String dropOffDate;
    private String pickUpLocation;
    private String getDropOffLocation;

    public Cars(float price, String model, String size, String pickUpDate, String dropOffDate, String pickUpLocation, String getDropOffLocation) {
       // this.companyName = companyName;
        this.price = price;
        this.model = model;
        if ((model == "Mazda3") || (model=="Toyota Corola") || (model=="Hyundai Elantra")){
            this.size = "Midsize";
        }else if((model == "Chevrolet Spark") || (model=="Ford Fiesta")){
            this.size = "Economy";
        }else {
            this.size = "Compact";
        }
        this.pickUpDate = pickUpDate;
        this.dropOffDate = dropOffDate;
        this.pickUpLocation = pickUpLocation;
        this.getDropOffLocation = getDropOffLocation;
    }

    /*
    public Cars(float price, String flightNumber, String fromCity, String toCity) {
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
    }*/
}
