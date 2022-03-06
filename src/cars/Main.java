package cars;

public class Main {

    public static void main(String[] args) {
        AmericanAirline f1 = new AmericanAirline(9.98f, "AA111", "Dallas", "Los Angelos");
        AmericanAirline f2 = new AmericanAirline(19.98f, "AA222", "Los Angelos", "Dallas");
        AmericanAirline f3 = new AmericanAirline(29.98f, "AA333", "Dallas", "Denver");
        AmericanAirline f4 = new AmericanAirline(39.98f, "AA444", "Denver", "Dallas");
        SouthwestAirline f5 = new SouthwestAirline(49.98f, "AA555", "Denver", "Dallas");
        SouthwestAirline f6 = new SouthwestAirline(9.98f, "AA666", "Dallas", "Los Angelos");
        DeltaAirline f7 = new DeltaAirline(10.00f, "AA777", "Los Angelos", "San Francisco");
        DeltaAirline f8 = new DeltaAirline(29.98f, "AA888", "Dallas", "Denver");
        SouthwestAirline f9 = new SouthwestAirline(39.98f, "AA999", "Denver", "Dallas");

        //Fill out list of available flights in Order System
        Bookable sde = new Bookable("Order system");
        sde.addAvailableFlight(f1);
        sde.addAvailableFlight(f2);
        sde.addAvailableFlight(f3);
        sde.addAvailableFlight(f4);
        sde.addAvailableFlight(f5);
        sde.addAvailableFlight(f6);
        sde.addAvailableFlight(f7);
        sde.addAvailableFlight(f8);
        sde.addAvailableFlight(f9);
        sde.addAvailableFlight(f1);

        Reservation user = new Reservation("Pinal");
        String from = "Dallas";
        String to = "Los Angelos";
        for(Cars i : sde.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }

        //Add one more ticket same flight

       /* from = "Los Angelos";
        to = "San Francisco";
        for(Airline i : sde.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }

        for(Airline i : sde.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }*/



    }
}
