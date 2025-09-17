package com.xworkz.refrigeratorapp.Impl;

import com.xworkz.refrigeratorapp.regrigerator.Refrigerator;

public class RefrigeratorImpl implements Refrigerator {
    @Override
    public void freeze() {
        System.out.println("Freezer running");
    }
    @Override
    public void defrost() {
        System.out.println("Defrosting fridge");
    }
    @Override
    public void storeFood() {
        System.out.println("Food stored in fridge");
    }
}
