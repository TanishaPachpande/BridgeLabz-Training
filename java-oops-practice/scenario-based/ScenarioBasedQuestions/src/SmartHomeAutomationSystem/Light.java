package SmartHomeAutomationSystem;

class Light extends Appliance {

    public Light() {
        super(10); // default power
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Light turned ON (Soft illumination)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Light is " + (isOn() ? "ON" : "OFF"));
    }
}
