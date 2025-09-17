package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.RadioImpl;
import com.xworkz.interfaceapp.radio.Radio;

public class RadioRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Radio radio = new RadioImpl();
        radio.tune();
        radio.volumeDown();
        radio.volumeUp();
        System.out.println("main ended");
    }
}
