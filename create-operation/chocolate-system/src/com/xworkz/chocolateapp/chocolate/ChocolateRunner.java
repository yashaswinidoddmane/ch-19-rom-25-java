package com.xworkz.chocolateapp.chocolate;

public class ChocolateRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Chocolate chocolate = new Chocolate();
        chocolate.chocolateId = 1;
        chocolate.chocolateName = "Dairy Milk Silk";
        chocolate.brand = "Cadbury";
        chocolate.price = 85.50;
        chocolate.quantity = "150g";

        System.out.println("Chocolate ID: " + chocolate.chocolateId);
        System.out.println("Chocolate Name: " + chocolate.chocolateName);
        System.out.println("Brand: " + chocolate.brand);
        System.out.println("Price: " + chocolate.price);
        System.out.println("Quantity: " + chocolate.quantity);
    }
}
