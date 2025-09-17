package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.firefighter.FireFighter;

public class FireFighterImpl implements FireFighter {
    @Override
    public void respondAlarm() {
        System.out.println("Firefighter responding to alarm");
    }
    @Override
    public void extinguishFire() {
        System.out.println("Firefighter extinguishing fire");
    }
    @Override
    public void rescuePeople() {
        System.out.println("Firefighter rescuing people");
    }
}
