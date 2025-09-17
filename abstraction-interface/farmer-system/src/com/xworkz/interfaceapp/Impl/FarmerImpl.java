package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.farmer.Farmer;

public class FarmerImpl implements Farmer {
    @Override
    public void ploughField() {
        System.out.println("Farmer is ploughing the field");
    }
    @Override
    public void sowSeeds() {
        System.out.println("Farmer is sowing seeds");
    }
    @Override
    public void harvestCrops() {
        System.out.println("Farmer is harvesting crops");
    }
}
