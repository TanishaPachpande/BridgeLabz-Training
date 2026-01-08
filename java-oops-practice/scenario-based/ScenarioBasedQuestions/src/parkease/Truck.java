package parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        double penalty = hours > 5 ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}

