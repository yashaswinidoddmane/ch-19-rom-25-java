package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.projector.Projector;

public class ProjectorImpl implements Projector {
    @Override
    public void powerOn() {
        System.out.println("Projector powered on");
    }
    @Override
    public void display() {
        System.out.println("Projector displaying content");
    }
    @Override
    public void powerOff() {
        System.out.println("Projector powered off");
    }
}
