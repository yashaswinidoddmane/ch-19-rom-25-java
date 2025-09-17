package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.EngineerImpl;
import com.xworkz.interfaceapp.egineer.Engineer;

public class EngineerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Engineer engineer = new EngineerImpl();
        engineer.build();
        engineer.design();
        engineer.test();
        System.out.println("main ended");
    }
}
