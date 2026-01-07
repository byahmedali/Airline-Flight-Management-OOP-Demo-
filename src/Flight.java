public class Flight {
    String flightNumber;
    String origin;
    String destination;

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public void displayInfo() {
        System.out.println("Flight Number: " + flightNumber + " Origin: " + origin + " Destination: " + destination);
    }
}