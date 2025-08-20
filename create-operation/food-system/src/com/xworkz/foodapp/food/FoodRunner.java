package com.xworkz.foodapp.food;

public class FoodRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Food food = new Food();
        food.setAppId(101);
        food.setAppName("Zomato");
        food.setRating(4.5);
        food.setLaunchYear("2008");

        int appId = food.getAppId();
        String appName = food.getAppName();
        double rating = food.getRating();
        String launchYear = food.getLaunchYear();

        System.out.println("App ID: " + appId);
        System.out.println("App Name: " + appName);
        System.out.println("Rating: " + rating);
        System.out.println("Launch Year: " + launchYear);

        System.out.println("Main ended");
    }
}
