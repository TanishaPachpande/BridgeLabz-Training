package VehicleRentalApp;

class Car extends Vehicle {
    private double luxuryCharge = 500;

    public Car(int id, String brand, double baseRate) {
        super(id, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + luxuryCharge; // surcharge added
    }

    @Override
    public void displayInfo() {
        System.out.println("Car | Brand: " + brand + ", Rate/day: ₹" + baseRate);
    }
}

