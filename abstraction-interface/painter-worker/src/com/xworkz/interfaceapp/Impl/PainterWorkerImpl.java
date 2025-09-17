package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.painterworker.PainterWorker;

public class PainterWorkerImpl implements PainterWorker {
    @Override
    public void prepareWall() {
        System.out.println("Painter preparing the wall");
    }
    @Override
    public void paintWall() {
        System.out.println("Painter painting the wall");
    }
    @Override
    public void cleanBrushes() {
        System.out.println("Painter cleaning brushes");
    }
}
