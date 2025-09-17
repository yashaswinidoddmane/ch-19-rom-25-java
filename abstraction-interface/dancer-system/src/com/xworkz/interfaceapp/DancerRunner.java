package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.DancerImpl;
import com.xworkz.interfaceapp.dancer.Dancer;

public class DancerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Dancer dancer = new DancerImpl();
        dancer.performDance();
        dancer.rest();
        dancer.practiceDance();
        System.out.println("main ended");
    }
}
