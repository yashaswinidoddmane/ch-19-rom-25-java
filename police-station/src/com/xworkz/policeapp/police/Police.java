package com.xworkz.policeapp.police;

import com.xworkz.policeapp.station.Station;
import com.xworkz.policeapp.validation.PoliceValidation;

public class Police {
    Station[] stations = new Station[6];
    int index;

    public boolean addStation(Station station) {
        boolean isStationAdded = false;
        if (station != null) {
            stations[index++] = station;
            isStationAdded = true;
        } else {
            System.out.println("Invalid station details");
        }
        return isStationAdded;
    }

    public void getStationDetails() {
        System.out.println("list of Station are");
        for (Station station: stations) {
            System.out.println("Officer Id  is: " + station.getOfficerId());
            System.out.println("Officer Name is:"+ station.getOfficerName());
            System.out.println("gender is:"+ station.getGender());
            System.out.println("badge number is:"+ station.getBadgeNumber());
            System.out.println("station name is: "+ station.getStationName());
            System.out.println("department is:"+ station.getDepartment());
            System.out.println("Phone number is:"+ station.getPhoneNumber());
            System.out.println("email is:"+ station.getEmail());
            System.out.println("-------------------------------------------");
        }
    }
}
    /*
    Station police;
    public  boolean createPoliceInfo(Station police){
        boolean isPoliceInfoCreated = false;

        boolean isPoliceInfoValid;

        PoliceValidation policeInfo = new PoliceValidation();
        isPoliceInfoValid = policeInfo.validatePoliceInfo(police);
        if(isPoliceInfoValid){
            this.police = police;
            isPoliceInfoCreated = true;
        }
        return  isPoliceInfoCreated;
    }

    public void getPoliceDetails() {
        System.out.println("Officer Id : "+police.getOfficerId());
        System.out.println("Officer name : "+police.getOfficerName());
        System.out.println("Gender : "+police.getGender());
        System.out.println("Badge Number : "+police.getBadgeNumber());
        System.out.println("Station name : "+police.getStationName());
        System.out.println("Department : "+police.getDepartment());
        System.out.println("Phone number : "+police.getPhoneNumber());
        System.out.println("Email : "+police.getEmail());
    }

     */
