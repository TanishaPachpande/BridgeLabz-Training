package parkease;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Slot ID:");
        int slotId = sc.nextInt();
        sc.nextLine();

        System.out.println("Allowed Vehicle Type (Car/Bike/Truck):");
        String allowedType = sc.nextLine();

        ParkingSlot slot = new ParkingSlot(slotId, allowedType);

        System.out.println("Enter Vehicle Type (Car/Bike/Truck):");
        String vehicleType = sc.nextLine();

        System.out.println("Enter Vehicle Number:");
        String number = sc.nextLine();

        Vehicle vehicle;

        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(number);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            vehicle = new Bike(number);
        } else {
            vehicle = new Truck(number);
        }

        if (slot.isAvailable() &&
            vehicleType.equalsIgnoreCase(slot.getVehicleTypeAllowed())) {

            slot.assignSlot(vehicle);

            System.out.println("Enter Parking Duration (hours):");
            int hours = sc.nextInt();

            double charges = vehicle.calculateCharges(hours);

            System.out.println("Parking Charges: ₹" + charges);

            slot.releaseSlot();
            slot.showLog();

        } else {
            System.out.println("Slot not available or vehicle type not allowed ❌");
        }

        sc.close();
    }
}

