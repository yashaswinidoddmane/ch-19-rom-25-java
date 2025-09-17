package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.plumber.Plumber;

public class PlumberImpl implements Plumber {
    @Override
    public void checkLeak() {
        System.out.println("Plumber checking leak");
    }
    @Override
    public void repairPipe() {
        System.out.println("Plumber repairing pipe");
    }
    @Override
    public void testWaterFlow() {
        System.out.println("Plumber testing water flow");
    }
}
