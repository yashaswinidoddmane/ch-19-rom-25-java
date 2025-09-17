package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ScientistImpl;
import com.xworkz.interfaceapp.scientist.Scientist;

public class ScientistRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Scientist scientist = new ScientistImpl();
        scientist.conclude();
        scientist.experiment();
        scientist.research();
        System.out.println("main ended");
    }
}
