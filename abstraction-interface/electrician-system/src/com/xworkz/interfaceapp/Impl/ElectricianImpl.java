package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.electrician.Electrician;

public class ElectricianImpl implements Electrician {
    @Override
    public void checkWiring() {
        System.out.println("Electrician checking wiring");
    }
    @Override
    public void fixWiring() {
        System.out.println("Electrician fixing wiring");
    }
    @Override
    public void testConnection() {
        System.out.println("Electrician testing connection");
    }
}
