public enum PlaneType {

    BOEING747(20, 300),
    BOEING748(40, 600),
    BOEING749(60, 900),
    BOEING750(10, 150);

    private final int passengerCapacity;
    private final int weightCapacity;


    PlaneType(int passengerCapacity, int weightCapacity) {
        this.passengerCapacity = passengerCapacity;
        this.weightCapacity = weightCapacity;

    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }


}
