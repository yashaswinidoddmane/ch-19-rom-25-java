package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.CarpenterImpl;
import com.xworkz.interfaceapp.carpenter.Carpenter;

public class CarpenterRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Carpenter carpenter = new CarpenterImpl();
        carpenter.cutWood();
        carpenter.makeFurniture();
        carpenter.polishFurniture();
        System.out.println("main ended");
    }
}
