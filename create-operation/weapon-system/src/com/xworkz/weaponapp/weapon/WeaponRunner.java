package com.xworkz.weaponapp.weapon;

public class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Weapon weapon = new Weapon();
        weapon.setName("AK-47");
        weapon.setType("Rifle");
        weapon.setWeight(4.3);
        weapon.setMaterial("Steel");
        weapon.setRangeInMeters(300);
        weapon.setLethal(true);


        String name = weapon.getName();
        String type = weapon.getType();
        double weight = weapon.getWeight();
        String material = weapon.getMaterial();
        int rangeInMeters = weapon.getRangeInMeters();
        boolean isLethal = weapon.getisLethal();

        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight : " + weight);
        System.out.println("Material: " + material);
        System.out.println("Range : " + rangeInMeters);
        System.out.println("Is Lethal: " + isLethal);

        System.out.println("Main ended");
    }
}
