package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.singer.Singer;

import javax.xml.crypto.dsig.SignatureMethod;

public class SingerImpl implements Singer {
    @Override
    public void rehearseSong() {
        System.out.println("Singer is rehearsing a song");
    }
    @Override
    public void performSong() {
        System.out.println("Singer is performing live");
    }
    @Override
    public void recordSong() {
        System.out.println("Singer is recording a song");
    }
}
