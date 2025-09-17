package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.MusicianImpl;
import com.xworkz.interfaceapp.musician.Musician;

public class MusicianRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Musician musician = new MusicianImpl();
        musician.playMusic();
        musician.stopMusic();
        musician.tuneInstrument();
        System.out.println("main ended");
    }
}
