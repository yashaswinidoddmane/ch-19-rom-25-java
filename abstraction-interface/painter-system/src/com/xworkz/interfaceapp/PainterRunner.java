package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.PainterImpl;
import com.xworkz.interfaceapp.painter.Painter;

public class PainterRunner {
public static void main(String[] args){
    System.out.println("main started");
    Painter painter = new PainterImpl();
    painter.frame();
    painter.paint();
    painter.sketch();
    System.out.println("main ended");
}
}
