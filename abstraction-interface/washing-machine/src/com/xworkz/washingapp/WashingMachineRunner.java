package com.xworkz.washingapp;

import com.xworkz.washingapp.Impl.WashingMachineImpl;
import com.xworkz.washingapp.washing.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args){
        WashingMachine wm = new WashingMachineImpl();
        wm.turnOn();
        wm.status();
        wm.turnOff();
    }
}
