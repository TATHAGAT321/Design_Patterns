package ParkingLot.Model;

import ParkingLot.Constants.VehicleType;

public class Car extends Vehicles {

    public Car(String color, String regNum) {
        this.color = color;
        this.type = VehicleType.CAR;
        this.registrationNumber = regNum;
    }

}
