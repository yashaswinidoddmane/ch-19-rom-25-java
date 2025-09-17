package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.actor.Actor;

public class Actorimpl implements Actor {
    @Override
    public void rehearse() {
        System.out.println("Actor rehearsing for role");
    }
    @Override
    public void perform() {
        System.out.println("Actor performing on stage");
    }
    @Override
    public void bow() {
        System.out.println("Actor taking a bow");
    }
}
