package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.CarImpl;
import com.xworkz.interfaceapp.car.Car;

public class CarRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Car car = new CarImpl();
        car.accelerate();
        car.brake();
        car.startEngine();
        System.out.println("main ended");
    }
}
