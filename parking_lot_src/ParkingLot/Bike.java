package ParkingLot;

public class Bike extends Vehicles{
    public Bike(String color, String regNum) {
        this.color = color;
        this.type = VehicleType.BIKE;
        this.registrationNumber = regNum;
    }
}
