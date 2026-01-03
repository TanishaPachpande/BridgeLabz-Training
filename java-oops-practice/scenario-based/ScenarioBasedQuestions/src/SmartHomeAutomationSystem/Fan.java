package SmartHomeAutomationSystem;

class Fan extends Appliance {

    public Fan(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Fan turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Fan is " + (isOn() ? "ON" : "OFF"));
    }
}
