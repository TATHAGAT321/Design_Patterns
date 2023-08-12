package Strategy;

import AbstractFactory.Veichle;

public class RacingCar extends Vehicles {

    @Override
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public void setBrand(String company) {
        this.brand = company;
    }
    @Override
    public void drive(){
        driveVehicles = new FastDrive();
        driveVehicles.drive();
    }
}
