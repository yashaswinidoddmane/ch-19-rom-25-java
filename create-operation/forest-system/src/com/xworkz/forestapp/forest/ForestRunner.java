package com.xworkz.forestapp.forest;

public class ForestRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Forest forest = new Forest();
        forest.setLocation( "Bandipur");
        forest.setSafariType("Jeep Safari");
        forest.setDurationInHours(3);
        forest.setPricePerPerson(1500.00);
        forest.setisGuided(true);
        forest.setHasAnimalSightings(true);;
        forest.setMaxCapacity(6);

        String location = forest.getLocation();
        String safaritype = forest.getSafariType();
        int durationinhours = forest.getdurationInHours();
        double priceperperson = forest.getPricePerPerson();
        boolean isguided = forest.getisGuided();
        boolean hasanimalsightings = forest.gethasAnimalSightings();
        int maxcapacity = forest.getMaxCapacity();

        System.out.println("Location: " + location);
        System.out.println("Safari Type: " + safariType);
        System.out.println("Duration : " + durationInHours);
        System.out.println("Price Per Person: " + pricePerPerson);
        System.out.println("Is Guided: " + isGuided);
        System.out.println("Has Animal Sightings: " + hasAnimalSightings);
        System.out.println("Max Capacity: " + maxCapacity);

        System.out.println("Main ended");
    }
}
