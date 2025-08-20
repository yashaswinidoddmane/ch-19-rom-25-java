package com.xworkz.marbleapp.marble;

public class MarbleRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Marble marble = new Marble();

        marble.setMarbleId(1);
        marble.setColor("White");
        marble.setType("Carrara");
        marble.setDiameter(30.0);
        marble.setMaterial("Calcium Carbonate");
        marble.setPrice( 450.75);
        marble.setisPolished(true);
        marble.setisImported(true);

        int marbleId = marble.getMarbleId();
        String color = marble.getColor();
        String type = marble.getType();
        double diameter = marble.getDiameter();
        String material = marble.getMaterial();
        double price = marble.getPrice();
        boolean isPolished = marble.getisPolished();
        boolean isImported = marble.getisImported();

        System.out.println("Marble ID: " + marbleId);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Diameter : " + diameter);
        System.out.println("Material: " + material);
        System.out.println("Price : " + price);
        System.out.println("Is Polished: " + isPolished);
        System.out.println("Is Imported: " + isImported);

        System.out.println("Main ended");
    }
}
