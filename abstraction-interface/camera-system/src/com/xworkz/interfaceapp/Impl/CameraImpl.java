package com.xworkz.interfaceapp.Impl;

import com.xworkz.interfaceapp.camera.Camera;

public class CameraImpl implements Camera {
    @Override
    public void capture() {
        System.out.println("Photo captured");
    }
    @Override
    public void zoomIn() {
        System.out.println("Camera zoomed in");
    }
    @Override
    public void recordVideo() {
        System.out.println("Video recording started");
    }
}
