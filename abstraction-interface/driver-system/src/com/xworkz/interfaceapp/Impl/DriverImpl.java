package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.driver.Driver;

public class DriverImpl implements Driver {
    @Override
    public void startVehicle() {
        System.out.println("Driver started the vehicle");
    }
    @Override
    public void drive() {
        System.out.println("Driver is driving");
    }
    @Override
    public void park() {
        System.out.println("Driver parked the vehicle");
    }
}
