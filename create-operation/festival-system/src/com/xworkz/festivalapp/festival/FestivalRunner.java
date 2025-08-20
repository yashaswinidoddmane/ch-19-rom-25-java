package com.xworkz.festivalapp.festival;

public class FestivalRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Festival fest = new Festival();
        fest.setName("Diwali");
        fest.setCountry("India");
        fest.setReligion("Hinduism");
        fest.setMonth("November");
        fest.setDurationInDays(5);
        fest.setisPublicHoliday(true);
        fest.setCulturallySignificant(true);

        String name = fest.getName();
        String country = fest.getCountry();
        String religion = fest.getReligion();
        String month = fest.getMonth();
        int durationInDays = fest.getDurationInDays();
        boolean isPublicHoliday = fest.getisPublicHoliday();
        boolean isCulturallySignificant = fest.getisCulturallySignificant();

        System.out.println("Festival Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Religion: " + religion);
        System.out.println("Month: " + month);
        System.out.println("Duration : " +durationInDays);
        System.out.println("Is Public Holiday: " + isPublicHoliday);
        System.out.println("Is Culturally Significant: " + isCulturallySignificant);

        System.out.println("Main ended");
    }
}
