package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.HairDryerImpl;
import com.xworkz.interfaceapp.hairdryer.HairDryer;

public class HairRunner {
    public static void main(String[] args){
        System.out.println("main started");
        HairDryer hairDryer = new HairDryerImpl();
        hairDryer.blowAir();
        hairDryer.changeMode();
        hairDryer.switchOff();
        System.out.println("main ended");
    }
}
