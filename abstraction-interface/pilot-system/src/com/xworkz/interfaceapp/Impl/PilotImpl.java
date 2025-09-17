package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.pilot.Pilot;

public class PilotImpl implements Pilot {
    @Override
    public void checkControls() {
        System.out.println("Pilot is checking controls");
    }
    @Override
    public void flyPlane() {
        System.out.println("Pilot is flying the plane");
    }
    @Override
    public void landPlane() {
        System.out.println("Pilot is landing the plane");
    }
}
