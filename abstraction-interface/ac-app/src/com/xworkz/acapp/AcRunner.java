package com.xworkz.acapp;

import com.xworkz.acapp.Impl.AirConditionerImpl;
import com.xworkz.acapp.ac.AirConditioner;

public class AcRunner {
    public static void main(String[] args){
        AirConditioner ac = new AirConditionerImpl();
        ac.turnOn();
        ac.status();
        ac.turnOff();
    }
}
