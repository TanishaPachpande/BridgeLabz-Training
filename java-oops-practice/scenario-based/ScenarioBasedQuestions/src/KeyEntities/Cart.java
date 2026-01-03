package KeyEntities;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart.");
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}
