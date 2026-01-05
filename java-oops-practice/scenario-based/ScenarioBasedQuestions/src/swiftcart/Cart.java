package swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Constructor without pre-selected items
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    //  Only Cart can calculate total
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice() - p.getDiscount();
        }
    }

    public void applyDiscount(double coupon) {
        totalPrice = totalPrice - coupon;  // operator usage
    }

    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(p.name + " | Qty: " + p.quantity +
                    " | Price: " + p.getTotalPrice());
        }
        System.out.println("Final Amount: " + totalPrice);
    }
}
