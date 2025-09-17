package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PoliceOfficerimpl;
import com.xworkz.interfaceapp.policeofficer.PoliceOfficer;

public class PoliceRunner {
    public static void main(String[] args){
        System.out.println("main started");
        PoliceOfficer policeOfficer = new PoliceOfficerimpl();
        policeOfficer.arrest();
        policeOfficer.investigate();
        policeOfficer.patrol();
        System.out.println("main ended");
    }
}
