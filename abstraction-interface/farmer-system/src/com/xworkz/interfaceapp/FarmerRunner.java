package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.FarmerImpl;
import com.xworkz.interfaceapp.farmer.Farmer;

public class FarmerRunner {
    public static void main (String[] args){
        System.out.println("main started");
        Farmer farmer = new FarmerImpl();
        farmer.harvestCrops();
        farmer.ploughField();
        farmer.sowSeeds();
        System.out.println("main ended");
    }
}
