package VehicleRentalApp;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Tanisha");

        Vehicle bike = new Bike(101, "Honda", 300);
        Vehicle car = new Car(102, "Hyundai", 1500);
        Vehicle truck = new Truck(103, "Tata", 2500);

        c1.displayCustomer();

        bike.displayInfo();
        System.out.println("Bike Rent (3 days): ₹" + bike.calculateRent(3));

        car.displayInfo();
        System.out.println("Car Rent (3 days): ₹" + car.calculateRent(3));

        truck.displayInfo();
        System.out.println("Truck Rent (3 days): ₹" + truck.calculateRent(3));
    }
}

