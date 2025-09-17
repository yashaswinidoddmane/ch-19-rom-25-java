package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.microwave.Microwave;

public class MicrowaveImpl implements Microwave {
    @Override
    public void heat() {
        System.out.println("Heating food");
    }
    @Override
    public void grill() {
        System.out.println("Grilling food");
    }
    @Override
    public void bake() {
        System.out.println("Baking food");
    }
}
