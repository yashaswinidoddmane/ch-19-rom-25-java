package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.CricketerImpl;
import com.xworkz.interfaceapp.cricketer.Cricketer;

public class CricketerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cricketer cricketer = new CricketerImpl();
        cricketer.bat();
        cricketer.bowl();
        cricketer.field();
    }
}
