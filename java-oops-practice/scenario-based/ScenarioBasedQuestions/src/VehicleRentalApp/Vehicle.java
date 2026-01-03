package VehicleRentalApp;

abstract class Vehicle implements Rentable {
    protected int vehicleId;        // protected for subclass access
    protected String brand;
    protected double baseRate;

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation using getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // Polymorphism
    public abstract void displayInfo();
}

