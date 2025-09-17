package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.FootBallerImpl;
import com.xworkz.interfaceapp.footballer.FootBaller;

public class FootRunner {
    public static void main(String[] args){
        System.out.println("main started");
        FootBaller footBaller = new FootBallerImpl();
        footBaller.defend();
        footBaller.passBall();
        footBaller.shootGoal();
        System.out.println("main ended");
    }
}
