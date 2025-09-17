package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.toaster.Toaster;

public class ToasterImpl implements Toaster {
    @Override
    public void toast() {
        System.out.println("Toasting bread");
    }
    @Override
    public void cancel() {
        System.out.println("Toasting cancelled");
    }
    @Override
    public void eject() {
        System.out.println("Bread ejected");
    }
}
