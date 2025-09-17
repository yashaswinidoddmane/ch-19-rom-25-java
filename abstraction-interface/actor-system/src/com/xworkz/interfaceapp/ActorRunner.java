package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.Actorimpl;
import com.xworkz.interfaceapp.actor.Actor;

public class ActorRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Actor actor = new Actorimpl();
        actor.bow();
        actor.perform();
        actor.rehearse();
        System.out.println("main ended");
    }
}
