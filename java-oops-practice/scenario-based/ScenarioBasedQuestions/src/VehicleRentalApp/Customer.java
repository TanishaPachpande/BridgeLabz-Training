package VehicleRentalApp;

class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
    }
}

