package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PilotImpl;
import com.xworkz.interfaceapp.pilot.Pilot;

public class PilotRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Pilot pilot = new PilotImpl();
        pilot.checkControls();
        pilot.flyPlane();
        pilot.landPlane();
        System.out.println("main ended");
    }
}
