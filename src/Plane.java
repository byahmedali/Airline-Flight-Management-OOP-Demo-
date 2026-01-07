public class Plane {
    Seat[] seats;   // Composition

    public Plane(int capacity) {
        seats = new Seat[capacity];

        for (int i = 0; i < capacity; i++) {
            seats[i] = new Seat(i + 1, "Economy");
        }
    }

    public void displaySeats() {
        System.out.println("Plane Seats:");
        for (Seat seat : seats) {
            System.out.println("Seat " + seat.seatNumber + " - " + seat.classType);
        }
        System.out.println();
    }
}