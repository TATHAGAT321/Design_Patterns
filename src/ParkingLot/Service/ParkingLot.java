package ParkingLot.Service;

import ParkingLot.Constants.VehicleType;
import ParkingLot.Model.Tickets;
import ParkingLot.Model.Vehicles;

import java.util.*;

public class ParkingLot {
    private int floorCount, slots_per_floor;
    private String id;
    private List<Floors> floorsList = new ArrayList<Floors>();
    private HashMap<String, Vehicles> vehicleTicketMap = new HashMap<String,Vehicles>();

    public ParkingLot(int floorCount, String id, int slots_per_floor) {
        this.floorCount = floorCount;
        this.id = id;
        this.slots_per_floor = slots_per_floor;
        initializeParkingLot();
    }
    private void initializeParkingLot() {
        for(int i=0;i<floorCount;i++) {
            Floors floor = new Floors(i+1,slots_per_floor);
            floorsList.add(floor);
        }
    }
    public void addFloor(int slotsCount) {
        floorCount += 1;
        Floors floor = new Floors(floorCount+1,slotsCount);
        floorsList.add(floor);
    }

    public void addSlot(int floorNum) {
        Floors floor = floorsList.get(floorNum-1);
        floor.addSlot();
    }

    public Tickets parkVehicle(Vehicles vehicle) {
        int slotNumber = -1;
        Floors floor = null;
        Tickets ticket = null;
        for(int i=0;i<floorCount;i++) {
            floor = floorsList.get(i);
            if(floor.getFirstVacantSlot(vehicle.getType()) != -1) {
                slotNumber = floor.getFirstVacantSlot(vehicle.getType());
                break;
            }
        }
        if(slotNumber != -1) {
            floor.fillSlot(slotNumber);
            ticket = new Tickets(this.id, floor.getFloorNumber(),slotNumber);
            vehicleTicketMap.put(ticket.getTicketId(),vehicle);
        } else {
            System.out.println("Slot for " + vehicle.getType() + " is fully occupied");
            ticket = new Tickets();
        }
        return ticket;
    }

    public void unpackVehicle(String ticketId) {
        String ticketDetails[] = ticketId.split("_",3);
        int floorNumber = Integer.parseInt(ticketDetails[1]);
        int slotNumber = Integer.parseInt(ticketDetails[2]);
        if(floorNumber > floorCount || slotNumber > slots_per_floor) {
            System.out.println("Invalid Floor/Slot");
            return;
        }
        Floors floor = floorsList.get(floorNumber-1);
        floor.vacateSlot(slotNumber);
        if(vehicleTicketMap.containsKey(ticketId)) {
            Vehicles unParkedVan = vehicleTicketMap.get(ticketId);
            String regNum = unParkedVan.getRegistrationNumber();
            String color = unParkedVan.getColor();
            vehicleTicketMap.remove(ticketId);
            System.out.println("Unparked vehicle with Registration Number: " + regNum + " and Color: " + color);
        } else {
            System.out.println("Vehicle is already unparked");
        }
    }

    public Vector<Integer> getVacantSlotCountPerFloor(VehicleType vehicleType) {
        Vector<Integer> slotCountPerFloor = new Vector<Integer>();
        for(Floors floor: floorsList) {
            int slotCount = floor.getVacantSlotCount(vehicleType);
            System.out.println("Slot Count for floorNumber: " + floor.getFloorNumber() + " is "  + slotCount);
            slotCountPerFloor.add(slotCount);
        }
        return slotCountPerFloor;
    }
    public void showVacantSlotsPerFloor(VehicleType vehicleType) {
        int floorNumber = 0;
        for(Floors floor: floorsList) {
            floorNumber += 1;
            Vector<Integer> slots = floor.getVacantSlots(vehicleType);
            System.out.println("Vacant Slots for Floor: " + floorNumber + " are " + slots.toString());
        }
    }

    public void showFilledSlotsPerFloor(VehicleType vehicleType) {
        int floorNumber = 0;
        for(Floors floor: floorsList) {
            floorNumber += 1;
            Vector<Integer> slots = floor.getFilledSlots(vehicleType);
            System.out.println("Occupied Slots for Floor: " + floorNumber + " are " + slots.toString());
        }
    }

}
