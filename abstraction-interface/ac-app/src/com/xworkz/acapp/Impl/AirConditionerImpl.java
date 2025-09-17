package com.xworkz.acapp.Impl;

import com.xworkz.acapp.ac.AirConditioner;

public class AirConditionerImpl implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("AC is cooling");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is off");
    }

    @Override
    public void status() {
        System.out.println("AC status checked");
    }
}
