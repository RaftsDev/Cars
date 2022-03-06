import java.util.ArrayList;

// Class of implementation customer list
public class Reservation {
    private String name; //customer name

    //Collection - customer order list of tickets
    private ArrayList<Airline> airlinesToBook = new ArrayList<>();

    public Reservation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFlightToBook(Airline flight) {
        if(airlinesToBook.contains(flight)) {
            //Change seat property to flight object in Database and add to customer list
            flight.setSeatToBook(flight.getSeatToBook() + 1);
        }
        else {
            airlinesToBook.add(flight);
        }
        System.out.println("\nYou have added Flight "+ flight.getFlightNumber() + " in your list.");
        System.out.printf("Your total price for the flights to book is: %.2f", this.getTotalPrice());
    }

    public void removeFlightFromBook(Airline flight) { //remove ticket from order list
        if (!airlinesToBook.contains(flight)) {
            System.out.println("Flight "+flight.getFlightNumber()+ " is not in the database.");
        } else {
            airlinesToBook.remove(flight);
            System.out.println("You have removed Flight "+ flight.getFlightNumber() + " from your list.");
            System.out.printf("Your total price for the flights to book is: %.2f", this.getTotalPrice());
            flight.setSeatToBook(1);
        }
    }

    public float getTotalPrice() {  //Total price of tickets in the order list
        float total = 0;
        for(Airline i : airlinesToBook){
            total += i.getSeatToBook() * i.getPrice();
        }
        return total;
    }
}
