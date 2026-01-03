package KeyEntities;

public class Main {
    public static void main(String[] args) {
        // Create user
        User user = new User("Tanisha");

        // Add products to cart
        Product p1 = new Product("Laptop", 50000, 1);
        Product p2 = new Product("Mouse", 500, 2);

        user.getCart().addProduct(p1);
        user.getCart().addProduct(p2);

        // Show cart total
        System.out.println("Cart Total: " + user.getCart().calculateTotal());

        // Create and confirm order
        Order order = new Order(user);
        order.showOrderDetails();
        order.confirmOrder();
        order.showOrderDetails();
    }
}
