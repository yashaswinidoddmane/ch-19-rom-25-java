package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.dancer.Dancer;

public class DancerImpl implements Dancer {
    @Override
    public void practiceDance() {
        System.out.println("Dancer is practicing dance");
    }
    @Override
    public void performDance() {
        System.out.println("Dancer is performing on stage");
    }
    @Override
    public void rest() {
        System.out.println("Dancer is resting after performance");
    }
}
