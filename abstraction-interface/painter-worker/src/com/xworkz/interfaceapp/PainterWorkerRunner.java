package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PainterWorkerImpl;
import com.xworkz.interfaceapp.painterworker.PainterWorker;

public class PainterWorkerRunner {
    public static void main(String[] args){
        System.out.println("main started");
        PainterWorker painterWorker = new PainterWorkerImpl();
        painterWorker.cleanBrushes();
        painterWorker.paintWall();
        painterWorker.prepareWall();
        System.out.println("main ended");
    }
    }

