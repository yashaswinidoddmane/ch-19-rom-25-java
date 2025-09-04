package com.xworkz.loksabhaapp.loksabha;

import com.xworkz.loksabhaapp.politician.Politician;
//import com.xworkz.loksabhaapp.validation.PoliticianValidation;

public class Lokasabha {

    Politician[] politicians = new Politician[12];
    int index;

    public boolean addPolitician(Politician politician) {
        boolean isPoliticianAdded = false;
        if (politician != null) {
            politicians[index++] = politician;
            isPoliticianAdded = true;
        } else {
            System.out.println("Invalid politician details");
        }
        return isPoliticianAdded;
    }

    public void getPoliticianDetails() {
        System.out.println("list of Politicians are");
        for (Politician politician : politicians) {
            System.out.println("Politician Id  name is: " + politician.getPoliticianId());
            System.out.println("Politician Name is:" + politician.getName());
            System.out.println("Politician Age is:" + politician.getAge());
            System.out.println("Politician Gender is:" + politician.getGender());
            System.out.println("Politician Party name is:" + politician.getPartyName());
            System.out.println("Politician party position is:" + politician.getPartyPosition());
            System.out.println("Politicians state is:" + politician.getState());
            System.out.println("politician's country is:" + politician.getCountry());
            System.out.println("---------------------------------------------------");
        }
    }
}
    /*
    Politician politician;

    public  boolean createUserInfo(Politician politician){
        boolean isPoliticianCreated = false;
        boolean validatePolitician;

        PoliticianValidation politicianValid = new PoliticianValidation();
        validatePolitician = politicianValid.politicianValidate(politician);
        if(validatePolitician){
            isPoliticianCreated = true;
            this.politician = politician;
        }

        return  isPoliticianCreated;
    }

    public void fetchPoliticianDetails() {
        System.out.println("Politician id : "+politician.getPoliticianId());
        System.out.println("Name : "+politician.getName());
        System.out.println("Age : "+politician.getAge());
        System.out.println("gender : "+politician.getGender());
        System.out.println("party name : "+politician.getPartyName());
        System.out.println("party position : "+politician.getPartyPosition());
        System.out.println("state : "+politician.getState());
        System.out.println("country : "+politician.getCountry());
    }

     */
