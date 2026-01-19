package com.javagenerics.digitalonlinemarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {

    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            product.display();
        }
    }
}

