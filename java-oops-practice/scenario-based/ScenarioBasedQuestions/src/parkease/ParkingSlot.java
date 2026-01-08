package parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // internal booking record
    private String bookingLog;

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void assignSlot(Vehicle vehicle) {
        isOccupied = true;
        bookingLog = "Slot " + slotId + " occupied by " + vehicle.getVehicleNumber();
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog += " | Slot released";
    }

    // logs exposed, internal data protected
    public void showLog() {
        System.out.println(bookingLog);
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}

