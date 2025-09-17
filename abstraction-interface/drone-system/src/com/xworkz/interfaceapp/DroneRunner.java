package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Drone.Drone;
import com.xworkz.interfaceapp.Impl.DroneImpl;

public class DroneRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Drone drone = new DroneImpl();
        drone.fly();
        drone.land();
        drone.takeOff();
        System.out.println("main ended");
    }
}
