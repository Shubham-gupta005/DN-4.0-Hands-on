package com.ecommerce;

import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Mouse", "Electronics"),
                new Product("P003", "Keyboard", "Electronics"),
                new Product("P004", "Desk Chair", "Furniture"),
                new Product("P005", "Monitor", "Electronics"),
                new Product("P006", "Book Shelf", "Furniture"),
                new Product("P007", "Webcam", "Electronics"),
                new Product("P008", "Router", "Networking")
        };

        ProductSearcher searcher = new ProductSearcher();

        System.out.println("<--- Linear Search --->");
        String targetLinear1 = "Keyboard";
        Product foundLinear1 = searcher.linearSearch(products, targetLinear1);
        System.out.println("Searching for '" + targetLinear1 + "': " + (foundLinear1 != null ? foundLinear1 : "Not found"));

        String targetLinear2 = "Gaming PC";
        Product foundLinear2 = searcher.linearSearch(products, targetLinear2);
        System.out.println("Searching for '" + targetLinear2 + "': " + (foundLinear2 != null ? foundLinear2 : "Not found"));

        System.out.println("\n<--- Binary Search --->");
        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        searcher.sortProductsByName(sortedProducts);
        System.out.println("Sorted Products:");
        for (Product p : sortedProducts) {
            System.out.println(p);
        }

        String targetBinary1 = "Monitor";
        Product foundBinary1 = searcher.binarySearch(sortedProducts, targetBinary1);
        System.out.println("\nSearching for '" + targetBinary1 + "': " + (foundBinary1 != null ? foundBinary1 : "Not found"));

        String targetBinary2 = "Desk Chair";
        Product foundBinary2 = searcher.binarySearch(sortedProducts, targetBinary2);
        System.out.println("Searching for '" + targetBinary2 + "': " + (foundBinary2 != null ? foundBinary2 : "Not found"));

        String targetBinary3 = "Headphones";
        Product foundBinary3 = searcher.binarySearch(sortedProducts, targetBinary3);
        System.out.println("Searching for '" + targetBinary3 + "': " + (foundBinary3 != null ? foundBinary3 : "Not found"));
    }
}