package com.xworkz.interfaceapp;

import com.xworkz.interfaceapp.Impl.CameraImpl;
import com.xworkz.interfaceapp.camera.Camera;

public class CameraRunner {
    public static void main(String[] args){
        System.out.println("main started");
        Camera camera = new CameraImpl();
        camera.capture();
        camera.recordVideo();
        camera.zoomIn();
        System.out.println("main ended");
    }
}
