package com.xworkz.rotiapp.roti;

public class Roti {
   private int rotiId;

    public int getRotiId() {
        return rotiId;
    }

    public void setRotiId(int rotiId) {
        this.rotiId = rotiId;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private double diameterCm;

    public void setDiameterCm(double diameterCm) {
        this.diameterCm = diameterCm;
    }

    public double getDiameterCm() {
        return diameterCm;
    }

    private int calories;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

   private boolean isWholeWheat;

    public boolean getisWholeWheat() {
        return isWholeWheat;
    }
    public void setisWholeWheat(boolean wholeWheat) {
        isWholeWheat = wholeWheat;
    }

    double pricePerPiece;

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    public void setPricePerPiece(double pricePerPiece) {
        this.pricePerPiece = pricePerPiece;
    }
}
