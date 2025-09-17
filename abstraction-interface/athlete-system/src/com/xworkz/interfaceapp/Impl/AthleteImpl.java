package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.athlete.Athlete;

public class AthleteImpl implements Athlete {
    @Override
    public void warmUp() {
        System.out.println("Athlete warming up before match");
    }
    @Override
    public void playMatch() {
        System.out.println("Athlete playing match");
    }
    @Override
    public void coolDown() {
        System.out.println("Athlete cooling down after match");
    }
}
