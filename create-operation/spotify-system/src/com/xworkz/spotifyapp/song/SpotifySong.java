package com.xworkz.spotifyapp.song;

import com.xworkz.spotifyapp.SpotifyUser;

import java.security.spec.RSAOtherPrimeInfo;

public class SpotifySong {
    SpotifyUser spotifyUser;
    public boolean createSpotifyUser(SpotifyUser spotifyUser) {
        boolean SpotifyUserCreated = false;

        boolean firstNameValid = false;
        boolean lastNameValid = false;
        boolean fullNameValid = false;
        boolean phoneNumberValid = false;
        boolean  genderValid = false;
        boolean userRatingValid = false;

        if(spotifyUser.getFirstName() != null){
            firstNameValid = true;
        }else{
            System.out.println("first name is not valid");
        }
        if(spotifyUser.getLastName() != null){
            lastNameValid = true;
        }else{
            System.out.println("last name is not valid");
        }
        if(spotifyUser.getFullName()!= null){
            fullNameValid = true;
        }else{
            System.out.println("full name is not valid");
        }
        if(spotifyUser.getPhoneNumber() != null){
         phoneNumberValid = true;
        }else{
            System.out.println("phone number is not valid");
        }
        if(spotifyUser.getGender()!= null){
            genderValid = true;
        }else{
            System.out.println("gender is not valid");
        }
        if(spotifyUser.getUserRating() != null){
            userRatingValid = true;
        }else{
            System.out.println("user rating is not valid");
        }
        if(firstNameValid && lastNameValid && fullNameValid && phoneNumberValid && genderValid && userRatingValid){
            SpotifyUserCreated = true;
        this.spotifyUser = spotifyUser;
        }
        return SpotifyUserCreated;
    }
    public void getUserDetails(){
        System.out.println("first name is: "+ spotifyUser.getFirstName());
        System.out.println("last name is: "+ spotifyUser.getLastName());
        System.out.println("full name is: "+ spotifyUser.getFullName());
        System.out.println("phone number is: "+ spotifyUser.getPhoneNumber());
        System.out.println("gender is: "+ spotifyUser.getGender());
        System.out.println("user rating is: "+ spotifyUser.getUserRating());
    }
}
