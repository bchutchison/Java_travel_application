public class FlightManager {


    public FlightManager() {

    }

    //total baggage allowance for flight
    public double totalReservedBaggageWeight(Plane plane) {
        return plane.getWeightCapacity() / 2;
    }

    //total allowance per passenger
    public double bagWeightPerPassenger(Plane plane) {
        return totalReservedBaggageWeight(plane) / plane.getPassengerCapacity();
    }

    //total baggage weight booked onto flight
    public double totalBookedBaggageWeight(Plane plane, Flight flight) {
        return bagWeightPerPassenger(plane) * flight.returnNumberOfBags();
    }


    public double remainingBaggageAllowance(Plane plane, Flight flight) {
        return totalReservedBaggageWeight(plane) - totalBookedBaggageWeight(plane, flight);
    }
}
