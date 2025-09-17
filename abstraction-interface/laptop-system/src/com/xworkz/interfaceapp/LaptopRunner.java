package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.LaptopImpl;
import com.xworkz.interfaceapp.laptop.Laptop;

public class LaptopRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Laptop laptop = new LaptopImpl();
        laptop.close();
        laptop.open();
        laptop.type();
        System.out.println("main ended");
    }
}
