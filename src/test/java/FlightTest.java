import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Jo", 1);
        flight = new Flight("FR756", "GLA", "EDI", "10h00");
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testPassengerArrayStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test //return total passenger bags
    public void testNumberOfBagsBooked() {
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(2, flight.returnNumberOfBags());
    }

    @Test
    public void testBookPassengerOntoFlight() {
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void testDoesNotBookPassengerOntoFlight() {
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(20, flight.passengerCount());

    }

    @Test
    public void testReturnNumberOfRemainingSeats() {
        flight.addPassengerToFlight(passenger, plane);
        flight.addPassengerToFlight(passenger, plane);
        assertEquals(18, flight.returnNumberOfRemainingSeats(plane));
    }




}
