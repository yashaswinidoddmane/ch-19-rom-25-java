package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.AirPlaneimpl;
import com.xworkz.interfaceapp.airplane.AIrPlane;

public class AirRunner {
    public static void main(String[] args){
        System.out.println("main started");
        AIrPlane airPlane = new AirPlaneimpl();
        airPlane.takeOff();
        airPlane.cruise();
        airPlane.takeOff();
        System.out.println("main ended");
    }
}
