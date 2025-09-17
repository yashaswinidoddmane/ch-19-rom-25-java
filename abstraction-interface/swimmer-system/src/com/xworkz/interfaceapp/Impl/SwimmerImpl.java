package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.swimmer.Swimmer;

public class SwimmerImpl implements Swimmer {
    @Override
    public void dive() {
        System.out.println("Swimmer diving into water");
    }
    @Override
    public void swim() {
        System.out.println("Swimmer swimming");
    }
    @Override
    public void floatWater() {
        System.out.println("Swimmer floating on water");
    }
}
