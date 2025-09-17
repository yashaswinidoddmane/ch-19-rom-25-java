package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.HeaterImpl;
import com.xworkz.interfaceapp.heater.Heater;

public class HeaterRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Heater heater = new HeaterImpl();
        heater.heat();
        heater.decreaseTemperature();
        heater.increaseTemperature();
        System.out.println("main ended");
    }
}
