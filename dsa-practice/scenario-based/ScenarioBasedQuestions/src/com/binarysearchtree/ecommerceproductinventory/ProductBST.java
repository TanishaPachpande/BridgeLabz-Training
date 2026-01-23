package com.binarysearchtree.ecommerceproductinventory;

class ProductBST {

    ProductNode root;

    // 🔹 Insert Product
    ProductNode insert(ProductNode root, int sku, double price) {
        if (root == null) {
            return new ProductNode(sku, price);
        }

        if (sku < root.sku) {
            root.left = insert(root.left, sku, price);
        } else if (sku > root.sku) {
            root.right = insert(root.right, sku, price);
        }

        return root;
    }

    // 🔹 Lookup Product (Search)
    ProductNode search(ProductNode root, int sku) {
        if (root == null || root.sku == sku)
            return root;

        if (sku < root.sku)
            return search(root.left, sku);

        return search(root.right, sku);
    }

    // 🔹 Update Price
    void updatePrice(int sku, double newPrice) {
        ProductNode product = search(root, sku);

        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated for SKU " + sku);
        } else {
            System.out.println("Product not found!");
        }
    }

    // 🔹 Display Products in Sorted Order
    void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku + " | Price: ₹" + root.price);
            inorder(root.right);
        }
    }
}

