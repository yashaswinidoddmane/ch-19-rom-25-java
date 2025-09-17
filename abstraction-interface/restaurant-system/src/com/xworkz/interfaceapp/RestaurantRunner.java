package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.RestaurantImpl;
import com.xworkz.interfaceapp.restaurant.Restauarant;

public class RestaurantRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Restauarant restauarant = new RestaurantImpl();
        restauarant.generateBill();
        restauarant.serveFood();
        restauarant.takeOrder();
        System.out.println("main ended");
    }
}
