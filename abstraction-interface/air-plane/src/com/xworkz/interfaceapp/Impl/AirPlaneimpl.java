package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.AirRunner;
import com.xworkz.interfaceapp.airplane.AIrPlane;

public class AirPlaneimpl implements AIrPlane {
    @Override
    public void takeOff() {
        System.out.println("Airplane taking off");
    }
    @Override
    public void cruise() {
        System.out.println("Airplane cruising");
    }
    @Override
    public void land() {
        System.out.println("Airplane landed");
    }
}
