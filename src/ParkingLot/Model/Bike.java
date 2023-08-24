package ParkingLot.Model;

import ParkingLot.Constants.VehicleType;

public class Bike extends Vehicles {
    public Bike(String color, String regNum) {
        this.color = color;
        this.type = VehicleType.BIKE;
        this.registrationNumber = regNum;
    }
}
