package com.xowrkz.parkapp.park;

public class ParkRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Park park = new Park();
        park.name = "Wonderland";
        park.location = "Bangalore";
        park.numberOfRides = 25;
        park.entryFee = 499.99;
        park.hasWaterPark = true;
        park.hasFoodCourt = true;
        park.isOpenOnWeekends = true;

        System.out.println("Park Name is: " + park.name);
        System.out.println("park Location is: " + park.location);
        System.out.println("Number of Rides: " + park.numberOfRides);
        System.out.println("Entry Fee: " + park.entryFee);
        System.out.println("Has Water Park: " + park.hasWaterPark);
        System.out.println("Has Food Court: " + park.hasFoodCourt);
        System.out.println("Open on Weekends: " + park.isOpenOnWeekends);

        System.out.println("Main ended");
    }
}
