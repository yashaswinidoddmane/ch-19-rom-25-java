package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.MicrowaveImpl;
import com.xworkz.interfaceapp.microwave.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Microwave oven = new MicrowaveImpl();
        oven.heat();
        oven.grill();
        oven.bake();
        System.out.println("main ended");
    }
}
