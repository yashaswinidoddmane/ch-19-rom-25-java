package com.xworkz.festivalapp.festival;

public class Festival {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String religion;

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    private String month;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    private int durationInDays;

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    private boolean isPublicHoliday;

    public boolean getisPublicHoliday() {
        return isPublicHoliday;
    }

    public void setisPublicHoliday(boolean isPublicHoliday) {
        this.isPublicHoliday = isPublicHoliday;
    }

    private boolean isCulturallySignificant;
    public boolean getisCulturallySignificant(){
        return isCulturallySignificant;
    }

    public void setCulturallySignificant(boolean culturallySignificant) {
        this.isCulturallySignificant = culturallySignificant;
    }
}
