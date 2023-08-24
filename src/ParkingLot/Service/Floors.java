package ParkingLot.Service;

import ParkingLot.Constants.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class Floors {
    private int floorNumber, maxSlotCount;
    private List<Slots> slotsList = new ArrayList<Slots>();
    private Vector<PriorityQueue<Integer>> slotStore = new Vector<PriorityQueue<Integer>>();

    private int countVacant[] = new int[4]; //  1--> TRUCK, 2 --> BIKE, 3 -->CAR

    public Floors(int floorNumber, int maxSlotCount) {
        this.floorNumber = floorNumber;
        this.maxSlotCount = maxSlotCount;
        initializeFloor();
    }
    private void initializeFloor(){

        for(int i=1;i<=maxSlotCount;i++) {
            Slots localSlot;
            int slotStoreSize = slotStore.size();
            System.out.println("SlotStore Size " + slotStoreSize);
            switch (i) {
                case 1:
                    localSlot = new Slots(floorNumber, VehicleType.TRUCK, i);
                    break;
                case 2:
                case 3:
                    localSlot = new Slots(floorNumber, VehicleType.BIKE, i);
                    break;
                default:
                    localSlot = new Slots(floorNumber, VehicleType.CAR, i);
            }

            int index = localSlot.getVehicleType().getValue();
            countVacant[index] += 1;
            localSlot.setIsOccupied(false);
            slotsList.add(localSlot);
            if(slotStoreSize < index) {
                PriorityQueue<Integer> localStore = new PriorityQueue<Integer>();
                localStore.add(i);
                localStore.add(Integer.MAX_VALUE);
                slotStore.add(localStore);
            } else {
                slotStore.get(index-1).add(i);
            }
        }
    }
    public Vector<Integer> getVacantSlots(VehicleType vehicle) {
        Vector<Integer> vacantSlots = new Vector<Integer>();
        for(Slots slot: slotsList){
            int index = slot.getSlotNumber();
            if(!slot.isOccupied() && slot.getVehicleType() == vehicle) {
                vacantSlots.add(index);
            }
        }
        return vacantSlots;
    }
    public int getVacantSlotCount(VehicleType vehicle) {
        int index = vehicle.getValue();
        return countVacant[index];
    }
    public Vector<Integer> getFilledSlots(VehicleType vehicle) {
        Vector<Integer> filledSlots = new Vector<Integer>();
        for(Slots slot: slotsList){
            int index = slot.getSlotNumber();
            if(slot.isOccupied() && slot.getVehicleType() == vehicle) {
                filledSlots.add(index);
            }
        }
        return filledSlots;
    }
    public void vacateSlot(int number) {
        Slots slot = slotsList.get(number-1);
        int index = slot.getVehicleType().getValue();
        System.out.println("Received slotNUm: " + number + "Index is : " + index);
        if(!slot.isOccupied()) {
            return;
        }
        slotStore.get(index-1).add(number);
        countVacant[index] += 1;
        slot.setIsOccupied(false);
    }
    public void fillSlot(int number) {
        Slots slot = slotsList.get(number-1);
        int index = slot.getVehicleType().getValue();
        System.out.println("Received slotNUm: " + number + "Index is : " + index + "SlotStore: " + slotStore.size());
        if(slot.isOccupied()) {
            System.out.println("slot is already filled");
            return;
        }
        slotStore.get(index-1).poll();
        countVacant[index] -= 1;
        slot.setIsOccupied(true);
    }
    public int getFirstVacantSlot(VehicleType vehicle) {
        int index = vehicle.getValue();
        if(slotStore.get(index-1).size() == 1) {
            return -1;
        } else {
            return slotStore.get(index-1).peek();
        }
    }

    public void addSlot(){
        Slots localSlot;

        maxSlotCount += 1;
        if(maxSlotCount % 4 == 0){
            localSlot = new Slots(floorNumber, VehicleType.CAR,maxSlotCount);
        } else if(maxSlotCount%4 == 1) {
            localSlot = new Slots(floorNumber, VehicleType.CAR,maxSlotCount);
        } else {
            localSlot = new Slots(floorNumber, VehicleType.BIKE,maxSlotCount);
        }
        slotsList.add(localSlot);
        localSlot.setIsOccupied(false);
        int index = localSlot.getVehicleType().getValue();

        if(slotStore.size() < index) {
            PriorityQueue<Integer> localStore = new PriorityQueue<Integer>();
            localStore.add(maxSlotCount);
            slotStore.add(localStore);
        } else {
            slotStore.get(index-1).add(maxSlotCount);
        }
    }

    public int getFloorNumber() {
        return this.floorNumber;
    }
}
