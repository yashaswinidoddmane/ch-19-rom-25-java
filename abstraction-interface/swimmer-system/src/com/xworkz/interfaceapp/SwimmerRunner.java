package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SwimmerImpl;
import com.xworkz.interfaceapp.swimmer.Swimmer;

public class SwimmerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Swimmer swimmer = new SwimmerImpl();
        swimmer.dive();
        swimmer.swim();
        swimmer.floatWater();
        System.out.println("main ended");
    }
}
