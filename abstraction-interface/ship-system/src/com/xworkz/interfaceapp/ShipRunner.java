package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ShipImpl;
import com.xworkz.interfaceapp.ship.Ship;

public class ShipRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Ship ship = new ShipImpl();
        ship.anchor();
        ship.dock();
        ship.sail();
        System.out.println("main ended");
    }
}
