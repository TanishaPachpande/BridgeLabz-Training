package SmartHomeAutomationSystem;

class AC extends Appliance {

    public AC(int power) {
        super(power);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("AC turned ON (Cooling mode)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("AC is " + (isOn() ? "ON" : "OFF"));
    }
}


