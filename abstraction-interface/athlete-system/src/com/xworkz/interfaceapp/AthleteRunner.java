package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.AthleteImpl;
import com.xworkz.interfaceapp.athlete.Athlete;

public class AthleteRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Athlete athlete  =new AthleteImpl();
        athlete.coolDown();
        athlete.playMatch();
        athlete.warmUp();
        System.out.println("main ended");

    }
}
