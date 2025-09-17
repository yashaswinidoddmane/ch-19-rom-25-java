package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.train.Train;

public class TrainImpl implements Train {
    @Override
    public void depart() {
        System.out.println("Train departed");
    }
    @Override
    public void announce() {
        System.out.println("Train announcement made");
    }
    @Override
    public void arrive() {
        System.out.println("Train arrived at station");
    }
}
