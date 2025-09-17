package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.RobotCleanerImpl;
import com.xworkz.interfaceapp.robotcleaner.RobotCleaner;

public class RobotRunner {
    public static void main(String[] args){
        System.out.println("main started");
        RobotCleaner robotCleaner = new RobotCleanerImpl();
        robotCleaner.charge();
        robotCleaner.returnToDock();
        robotCleaner.startCleaning();
        System.out.println("main ended");
    }
}
