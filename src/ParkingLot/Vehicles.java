package ParkingLot;

public abstract class Vehicles {
    String registrationNumber;
    String color;
    VehicleType type;
    int slotNumber;
    int floorNumber;


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
