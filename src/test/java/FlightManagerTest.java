import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        flightManager = new FlightManager();
        passenger = new Passenger("Jo", 1);
        flight = new Flight("FR756", "GLA", "EDI", "10h00");
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test //total baggage weight reserved for flight
    public void testTotalReservedBagWeightPerFlight() {
        assertEquals(150.0, flightManager.totalReservedBaggageWeight(plane), 0.01);
    }

    @Test //weight reserve for luggage planetype ((total weight / 2) / capacity)
    public void testTotalBagWeightPerPassenger() {
        assertEquals(7.5, flightManager.bagWeightPerPassenger(plane), 0.01);
    }


    @Test //show total weight booked onto flight = number of passengers x bagweightperpassenger
    public void testTotalBookedBaggageWeight() {
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(22.5, flightManager.totalBookedBaggageWeight(plane, flight), 0.01);
    }

    @Test //calculate total remaining baggage weight for flight
    public void testTotalRemainingBaggageAllowance() {
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(142.5, flightManager.remainingBaggageAllowance(plane, flight), 0.01);
    }




}
