package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.computer.Computer;

public class ComputerImpl implements Computer {
    @Override
    public void bootUp() {
        System.out.println("Computer booted up");
    }
    @Override
    public void runProgram() {
        System.out.println("Running program");
    }
    @Override
    public void shutDown() {
        System.out.println("Computer shut down");
    }
}
