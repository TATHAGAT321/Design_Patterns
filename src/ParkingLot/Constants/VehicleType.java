package ParkingLot.Constants;

public enum VehicleType {
    TRUCK(1), BIKE(2), CAR(3);
    private final int value;
    private VehicleType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
