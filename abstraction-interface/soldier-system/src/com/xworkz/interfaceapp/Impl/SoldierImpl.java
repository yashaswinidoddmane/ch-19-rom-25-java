package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.soldier.Soldier;

import java.net.SocketImplFactory;

public class SoldierImpl implements Soldier {
    @Override
    public void train() {
        System.out.println("Soldier is training hard");
    }
    @Override
    public void defend() {
        System.out.println("Soldier is defending the border");
    }
    @Override
    public void march() {
        System.out.println("Soldier is marching in formation");
    }
}
