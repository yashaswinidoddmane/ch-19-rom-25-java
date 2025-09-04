package com.xworkz.policeapp;

import com.xworkz.policeapp.police.Police;
import com.xworkz.policeapp.station.Station;

public class PoliceStationRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Station station = new Station();
        Station station1 = new Station();
        Station station2 = new Station();
        Station station3 = new Station();
        Station station4 = new Station();
        Station station5 = new Station();

        station.setOfficerId("O1000");
        station.setOfficerName("Arjun Reddy");
        station.setGender("Male");
        station.setBadgeNumber("BN7890");
        station.setStationName("Bangalore Central Station");
        station.setDepartment("Crime Branch");
        station.setPhoneNumber("9876543210");
        station.setEmail("arjun.reddy@police.in");

        station1.setOfficerId("O1001");
        station1.setOfficerName("Priya Sharma");
        station1.setGender("Female");
        station1.setBadgeNumber("BN7891");
        station1.setStationName("Mumbai South Station");
        station1.setDepartment("Cyber Crime");
        station1.setPhoneNumber("9876501234");
        station1.setEmail("priya.sharma@police.in");

        station2.setOfficerId("O1002");
        station2.setOfficerName("Rohit Mehra");
        station2.setGender("Male");
        station2.setBadgeNumber("BN7892");
        station2.setStationName("Delhi Cantonment Station");
        station2.setDepartment("Traffic Control");
        station2.setPhoneNumber("9876512345");
        station2.setEmail("rohit.mehra@police.in");

        station3.setOfficerId("O1003");
        station3.setOfficerName("Kavita Iyer");
        station3.setGender("Female");
        station3.setBadgeNumber("BN7893");
        station3.setStationName("Chennai North Station");
        station3.setDepartment("Women Safety Wing");
        station3.setPhoneNumber("9876523456");
        station3.setEmail("kavita.iyer@police.in");

        station4.setOfficerId("O1004");
        station4.setOfficerName("Sameer Khan");
        station4.setGender("Male");
        station4.setBadgeNumber("BN7894");
        station4.setStationName("Hyderabad City Station");
        station4.setDepartment("Special Task Force");
        station4.setPhoneNumber("9876534567");
        station4.setEmail("sameer.khan@police.in");


        station5.setOfficerId("O1005");
        station5.setOfficerName("Nisha Patel");
        station5.setGender("Female");
        station5.setBadgeNumber("BN7895");
        station5.setStationName("Ahmedabad West Station");
        station5.setDepartment("Narcotics Control");
        station5.setPhoneNumber("9876545678");
        station5.setEmail("nisha.patel@police.in");

        Police police = new Police();
        police.addStation(station);
        police.addStation(station1);
        police.addStation(station2);
        police.addStation(station3);
        police.addStation(station4);
        police.addStation(station5);

        police.getStationDetails();
/*
        Station police = new Station();
        police.setOfficerId("1277");
        police.setOfficerName("Vikram");
        police.setGender("Male");
        police.setBadgeNumber("ACP7743");
        police.setStationName("City Police Control Room");
        police.setDepartment("Criminal");
        police.setPhoneNumber("97317672929");
        police.setEmail("vikky@gmail.com");

        Police policeDetails = new Police();
        policeDetails.createPoliceInfo(police);
        policeDetails.getPoliceDetails();


 */
        System.out.println("main ended");
    }
}

