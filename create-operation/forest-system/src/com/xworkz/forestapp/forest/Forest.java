package com.xworkz.forestapp.forest;

public class Forest {
    private String location;
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    private String safariType;
    public String getSafariType(){
        return safariType;
    }
    public void setSafariType(String safariType){
        this.safariType = safariType;
    }

    private int durationInHours;
    public int getdurationInHours(){
        return durationInHours;
    }
    public void setDurationInHours(int durationInHours){
        this.durationInHours = durationInHours;
    }

    private double pricePerPerson;

    public double getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    private boolean isGuided;
    public boolean getisGuided(){
        return isGuided;
    }

    public void setisGuided(boolean guided) {
        this.isGuided = guided;
    }

    private boolean hasAnimalSightings;
    public boolean gethasAnimalSightings(){
        return hasAnimalSightings;
    }
    public void setHasAnimalSightings(boolean hasAnimalSightings){
        this.hasAnimalSightings = hasAnimalSightings;
    }
    private int maxCapacity;

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
