package SmartHomeAutomationSystem;

public class Main {
    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan(75);
        Appliance ac = new AC(1500);

        UserController controller = new UserController();

        controller.operateDevice(light, true);
        controller.operateDevice(ac, true);

        light.displayStatus();
        ac.displayStatus();

        controller.compareEnergy(fan, ac);
    }
}

