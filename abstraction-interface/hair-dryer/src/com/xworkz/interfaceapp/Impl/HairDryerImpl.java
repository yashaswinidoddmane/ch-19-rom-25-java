package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.hairdryer.HairDryer;

public class HairDryerImpl implements HairDryer {
    @Override
    public void blowAir() {
        System.out.println("Hair dryer blowing air");
    }
    @Override
    public void changeMode() {
        System.out.println("Hair dryer mode changed");
    }
    @Override
    public void switchOff() {
        System.out.println("Hair dryer switched off");
    }
}
