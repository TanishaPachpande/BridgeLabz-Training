package VehicleRentalApp;

class Truck extends Vehicle {
    private double loadCharge = 1000;

    public Truck(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge; // extra charge
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck | Brand: " + brand + ", Rate/day: ₹" + baseRate);
    }
}
