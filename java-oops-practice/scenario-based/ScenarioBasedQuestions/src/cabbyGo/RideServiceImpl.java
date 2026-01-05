package cabbygo;

public class RideServiceImpl implements IRideService {

    private double fare;

    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        fare = vehicle.calculateFare(distance);
        System.out.println("Ride booked!");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Estimated Fare: ₹" + fare);
    }

    public void endRide() {
        System.out.println("Ride ended.");
        System.out.println("Final Fare: ₹" + fare);
    }
}

