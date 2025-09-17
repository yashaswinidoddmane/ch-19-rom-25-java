package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.CoffeMachineImpl;
import com.xworkz.interfaceapp.coffemachine.CoffeMachine;

public class CoffeeRunner {
    public static void main(String[] args){
        System.out.println("main started");
        CoffeMachine coffeeMachine = new CoffeMachineImpl();
        coffeeMachine.brewCoffee();
        coffeeMachine.addMilk();
        coffeeMachine.clean();
        System.out.println("main ended");
    }
}
