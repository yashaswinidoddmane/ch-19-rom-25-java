package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.gardener.Gardener;

public class GardenerImpl implements Gardener {
    @Override
    public void waterPlants() {
        System.out.println("Gardener is watering plants");
    }
    @Override
    public void trimPlants() {
        System.out.println("Gardener is trimming plants");
    }
    @Override
    public void growPlants() {
        System.out.println("Gardener is growing plants");
    }
}
