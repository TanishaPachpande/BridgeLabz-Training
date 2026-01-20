package com.flashdealz;

public class FlashDealz {

    public static void quickSort(Product[] products, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(products, low, high);
            quickSort(products, low, pivotIndex - 1);
            quickSort(products, pivotIndex + 1, high);
        }
    }

    private static int partition(Product[] products, int low, int high) {
        int pivot = products[high].discount;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Descending order (highest discount first)
            if (products[j].discount > pivot) {
                i++;
                swap(products, i, j);
            }
        }
        swap(products, i + 1, high);
        return i + 1;
    }

    private static void swap(Product[] products, int i, int j) {
        Product temp = products[i];
        products[i] = products[j];
        products[j] = temp;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("Phone", 30),
            new Product("Laptop", 60),
            new Product("Headphones", 15),
            new Product("TV", 80),
            new Product("Shoes", 45)
        };

        quickSort(products, 0, products.length - 1);

        System.out.println("Top Discounted Products:");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "% OFF");
        }
    }
}

