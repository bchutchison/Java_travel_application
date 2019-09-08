public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getPassengerCapacity() {
        return this.planeType.getPassengerCapacity();
    }

    public int getWeightCapacity() {

        return this.planeType.getWeightCapacity();
    }


}
