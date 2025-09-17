package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SpeakerImpl;
import com.xworkz.interfaceapp.speaker.Speaker;

public class SpeakerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Speaker speaker = new SpeakerImpl();
        speaker.decreaseVolume();
        speaker.increaseVolume();
        speaker.playMusic();
        System.out.println("main ended");
    }
}
