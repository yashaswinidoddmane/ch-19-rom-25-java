package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.blender.Blender;

public class BlenderImpl implements Blender {
    @Override
    public void blend() {
        System.out.println("Blending ingredients");
    }
    @Override
    public void chop() {
        System.out.println("Chopping ingredients");
    }
    @Override
    public void mix() {
        System.out.println("Mixing ingredients");
    }

}
