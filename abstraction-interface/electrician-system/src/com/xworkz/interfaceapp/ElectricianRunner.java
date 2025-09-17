package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ElectricianImpl;
import com.xworkz.interfaceapp.electrician.Electrician;

public class ElectricianRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Electrician electrician = new ElectricianImpl();
        electrician.checkWiring();
        electrician.fixWiring();
        electrician.testConnection();
        System.out.println("main ended");
    }
}
