package homenest;

public abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;              // Encapsulated
    protected double energyUsage;

    // Secure firmware update log
    protected void firmwareUpdateLog() {
        System.out.println("Firmware updated for device ID: " + deviceId);
    }

    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false; // OFF by default
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateTotalEnergy(double hours) {
        return energyUsage * hours;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Device " + deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Device " + deviceId + " turned OFF");
    }

    public abstract void reset(); // Polymorphism
}

