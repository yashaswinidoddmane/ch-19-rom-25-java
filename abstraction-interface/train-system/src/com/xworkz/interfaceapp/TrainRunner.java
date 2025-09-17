package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.TrainImpl;
import com.xworkz.interfaceapp.train.Train;

public class TrainRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Train train = new TrainImpl();
        train.depart();
        train.arrive();
        train.announce();
        System.out.println("main ended");
    }
}
