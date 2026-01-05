package swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, "Non-Perishable", quantity);
    }

    public double getDiscount() {
        return getTotalPrice() * 0.05;  // 5% discount
    }
}
