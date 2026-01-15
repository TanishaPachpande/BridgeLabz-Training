package homenest;

public class Camera extends Device {

    public Camera(int deviceId, double energyUsage) {
        super(deviceId, energyUsage);
    }

    



	@Override
    public void reset() {
        System.out.println("Camera reset: recording cleared.");
        firmwareUpdateLog();
    }
}

