package com.ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class ProductSearcher {

    public Product linearSearch(Product[] products, String targetProductName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetProductName)) {
                return product;
            }
        }
        return null;
    }

    public Product binarySearch(Product[] sortedProducts, String targetProductName) {
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = targetProductName.compareToIgnoreCase(sortedProducts[mid].getProductName());

            if (comparison == 0) {
                return sortedProducts[mid];
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    public void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}