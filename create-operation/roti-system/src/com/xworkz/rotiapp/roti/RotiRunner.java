package com.xworkz.rotiapp.roti;

public class RotiRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Roti roti = new Roti();
        roti.setRotiId(1);
        roti.setType("Tandoori");
        roti.setDiameterCm(15.5);
        roti.setCalories(120);
        roti.setisWholeWheat(true);
        roti.setPricePerPiece(12.50);

        int rotiId = roti.getRotiId();
        String type = roti.getType();
        double diameterCm = roti.getDiameterCm();
        int calories = roti.getCalories();
        boolean isWholeWheat = roti.getisWholeWheat();
        double pricePerPiece = roti.getPricePerPiece();

        System.out.println("Roti ID: " + rotiId);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameterCm);
        System.out.println("Calories: " + calories);
        System.out.println("Is Whole Wheat: " + isWholeWheat);
        System.out.println("Price per Piece: " + pricePerPiece);

        System.out.println("Main ended");
    }
}
