package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.SingerImpl;
import com.xworkz.interfaceapp.singer.Singer;

public class SingerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Singer singer = new SingerImpl();
        singer.performSong();
        singer.recordSong();
        singer.rehearseSong();
        System.out.println("main ended");
    }
}
