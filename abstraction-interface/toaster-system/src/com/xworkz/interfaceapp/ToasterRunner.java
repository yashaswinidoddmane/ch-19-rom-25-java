package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ToasterImpl;
import com.xworkz.interfaceapp.toaster.Toaster;

public class ToasterRunner {
    public static  void main(String[] args){
        System.out.println("main started");
        Toaster toaster = new ToasterImpl();
        toaster.cancel();
        toaster.eject();
        toaster.toast();
        System.out.println("main ended");
    }
}
