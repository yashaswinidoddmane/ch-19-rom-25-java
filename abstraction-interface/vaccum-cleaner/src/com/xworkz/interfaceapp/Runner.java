package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.VaccumCleanerImpl;
import com.xworkz.interfaceapp.vaccumcleaner.VaccumCleaner;

public class Runner {
    public static void main(String[] args){
        System.out.println("main started");
        VaccumCleaner vaccumCleaner = new VaccumCleanerImpl();
        vaccumCleaner.emptyDustBag();
        vaccumCleaner.startCleaning();
        vaccumCleaner.stopCleaning();
        System.out.println("main ended");
    }
}
