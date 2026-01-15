package homenest;

public class Light extends Device {

    public Light(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default.");
        firmwareUpdateLog();
    }
}

