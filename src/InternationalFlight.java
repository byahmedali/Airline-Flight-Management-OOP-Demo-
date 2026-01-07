public class InternationalFlight extends Flight {
    String passportRequirement;

    public InternationalFlight(String flightNumber, String origin, String destination, String passportRequirement) {
        super(flightNumber, origin, destination);
        this.passportRequirement = passportRequirement;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Passport Requirement: " + passportRequirement);
    }
}