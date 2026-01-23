package com.binarysearchtree.ecommerceproductinventory;

class ProductNode {
    int sku;
    double price;
    ProductNode left, right;

    ProductNode(int sku, double price) {
        this.sku = sku;
        this.price = price;
        left = right = null;
    }
}

