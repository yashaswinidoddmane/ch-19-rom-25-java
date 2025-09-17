package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.DriverImpl;
import com.xworkz.interfaceapp.driver.Driver;

public class DriverRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Driver driver = new DriverImpl();
        driver.drive();
        driver.park();
        driver.startVehicle();
        System.out.println("main ended");
    }
}
