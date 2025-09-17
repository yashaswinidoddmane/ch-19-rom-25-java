package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.BusImpl;
import com.xworkz.interfaceapp.bus.Bus;

public class BusRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Bus bus = new BusImpl();
        bus.move();
        bus.stop();
        bus.openDoors();
        System.out.println("main ended");
    }
}
