public class AirportDemo {
    static void main() {
        Flight flight1 = new Flight("PK12", "Islamabad", "Skardu");
        Flight flight2 = new Flight("PK14", "Gilgit", "Karachi");
        Flight flight3 = new InternationalFlight("PK17", "Lahore", "London, UK", "UK Visa Required");
        Flight[] flights = {flight1, flight2, flight3};

        Airline pia = new Airline("Pakistan International Airlines", "PIA", flights);
        pia.displayInfo();

        Plane b777 = new Plane(5);
        b777.displaySeats();
        }
    }