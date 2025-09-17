package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.lamp.Lamp;

public class LampImpl implements Lamp {
    @Override
    public void switchOn() {
        System.out.println("Lamp is on");
    }
    @Override
    public void switchOff() {
        System.out.println("Lamp is off");
    }
    @Override
    public void dim() {
        System.out.println("Lamp dimmed");
    }
}
