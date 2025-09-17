package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.AthleticsCoachImpl;
import com.xworkz.interfaceapp.athleticscoach.AthleticsCoach;

public class AthleticsRunner {
    public static void main(String[] args){
        System.out.println("main started");
        AthleticsCoach athleticsCoach = new AthleticsCoachImpl();
        athleticsCoach.trainAthletes();
        athleticsCoach.evaluate();
        athleticsCoach.motivate();
        System.out.println("main ended");
    }
}
