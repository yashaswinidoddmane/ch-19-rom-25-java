package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.tablet.Tablet;

public class TabletImpl implements Tablet {
    @Override
    public void openApp() {
        System.out.println("App opened on tablet");
    }
    @Override
    public void rotateScreen() {
        System.out.println("Tablet screen rotated");
    }
    @Override
    public void closeApp() {
        System.out.println("App closed on tablet");
    }
}
