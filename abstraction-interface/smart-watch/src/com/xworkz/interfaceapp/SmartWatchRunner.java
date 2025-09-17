package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SmartWatchImpl;
import com.xworkz.interfaceapp.SmartWatch.SmartWatch;

public class SmartWatchRunner {
    public static void main(String[] args){
        System.out.println("main started");
        SmartWatch smartWatch = new SmartWatchImpl();
        smartWatch.monitorHeartRate();
        smartWatch.showTime();
        smartWatch.trackSteps();
        System.out.println("main ended");
    }
}
