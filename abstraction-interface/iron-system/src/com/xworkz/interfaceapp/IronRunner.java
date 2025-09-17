package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.IronImpl;
import com.xworkz.interfaceapp.iron.Iron;

public class IronRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Iron iron = new IronImpl();
        iron.coolDown();
        iron.heatUp();
        iron.pressClothes();
        System.out.println("main ended");
    }
}
