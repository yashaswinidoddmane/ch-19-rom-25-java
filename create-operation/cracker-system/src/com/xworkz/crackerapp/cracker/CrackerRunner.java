package com.xworkz.crackerapp.cracker;

public class CrackerRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Cracker cracker = new Cracker();
        cracker.name = "Ladi Bomb";
        cracker.brand = "Standard Fireworks";
        cracker.weight = 0.25;
        cracker.color = "Red";
        cracker.price = 150.0;
        cracker.isSoundBased = true;
        cracker.isAvailable = true;

        System.out.println("Name: " + cracker.name);
        System.out.println("Brand: " + cracker.brand);
        System.out.println("Weight : " + cracker.weight);
        System.out.println("Color: " + cracker.color);
        System.out.println("Price: " + cracker.price);
        System.out.println("Is Sound Based: " + cracker.isSoundBased);
        System.out.println("Is Available: " + cracker.isAvailable);

        System.out.println("Main ended");
    }
}
