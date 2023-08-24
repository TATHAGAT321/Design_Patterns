package ParkingLot.Service;

import ParkingLot.Constants.VehicleType;

public class Slots {
    private int floorNo, slotNumber;
    private VehicleType vehicleType;
    private boolean isOccupied;

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
