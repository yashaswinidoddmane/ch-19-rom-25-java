package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.television.Television;

public class TelevisionImpl implements Television {
    @Override
    public void play() {
        System.out.println("TV is playing");
    }
    @Override
    public void changeChannel() {
        System.out.println("Channel changed");
    }
    @Override
    public void mute() {
        System.out.println("TV muted");
    }
}
