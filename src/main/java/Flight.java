import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;


    public Flight(String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }


    public int returnAvailableSeats(Plane plane) {
        return plane.getPassengerCapacity();
    }

    public int returnNumberOfRemainingSeats(Plane plane) {
        return plane.getPassengerCapacity() - passengerCount();
    }

    public void addPassengerToFlight(Passenger passenger, Plane plane) {
        if (returnAvailableSeats(plane) > passengerCount())
        this.passengers.add(passenger);
    }

    public int returnNumberOfBags() {
        int bagTotal = 0;
        for (Passenger passenger: this.passengers){
            bagTotal += passenger.getBags();
        }
        return bagTotal;
    }

}
