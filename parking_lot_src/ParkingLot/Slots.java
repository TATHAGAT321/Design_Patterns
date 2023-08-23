package ParkingLot;

import java.util.Vector;

public class Slots {
    int floorNo;
    VehicleType vehicleType;
    int slotNumber;
    boolean isOccupied;

    public Slots(int floorNo, VehicleType vehicle, int slotNumber) {
        this.slotNumber = slotNumber;
        this.floorNo = floorNo;
        this.vehicleType = vehicle;
    }
    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }
    public VehicleType getVehicleType(){
        return this.vehicleType;
    }
    public int getSlotNumber() {
        return this.slotNumber;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }
}
