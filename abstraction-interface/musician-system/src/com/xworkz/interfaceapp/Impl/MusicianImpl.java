package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.musician.Musician;

public class MusicianImpl implements Musician {
    @Override
    public void tuneInstrument() {
        System.out.println("Musician tuning instrument");
    }
    @Override
    public void playMusic() {
        System.out.println("Musician playing music");
    }
    @Override
    public void stopMusic() {
        System.out.println("Musician stopped playing");
    }
}
