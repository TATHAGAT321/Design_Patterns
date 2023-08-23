package ParkingLot;

public class Truck extends Vehicles{

    public Truck(String color, String regNum) {
        this.color = color;
        this.type = VehicleType.TRUCK;
        this.registrationNumber = regNum;
    }

}
