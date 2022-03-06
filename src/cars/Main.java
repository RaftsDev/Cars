package cars;

public class Main {

    public static void main(String[] args) {
        
        /*   ((model == "Mazda3") "Toyota Corolla") || "Hyundai Elantra") = "Midsize";
             ("Chevrolet Spark" || "Ford Fiesta") = "Economy";
              ("Ford Focus" || "Nissan Versa") = "Compact";*/
        AmericanWheels c1 = new AmericanWheels(10.00f, "Mazda3", "March,01,2022", "March,02,2022", "Los Angeles", "San Francisco, CA");
        AmericanWheels c2 = new AmericanWheels(15.00f, "Toyota Corolla", "March,02,2022", "March,05,2022", "San Francisco", "Los Angeles, CA");
        AmericanWheels c3 = new AmericanWheels(17.00f, "Hyundai Elantra", "March,03,2022", "March,05,2022", "Irvine, CA", "Los Angeles, CA");
        AmericanRoads c4 = new AmericanRoads(25.00f, "Hyundai Elantra", "March,03,2022", "March,05,2022", "Irvine, CA", "Los Angeles, CA");
        AmericanRoads c5 = new AmericanRoads(27.00f, "Chevrolet Spark", "April,05,2022", "April,07,2022","Pittsburgh, PA", "Jersey city, NJ");
        Commuter c6 = new Commuter(30.00f, "Ford Focus", "April,07,2022", "April,09,2022","Brooklyn, NY","NYC, NY");
        Commuter c7 = new Commuter(40.00f, "Nissan Versa", "April,03,2022", "April,05,2022","Queens, NY","NYC, NY");
        AmericanRoads c8 = new AmericanRoads(50.00f, "Toyota Corolla", "April,05,2022", "April,07,2022","Brooklyn, NY","Queens, NY");

        //Fill out list of available flights in Order System
        Bookable orderList = new Bookable("Order system");
        orderList.addCar(c1);
        orderList.addCar(c2);
        orderList.addCar(c3);
        orderList.addCar(c4);
        orderList.addCar(c5);
        orderList.addCar(c6);
        orderList.addCar(c7);
        orderList.addCar(c8);
        orderList.addCar(c9);
        orderList.addCar(c1);

        Reservation user = new Reservation("Pinal");
        String from = "Dallas";
        String to = "Los Angelos";
        for(Cars i : orderList.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }

        //Add one more ticket same flight

       /* from = "Los Angelos";
        to = "San Francisco";
        for(Airline i : orderList.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }

        for(Airline i : orderList.airlinesAvailable){
            if(i.getToCity() == to && i.getFromCity() == from){
                user.addFlightToBook(i);
            }
        }*/



    }
}
