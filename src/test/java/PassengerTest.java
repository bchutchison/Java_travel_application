import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Mr Smith", 1);
    }


    @Test
    public void testPassengerHasName() {
        assertEquals("Mr Smith", passenger.getName());
    }

    @Test
    public void testPassenferHasBags() {
        assertEquals(1, passenger.getBags());
    }

}
