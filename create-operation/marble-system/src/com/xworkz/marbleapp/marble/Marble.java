package com.xworkz.marbleapp.marble;

public class Marble {
    private int marbleId;

    public int getMarbleId() {
        return marbleId;
    }

    public void setMarbleId(int marbleId) {
        this.marbleId = marbleId;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private boolean isPolished;

    public boolean getisPolished() {
        return isPolished;
    }
    public void setisPolished(boolean isPolished){
        this.isPolished = isPolished;
    }



    private boolean isImported;
    public boolean getisImported(){
        return isImported;
    }
    public void setisImported(boolean isImported){
        this.isImported = isImported;
    }

}
