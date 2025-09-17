package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.SmartWatch.SmartWatch;

public class SmartWatchImpl implements SmartWatch {
@Override
    public void showTime() {
        System.out.println("Smartwatch showing time");
    }
    @Override
    public void trackSteps() {
        System.out.println("Steps tracked");
    }
    @Override
    public void monitorHeartRate() {
        System.out.println("Heart rate monitored");
    }

}
