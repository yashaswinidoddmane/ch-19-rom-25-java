package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.waterpurifier.WaterPurifier;

public class WaterPurifierImpl implements WaterPurifier {
    @Override
    public void purify() {
        System.out.println("Purifying water");
    }
    @Override
    public void checkFilter() {
        System.out.println("Filter checked");
    }
    @Override
    public void replaceFilter() {
        System.out.println("Filter replaced");
    }
}
