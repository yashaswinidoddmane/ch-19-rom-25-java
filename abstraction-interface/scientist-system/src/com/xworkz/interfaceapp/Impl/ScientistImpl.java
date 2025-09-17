package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.scientist.Scientist;

public class ScientistImpl implements Scientist {
    @Override
    public void research() {
        System.out.println("Scientist is researching");
    }
    @Override
    public void experiment() {
        System.out.println("Scientist is experimenting");
    }
    @Override
    public void conclude() {
        System.out.println("Scientist is concluding results");
    }
}
