package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.vaccumcleaner.VaccumCleaner;

public class VaccumCleanerImpl implements VaccumCleaner {
    @Override
    public void startCleaning() {
        System.out.println("Vacuum cleaner started");
    }
    @Override
    public void stopCleaning() {
        System.out.println("Vacuum cleaner stopped");
    }
    @Override
    public void emptyDustBag() {
        System.out.println("Dust bag emptied");
    }
}
