package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.bus.Bus;

public class BusImpl implements Bus {
    @Override
    public void openDoors() {
        System.out.println("Bus doors opened");
    }
    @Override
    public void move() {
        System.out.println("Bus moving");
    }
    @Override
    public void stop() {
        System.out.println("Bus stopped");
    }

}
