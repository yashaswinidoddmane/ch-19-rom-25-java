package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.restaurant.Restauarant;

public class RestaurantImpl implements Restauarant {
    @Override
    public void takeOrder() {
        System.out.println("Order taken at restaurant");
    }
    @Override
    public void serveFood() {
        System.out.println("Food served");
    }
    @Override
    public void generateBill() {
        System.out.println("Bill generated");
    }
}
