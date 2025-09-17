package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.coffemachine.CoffeMachine;

public class CoffeMachineImpl implements CoffeMachine {
    @Override
    public void brewCoffee() {
        System.out.println("Brewing coffee");
    }
    @Override
    public void addMilk() {
        System.out.println("Adding milk to coffee");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning coffee machine");
    }
}
