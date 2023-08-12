package Strategy;

public abstract class Vehicles {
    public DriveStrategy driveVehicles;
    public int mileage;
    public String brand;

    public abstract void setMileage(int mileage);
    public abstract void setBrand(String company);

    public abstract void drive();
}
