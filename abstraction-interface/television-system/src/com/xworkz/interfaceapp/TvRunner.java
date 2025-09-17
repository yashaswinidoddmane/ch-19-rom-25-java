package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.TelevisionImpl;
import com.xworkz.interfaceapp.television.Television;

public class TvRunner {
    public static  void main(String[] args){
        System.out.println("main started");
        Television television = new TelevisionImpl();
        television.play();
        television.mute();
        television.changeChannel();
        System.out.println("main ended");
    }
}
