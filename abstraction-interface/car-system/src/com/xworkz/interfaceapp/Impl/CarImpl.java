package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.car.Car;

public class CarImpl implements Car {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }
    @Override
    public void brake() {
        System.out.println("Car braking");
    }
}
