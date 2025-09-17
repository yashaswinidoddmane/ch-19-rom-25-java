package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.ProjectorImpl;
import com.xworkz.interfaceapp.projector.Projector;

public class ProjectorRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Projector projector = new ProjectorImpl();
        projector.display();
        projector.powerOff();
        projector.powerOn();
        System.out.println("main ended");
    }
}
