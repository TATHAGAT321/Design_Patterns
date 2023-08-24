import ParkingLot.Constants.VehicleType;
import ParkingLot.Model.*;
import ParkingLot.Service.ParkingLot;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ParkingLot parkingLot = null;
        Vehicles vehicles = null;
        HashMap<String, VehicleType> vehicleMap = new HashMap<String, VehicleType>();

        vehicleMap.put("CAR",VehicleType.CAR);
        vehicleMap.put("BIKE",VehicleType.BIKE);
        vehicleMap.put("TRUCK",VehicleType.TRUCK);

        while(true){
            String command = myObj.nextLine();
            String commandInfo[] = command.split(" ",0);
            switch (commandInfo[0]) {
                case "create_parking_lot":
                    parkingLot = new ParkingLot(Integer.parseInt(commandInfo[2]), commandInfo[1], Integer.parseInt(commandInfo[3]));
                    break;
                case "park_vehicle":
                    System.out.println(commandInfo[1]);
                    if (commandInfo[1].equals("CAR")) {
                        vehicles = new Car(commandInfo[3], commandInfo[2]);
                    } else if (commandInfo[1].equals("TRUCK")) {
                        vehicles = new Truck(commandInfo[3], commandInfo[2]);
                    } else if (commandInfo[1].equals("BIKE")) {
                        vehicles = new Bike(commandInfo[3], commandInfo[2]);
                    } else {
                        System.out.println("Input Vehicle Type is invalid");
                    }
                    Tickets ticket = parkingLot.parkVehicle(vehicles);
                    if(ticket.getTicketId().equals("null_-1_-1")){
                        System.out.println("Ticket is full");
                    } else {
                        System.out.println("Ticket has been allocated with ID: " + ticket.getTicketId());
                    }
                    break;
                case "unpark_vehicle":
                    parkingLot.unpackVehicle(commandInfo[1]);
                    break;
                case "display":
                    switch (commandInfo[1]) {
                        case "free_count":
                            Vector<Integer> slotsCount = parkingLot.getVacantSlotCountPerFloor(vehicleMap.get(commandInfo[2]));
                            System.out.println("Vacant Slots per Floors : " + slotsCount.toString());
                            break;
                        case "free_slots":
                            parkingLot.showVacantSlotsPerFloor(vehicleMap.get(commandInfo[2]));
                            break;
                        case "occupied_slots":
                            parkingLot.showFilledSlotsPerFloor(vehicleMap.get(commandInfo[2]));
                            break;
                        default:
                            System.out.println("Wrong display command has been input from command line");
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong command has been input from from command line");
            }
        }
    }
}