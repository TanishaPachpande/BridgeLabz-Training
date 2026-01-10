package foodloop;

public class FoodItem {

    private String name;
    private String category;
    protected double price;
    private int stock;   // encapsulated (hidden)

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public double getPrice() {
        return price;
    }

    public void displayItem() {
        System.out.println(name + " | " + category + " | ₹" + price);
    }
}
