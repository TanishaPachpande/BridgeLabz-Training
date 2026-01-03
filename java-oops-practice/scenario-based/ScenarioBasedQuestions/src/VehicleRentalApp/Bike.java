package VehicleRentalApp;

class Bike extends Vehicle {

    public Bike(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // simple calculation
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike | Brand: " + brand + ", Rate/day: ₹" + baseRate);
    }
}

