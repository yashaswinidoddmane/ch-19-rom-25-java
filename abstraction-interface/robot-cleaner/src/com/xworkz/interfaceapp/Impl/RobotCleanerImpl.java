package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.robotcleaner.RobotCleaner;

public class RobotCleanerImpl implements RobotCleaner {
    @Override
    public void startCleaning() {
        System.out.println("Robot cleaner started");
    }
    @Override
    public void returnToDock()
    { System.out.println("Robot cleaner returning to dock");
    }
    @Override
    public void charge() {
        System.out.println("Robot cleaner charging");
    }

}
