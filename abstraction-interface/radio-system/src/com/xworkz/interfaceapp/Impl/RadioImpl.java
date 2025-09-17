package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.radio.Radio;

public class RadioImpl implements Radio {
    @Override
    public void tune() {
        System.out.println("Radio tuned");
    }
    @Override
    public void volumeUp() {
        System.out.println("Radio volume increased");
    }
    @Override
    public void volumeDown() {
        System.out.println("Radio volume decreased");
    }
}
