package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SoldierImpl;
import com.xworkz.interfaceapp.soldier.Soldier;

public class SoldierRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Soldier soldier = new SoldierImpl();
        soldier.defend();
        soldier.march();
        soldier.train();
        System.out.println("main ended");
    }
}
