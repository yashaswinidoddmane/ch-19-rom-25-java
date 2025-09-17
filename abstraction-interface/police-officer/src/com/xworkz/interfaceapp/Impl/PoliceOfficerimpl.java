package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.policeofficer.PoliceOfficer;

public class PoliceOfficerimpl implements PoliceOfficer {
    @Override
    public void patrol() {
        System.out.println("Police officer is patrolling the area");
    }
    @Override
    public void investigate() {
        System.out.println("Police officer is investigating a case");
    }
    @Override
    public void arrest() {
        System.out.println("Police officer arrested the suspect");
    }
}
