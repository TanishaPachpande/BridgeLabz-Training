package KeyEntities;

import java.util.ArrayList;
import java.util.List;

class Order {
    private User user;
    private List<Product> products;
    private double totalAmount;
    private boolean isConfirmed;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>(user.getCart().getProducts());
        this.totalAmount = user.getCart().calculateTotal();
        this.isConfirmed = false;
    }

    public void confirmOrder() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty. Cannot place order.");
        } else {
            isConfirmed = true;
            System.out.println("Order confirmed for " + user.getName() + ". Total: " + totalAmount);
        }
    }

    public void showOrderDetails() {
        System.out.println("Order Details for " + user.getName() + ":");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " x" + p.getQuantity() + " = " + p.getTotalPrice());
        }
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Confirmed: " + isConfirmed);
    }
}

