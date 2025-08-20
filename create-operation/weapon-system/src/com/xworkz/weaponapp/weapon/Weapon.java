package com.xworkz.weaponapp.weapon;

public class Weapon {
   private String name;
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    double weight;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    String material;
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    int rangeInMeters;

    public int getRangeInMeters() {
        return rangeInMeters;
    }

    public void setRangeInMeters(int rangeInMeters) {
        this.rangeInMeters = rangeInMeters;
    }


    boolean isLethal;

    public boolean getisLethal() {
        return isLethal;
    }

    public void setLethal(boolean lethal) {
        isLethal = lethal;
    }
}
