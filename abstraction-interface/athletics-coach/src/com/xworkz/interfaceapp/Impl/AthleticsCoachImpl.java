package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.athleticscoach.AthleticsCoach;

public class AthleticsCoachImpl implements AthleticsCoach {
    @Override
    public void trainAthletes() {
        System.out.println("Coach training athletes");
    }
    @Override
    public void motivate() {
        System.out.println("Coach motivating athletes");
    }
    @Override
    public void evaluate() {
        System.out.println("Coach evaluating performance");
    }
}
