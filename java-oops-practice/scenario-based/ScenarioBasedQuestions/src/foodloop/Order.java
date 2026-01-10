package foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items;
    private double total;

    // Normal order
    public Order() {
        items = new ArrayList<>();
        total = 0;
    }

    // Combo meal constructor
    public Order(List<FoodItem> comboItems) {
        this.items = comboItems;
        calculateTotal();
    }

    public void addItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
            total += item.getPrice();
        } else {
            System.out.println("Item not available!");
        }
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
    }

    // Polymorphism (discount logic)
    public void applyDiscount() {
        if (total >= 1000) {
            total -= 200;
            System.out.println("₹200 discount applied!");
        } else if (total >= 500) {
            total -= 100;
            System.out.println("₹100 discount applied!");
        } else {
            System.out.println("No discount applied.");
        }
    }

    @Override
    public void placeOrder() {
        applyDiscount();
        System.out.println("Order placed successfully!");
        System.out.println("Final Amount: ₹" + total);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled!");
    }

    public void showOrder() {
        System.out.println("\n--- Order Items ---");
        for (FoodItem item : items) {
            item.displayItem();
        }
        System.out.println("Total before discount: ₹" + total);
    }
}

