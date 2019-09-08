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
        flight = new Flight();
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void testPassengerArrayStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void testBookPassengerOntoFlight() {
        flight.addPassengerToFlight(passenger);
        assertEquals(1, flight.passengerCount());
    }

//    @Test
//    public void testReturnAvailableSeats() {
//        flight.returnAvailableSeats(plane);
//        assertEquals(20, flight.passengerCount());
//    }



}
