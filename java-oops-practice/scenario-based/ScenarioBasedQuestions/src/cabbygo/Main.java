package cabbygo;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MH12AB1234"); // Polymorphism
        Driver driver = new Driver("Rahul", "LIC98765", 4.8);

        IRideService rideService = new RideServiceImpl();
        rideService.bookRide(vehicle, driver, 10);
        rideService.endRide();
    }
}

