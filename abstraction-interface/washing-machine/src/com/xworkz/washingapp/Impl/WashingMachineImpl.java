package com.xworkz.washingapp.Impl;

import com.xworkz.washingapp.washing.WashingMachine;

public class WashingMachineImpl implements WashingMachine {
    @Override
    public void turnOn() {
        System.out.println("Washing machine started");
    }
    @Override
    public void turnOff() {
        System.out.println("Washing machine stopped");
    }
    @Override
    public void status() {
        System.out.println("Washing cycle status checked");
    }
}
