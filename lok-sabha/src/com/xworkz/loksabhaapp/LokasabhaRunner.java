package com.xworkz.loksabhaapp;

import com.xworkz.loksabhaapp.loksabha.Lokasabha;
import com.xworkz.loksabhaapp.politician.Politician;

public class LokasabhaRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Politician politician = new Politician();
        Politician politician1 = new Politician();
        Politician politician2 = new Politician();
        Politician politician3 = new Politician();
        Politician politician4 = new Politician();
        Politician politician5 = new Politician();
        Politician politician6 = new Politician();
        Politician politician7 = new Politician();
        Politician politician8 = new Politician();
        Politician politician9 = new Politician();
        Politician politician10 = new Politician();
        Politician politician11 = new Politician();


        politician.setPoliticianId("P1012");
        politician.setName("Shalini Gupta");
        politician.setAge("41");
        politician.setGender("Female");
        politician.setPartyName("Democratic Unity Forum");
        politician.setPartyPosition("Women’s Wing Leader");
        politician.setState("Punjab");
        politician.setCountry("India");

        politician1.setPoliticianId("P1001");
        politician1.setName("Rahul Sharma");
        politician1.setAge("52");
        politician1.setGender("Male");
        politician1.setPartyName("National Unity Party");
        politician1.setPartyPosition("General Secretary");
        politician1.setState("Karnataka");
        politician1.setCountry("India");

        politician2.setPoliticianId("P1002");
        politician2.setName("Anita Verma");
        politician2.setAge("48");
        politician2.setGender("Female");
        politician2.setPartyName("People’s Progressive Party");
        politician2.setPartyPosition("Vice President");
        politician2.setState("Maharashtra");
        politician2.setCountry("India");

        politician3.setPoliticianId("P1003");
        politician3.setName("Suresh Kumar");
        politician3.setAge("60");
        politician3.setGender("Male");
        politician3.setPartyName("Democratic Front");
        politician3.setPartyPosition("President");
        politician3.setState("Tamil Nadu");
        politician3.setCountry("India");

        politician4.setPoliticianId("P1004");
        politician4.setName("Priya Nair");
        politician4.setAge("45");
        politician4.setGender("Female");
        politician4.setPartyName("National Reform Alliance");
        politician4.setPartyPosition("Treasurer");
        politician4.setState("Kerala");
        politician4.setCountry("India");

        politician5.setPoliticianId("P1005");
        politician5.setName("Amit Deshmukh");
        politician5.setAge("50");
        politician5.setGender("Male");
        politician5.setPartyName("Unity Party of India");
        politician5.setPartyPosition("Chief Spokesperson");
        politician5.setState("Madhya Pradesh");
        politician5.setCountry("India");

        politician6.setPoliticianId("P1006");
        politician6.setName("Meera Joshi");
        politician6.setAge("42");
        politician6.setGender("Female");
        politician6.setPartyName("Social Welfare Congress");
        politician6.setPartyPosition("Joint Secretary");
        politician6.setState("Uttar Pradesh");
        politician6.setCountry("India");

        politician7.setPoliticianId("P1007");
        politician7.setName("Rajesh Patel");
        politician7.setAge("55");
        politician7.setGender("Male");
        politician7.setPartyName("Indian Democratic League");
        politician7.setPartyPosition("Organizing Secretary");
        politician7.setState("Gujarat");
        politician7.setCountry("India");


        politician8.setPoliticianId("P1008");
        politician8.setName("Sunita Reddy");
        politician8.setAge("47");
        politician8.setGender("Female");
        politician8.setPartyName("Progressive People’s Party");
        politician8.setPartyPosition("Deputy Leader");
        politician8.setState("Telangana");
        politician8.setCountry("India");

        politician9.setPoliticianId("P1009");
        politician9.setName("Arun Mehta");
        politician9.setAge("58");
        politician9.setGender("Male");
        politician9.setPartyName("Secular Unity Party");
        politician9.setPartyPosition("Working President");
        politician9.setState("Rajasthan");
        politician9.setCountry("India");

        politician10.setPoliticianId("P1010");
        politician10.setName("Kavita Singh");
        politician10.setAge("44");
        politician10.setGender("Female");
        politician10.setPartyName("People’s Democratic Alliance");
        politician10.setPartyPosition("National Secretary");
        politician10.setState("Bihar");
        politician10.setCountry("India");

        politician11.setPoliticianId("P1011");
        politician11.setName("Vikram Rao");
        politician11.setAge("53");
        politician11.setGender("Male");
        politician11.setPartyName("National People’s Congress");
        politician11.setPartyPosition("State President");
        politician11.setState("Andhra Pradesh");
        politician11.setCountry("India");

        Lokasabha lokasabha = new Lokasabha();
        lokasabha.addPolitician(politician);
        lokasabha.addPolitician(politician1);
        lokasabha.addPolitician(politician2);
        lokasabha.addPolitician(politician3);
        lokasabha.addPolitician(politician4);
        lokasabha.addPolitician(politician5);
        lokasabha.addPolitician(politician6);
        lokasabha.addPolitician(politician7);
        lokasabha.addPolitician(politician8);
        lokasabha.addPolitician(politician9);
        lokasabha.addPolitician(politician10);
        lokasabha.addPolitician(politician11);

        lokasabha.getPoliticianDetails();
        /*
        Politician politician = new Politician();
        politician.setPoliticianId("17");
        politician.setName("Siddu");
        politician.setAge("54");
        politician.setGender("Male");
        politician.setPartyName("Congress");
        politician.setPartyPosition("CM");
        politician.setState("Karnataka");
        politician.setCountry("India");

        Lokasabha lokasabha = new Lokasabha();
        lokasabha.createUserInfo(politician);
        lokasabha.fetchPoliticianDetails();


         */

        System.out.println("main ended");
    }
}
