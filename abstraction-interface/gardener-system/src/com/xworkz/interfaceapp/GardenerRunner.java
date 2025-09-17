package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.GardenerImpl;
import com.xworkz.interfaceapp.gardener.Gardener;

public class GardenerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Gardener gardener = new GardenerImpl();
        gardener.growPlants();
        gardener.trimPlants();
        gardener.waterPlants();
        System.out.println("main ended");
    }
}
