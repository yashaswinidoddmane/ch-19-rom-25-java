package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.carpenter.Carpenter;


public class CarpenterImpl implements Carpenter {
    @Override
    public void cutWood() {
        System.out.println("Carpenter cutting wood");
    }
    @Override
    public void makeFurniture() {
        System.out.println("Carpenter making furniture");
    }
    @Override
    public void polishFurniture() {
        System.out.println("Carpenter polishing furniture");
    }
}
