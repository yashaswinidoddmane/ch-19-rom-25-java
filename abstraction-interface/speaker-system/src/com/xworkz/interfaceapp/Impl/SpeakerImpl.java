package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.speaker.Speaker;

public class SpeakerImpl implements Speaker {
    @Override
    public void playMusic() {
        System.out.println("Playing music on speaker");
    }
    @Override
    public void increaseVolume() {
        System.out.println("Speaker volume increased");
    }
    @Override
    public void decreaseVolume() {
        System.out.println("Speaker volume decreased");
    }
}
