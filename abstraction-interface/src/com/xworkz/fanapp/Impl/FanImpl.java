package com.xworkz.fanapp.Impl;

import com.xworkz.fanapp.fan.Fan;

public class FanImpl implements Fan {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is stopped");
    }

    @Override
    public void status() {
        System.out.println("Fan status checked");
    }
}
