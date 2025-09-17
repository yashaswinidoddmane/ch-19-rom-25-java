package com.xworkz.fanapp;

import com.xworkz.fanapp.Impl.FanImpl;
import com.xworkz.fanapp.fan.Fan;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");
        Fan fan = new FanImpl();
        fan.turnOn();
        fan.status();
        fan.turnOff();

        System.out.println("main ended");
    }
}
