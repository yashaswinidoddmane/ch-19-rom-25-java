package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {


    Product[] products = new Product[19];
    int index;

    public boolean addProduct(Product product) {
        boolean isProductAdded = false;
        if (product != null) {
            products[index++] = product;
            isProductAdded = true;
        } else {
            System.out.println("Invalid Product");
        }
        return isProductAdded;
    }
    public void getAllProducts() {
        System.out.println("List of products are");
        for (Product product : products) {
            System.out.println("The product Id is :" + product.getProductId());
            System.out.println("The product Name is:"+ product.getProductName());
            System.out.println("The product Brand is:"+ product.getBrand());
            System.out.println("The product price is:"+ product.getPrice());
            System.out.println("The product rating is:"+ product.getRating());
            System.out.println("The product reviews count is:"+ product.getReviewsCount());
            System.out.println("The product availability status is:"+ product.getAvailabilityStatus());
            System.out.println("The product delivery time is:"+ product.getDeliveryTime());
            System.out.println("The product return policy is:"+ product.getReturnPolicy());
            System.out.println("-------------------------------------------");
        }
    }
}