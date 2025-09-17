package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.cricketer.Cricketer;

public class CricketerImpl implements Cricketer {
    @Override
    public void bat() {
        System.out.println("Cricketer batting");
    }
    @Override
    public void bowl() {
        System.out.println("Cricketer bowling");
    }
    @Override
    public void field() {
        System.out.println("Cricketer fielding");
    }
}
