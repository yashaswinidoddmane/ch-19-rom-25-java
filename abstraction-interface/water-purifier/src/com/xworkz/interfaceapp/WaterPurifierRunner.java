package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.WaterPurifierImpl;
import com.xworkz.interfaceapp.waterpurifier.WaterPurifier;

public class WaterPurifierRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        WaterPurifier waterPurifier = new WaterPurifierImpl();
        waterPurifier.purify();
        waterPurifier.checkFilter();
        waterPurifier.replaceFilter();
        System.out.println("main ended");
    }

}
