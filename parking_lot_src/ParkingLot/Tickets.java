package ParkingLot;

public class Tickets {
    String parking_lot_id;
    int floor_no;
    int slot_no;
    String ticketId;
    public Tickets() {
        this.ticketId = "";
        this.floor_no = -1;
        this.slot_no = -1;
    }
    public Tickets(String parking_lot_id, int floor_no, int slot_no) {
        this.parking_lot_id = parking_lot_id;
        this.floor_no = floor_no;
        this.slot_no = slot_no;
    }

    public String getTicketId() {
        String ticketId = parking_lot_id + "_" + Integer.toString(floor_no) + "_" + Integer.toString(slot_no);
        return ticketId;
    }
}
