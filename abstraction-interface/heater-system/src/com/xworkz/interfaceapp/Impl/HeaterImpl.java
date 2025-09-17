package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.heater.Heater;

public class HeaterImpl implements Heater {
    @Override
    public void heat() {
        System.out.println("Heater running");
    }
    @Override
    public void increaseTemperature() {
        System.out.println("Heater temperature increased");
    }
    @Override
    public void decreaseTemperature() {
        System.out.println("Heater temperature decreased");
    }

}
