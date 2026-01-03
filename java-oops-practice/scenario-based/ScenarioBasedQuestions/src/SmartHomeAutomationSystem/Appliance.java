package SmartHomeAutomationSystem;

abstract class Appliance implements Controllable {
    private boolean isOn;            // internal state (private)
    private int powerConsumption;    // watts

    // Default power constructor
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    // User-defined power constructor
    public Appliance(int powerConsumption, boolean state) {
        this.powerConsumption = powerConsumption;
        this.isOn = state;
    }

    protected void setState(boolean state) {
        this.isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public abstract void displayStatus();
}
