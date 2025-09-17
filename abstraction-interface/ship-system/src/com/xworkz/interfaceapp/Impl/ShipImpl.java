package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.ship.Ship;

public class ShipImpl implements Ship {
    @Override
    public void anchor() {
        System.out.println("Ship anchored");
    }
    @Override
    public void sail() {
        System.out.println("Ship sailing");
    }
    @Override
    public void dock() {
        System.out.println("Ship docked at port");
    }
}
