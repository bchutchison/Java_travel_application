import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;


    public Flight() {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengerToFlight(Passenger passenger) {
        this.passengers.add(passenger);
    }

//    public void returnAvailableSeats(Plane plane) {
//        this.plane.getPassengerCapacity();
//    }
}
