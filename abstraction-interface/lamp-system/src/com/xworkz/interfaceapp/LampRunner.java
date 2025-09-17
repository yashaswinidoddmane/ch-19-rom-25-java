package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.LampImpl;
import com.xworkz.interfaceapp.lamp.Lamp;

public class LampRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Lamp lamp = new LampImpl();
        lamp.dim();
        lamp.switchOff();
        lamp.switchOn();
        System.out.println("main ended");
    }
}
