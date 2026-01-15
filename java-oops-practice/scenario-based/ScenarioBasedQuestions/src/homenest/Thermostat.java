package homenest;

public class Thermostat extends Device {

    public Thermostat(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature set to 24°C.");
        firmwareUpdateLog();
    }
}

