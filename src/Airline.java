import java.util.logging.SocketHandler;

public class Airline {
    private String name;
    private String code;
    private Flight[] flights;

    public Airline(String name, String code, Flight[] flights){
        this.name = name;
        this.code = code;
        this.flights = flights;
    }

    public void displayInfo(){
        System.out.println("Airline: " + name + " (" + code + ").");
        System.out.println("Flights:");
        for(Flight flight: flights){
            flight.displayInfo();
        }
        System.out.println();
    }
}