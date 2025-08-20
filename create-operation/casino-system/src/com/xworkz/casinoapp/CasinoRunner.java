package com.xworkz.casinoapp;

public class CasinoRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Casino casino = new Casino();
        casino.noOfTables = 20;
        casino.casinoName = "Royal Ace Casino";
        casino.location = "Goa";
        casino.entryFee = 1500.00;
        casino.hasLiveMusic = true;
        casino.openingTime = "6:00 PM";
        casino.closingTime = "3:00 AM";

        System.out.println("Casino Name: " + casino.casinoName);
        System.out.println("Location: " + casino.location);
        System.out.println("Number of Tables: " + casino.noOfTables);
        System.out.println("Entry Fee: " + casino.entryFee);
        System.out.println("Has Live Music: " + casino.hasLiveMusic);
        System.out.println("Opening Time: " + casino.openingTime);
        System.out.println("Closing Time: " + casino.closingTime);

        System.out.println("Main ended");
    }
}
