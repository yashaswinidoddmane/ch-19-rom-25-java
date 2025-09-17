package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.iron.Iron;

public class IronImpl implements Iron {
    @Override
    public void heatUp() {
        System.out.println("Iron heating up");
    }
    @Override
    public void pressClothes() {
        System.out.println("Pressing clothes");
    }
    @Override
    public void coolDown() {
        System.out.println("Iron cooling down");
    }
}
