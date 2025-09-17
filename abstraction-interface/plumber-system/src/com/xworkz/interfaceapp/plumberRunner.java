package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PlumberImpl;
import com.xworkz.interfaceapp.plumber.Plumber;

public class plumberRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Plumber plumber  = new PlumberImpl();
        plumber.checkLeak();
        plumber.repairPipe();
        plumber.testWaterFlow();
        System.out.println("main ended");
    }
}
