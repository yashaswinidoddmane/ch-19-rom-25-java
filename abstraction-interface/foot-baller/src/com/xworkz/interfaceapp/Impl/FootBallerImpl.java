package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.footballer.FootBaller;

public class FootBallerImpl implements FootBaller {
    @Override
    public void passBall() {
        System.out.println("Footballer passing the ball");
    }
    @Override
    public void shootGoal() {
        System.out.println("Footballer shooting goal");
    }
    @Override
    public void defend() {
        System.out.println("Footballer defending the goal"); }
}
