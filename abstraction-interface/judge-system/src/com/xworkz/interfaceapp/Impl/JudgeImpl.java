package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.judge.Judge;

public class JudgeImpl implements Judge {
    @Override
    public void hearCase() {
        System.out.println("Judge is hearing a case");
    }
    @Override
    public void giveVerdict() {
        System.out.println("Judge is giving a verdict");
    }
    @Override
    public void closeCase() {
        System.out.println("Judge is closing the case");
    }
}
