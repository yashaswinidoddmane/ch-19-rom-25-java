package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.song.SpotifySong;

public class SpotifyRunner {
    public static void main(String args[]) {
        SpotifyUser spotifyUser = new SpotifyUser();
      spotifyUser.setFirstName("Yash");
      spotifyUser.setLastName("Doddmani");
      spotifyUser.setFullName("Yash Doddmani");
      spotifyUser.setPhoneNumber("8123819984");
      spotifyUser.setGender("female");
      spotifyUser.setUserRating("****");

      SpotifySong spotifySong = new SpotifySong();
    spotifySong.createSpotifyUser(spotifyUser);
    spotifySong.getUserDetails();
    }
}
