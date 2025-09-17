package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.egineer.Engineer;

public class EngineerImpl implements Engineer {
    @Override
    public void design() {
        System.out.println("Engineer is designing");
    }
    @Override
    public void build() {
        System.out.println("Engineer is building");
    }
    @Override
    public void test() {
        System.out.println("Engineer is testing the system");
    }

}
