package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.TabletImpl;
import com.xworkz.interfaceapp.tablet.Tablet;

public class TabletRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Tablet tablet = new TabletImpl();
        tablet.closeApp();
        tablet.openApp();
        tablet.rotateScreen();
        System.out.println("main ended");
    }
}
