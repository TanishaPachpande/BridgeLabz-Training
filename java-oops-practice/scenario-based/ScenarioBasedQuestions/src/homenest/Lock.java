package homenest;

public class Lock extends Device {

    public Lock(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security code regenerated.");
        firmwareUpdateLog();
    }
}

