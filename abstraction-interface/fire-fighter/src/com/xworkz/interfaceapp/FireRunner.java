package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.FireFighterImpl;
import com.xworkz.interfaceapp.firefighter.FireFighter;

public class FireRunner {
    public static void main(String[] args){
        System.out.println("main started");
        FireFighter fireFighter = new FireFighterImpl();
        fireFighter.extinguishFire();
        fireFighter.rescuePeople();
        fireFighter.respondAlarm();
        System.out.println("main ended");
    }
}
