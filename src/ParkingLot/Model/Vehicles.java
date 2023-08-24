package ParkingLot.Model;

import ParkingLot.Constants.VehicleType;

public abstract class Vehicles {
    protected String registrationNumber, color;
    protected VehicleType type;
    private int slotNumber, floorNumber;


    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public void setSlotNumber(int slot) {
        this.slotNumber = slot;
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    public String getColor() {
        return this.color;
    }
    public VehicleType getType() {
        return this.type;
    }
}
