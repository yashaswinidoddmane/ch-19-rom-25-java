package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.Drone.Drone;

public class DroneImpl implements Drone {
    @Override
    public void takeOff() {
        System.out.println("Drone taking off");
    }
    @Override
    public void fly() {
        System.out.println("Drone flying");
    }
    @Override
    public void land() {
        System.out.println("Drone landed");
    }
}
