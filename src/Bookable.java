import java.util.ArrayList;

// Class of available tickets of airlines

public class Bookable {
    private String name;
    public ArrayList<Airline> airlinesAvailable = new ArrayList<>();

    public Bookable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAvailableFlight(Airline flight) {
        if(this.airlinesAvailable.contains(flight)) {
            System.out.println("The flight "+ flight.getFlightNumber() + " already exists in the database.");
        }
        else {
            this.airlinesAvailable.add(flight);
        }
        System.out.println("You have added Flight "+ flight.getFlightNumber() + " in the database.");
        System.out.println("The number of available flights is " + this.airlinesAvailable.size() +" in the database now.");

    }

    public void removeAvailableFlight(Airline flight) {
        if (!airlinesAvailable.contains(flight)) {
            System.out.println("Flight "+flight.getFlightNumber()+ " is not in the database.");
        } else {
            airlinesAvailable.remove(flight);
            System.out.println("You have removed Flight "+ flight.getFlightNumber() + " in the database.");
            System.out.printf("The number of available flights is " + airlinesAvailable.size() +" in the database now.");
        }
    }



}
