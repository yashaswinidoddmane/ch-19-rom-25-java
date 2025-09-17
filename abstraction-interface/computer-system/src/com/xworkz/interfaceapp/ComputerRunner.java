package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ComputerImpl;
import com.xworkz.interfaceapp.computer.Computer;

public class ComputerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Computer computer = new ComputerImpl();
        computer.bootUp();
        computer.runProgram();
        computer.shutDown();
        System.out.println("main ended");
    }
}
