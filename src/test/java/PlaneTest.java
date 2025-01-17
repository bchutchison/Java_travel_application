import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() { plane = new Plane(PlaneType.BOEING747);}

    @Test
    public void planeHasType() { assertEquals(PlaneType.BOEING747, plane.getPlaneType());}

    @Test
    public void planeHasPassengerCapacity() { assertEquals(20, plane.getPassengerCapacity());}

    @Test
    public void planeHasWeightCapacity() { assertEquals(300, plane.getWeightCapacity());}

}
