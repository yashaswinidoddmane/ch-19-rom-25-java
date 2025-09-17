package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.painter.Painter;

public class PainterImpl implements Painter {
    @Override
    public void sketch() {
        System.out.println("Painter is sketching");
    }
    @Override
    public void paint() {
        System.out.println("Painter is painting");
    }
    @Override
    public void frame() {
        System.out.println("Painter is framing the artwork");
    }
}
