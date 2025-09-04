package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Movie movie = new Movie();
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();
        Movie movie4 = new Movie();
        Movie movie5 = new Movie();
        Movie movie6 = new Movie();
        Movie movie7 = new Movie();
        Movie movie8 = new Movie();
        Movie movie9 = new Movie();

        movie.setMovieId("M1001");
        movie.setTitle("The Silent River");
        movie.setGenre("Drama");
        movie.setLanguage("Hindi");
        movie.setDirector("Anurag Kashyap");
        movie.setProducer("Karan Mehta");
        movie.setReleaseDate("2020-05-14");
        movie.setRating("8.2");

        movie1.setMovieId("M1002");
        movie1.setTitle("Shadows of Tomorrow");
        movie1.setGenre("Sci-Fi");
        movie1.setLanguage("English");
        movie1.setDirector("Christopher Nolan");
        movie1.setProducer("Emma Thomas");
        movie1.setReleaseDate("2019-07-20");
        movie1.setRating("9.0");

        movie2.setMovieId("M1003");
        movie2.setTitle("The Last Melody");
        movie2.setGenre("Romance");
        movie2.setLanguage("Telugu");
        movie2.setDirector("S. S. Rajamouli");
        movie2.setProducer("Prasad Rao");
        movie2.setReleaseDate("2021-02-11");
        movie2.setRating("7.9");

        movie3.setMovieId("M1004");
        movie3.setTitle("Beyond the Horizon");
        movie3.setGenre("Adventure");
        movie3.setLanguage("English");
        movie3.setDirector("Peter Jackson");
        movie3.setProducer("Fran Walsh");
        movie3.setReleaseDate("2018-12-18");
        movie3.setRating("8.7");

        movie4.setMovieId("M1005");
        movie4.setTitle("City of Dreams");
        movie4.setGenre("Thriller");
        movie4.setLanguage("Kannada");
        movie4.setDirector("Pawan Kumar");
        movie4.setProducer("Ramesh Gowda");
        movie4.setReleaseDate("2022-09-10");
        movie4.setRating("7.5");

        movie5.setMovieId("M1006");
        movie5.setTitle("Whispers of the Sea");
        movie5.setGenre("Fantasy");
        movie5.setLanguage("Malayalam");
        movie5.setDirector("Priyadarshan");
        movie5.setProducer("Mohan Lal");
        movie5.setReleaseDate("2023-03-05");
        movie5.setRating("8.3");

        movie6.setMovieId("M1007");
        movie6.setTitle("Broken Chains");
        movie6.setGenre("Action");
        movie6.setLanguage("Tamil");
        movie6.setDirector("Shankar");
        movie6.setProducer("Subhash Reddy");
        movie6.setReleaseDate("2017-08-25");
        movie6.setRating("8.1");

        movie7.setMovieId("M1008");
        movie7.setTitle("The Golden Leaf");
        movie7.setGenre("Historical");
        movie7.setLanguage("Hindi");
        movie7.setDirector("Ashutosh Gowariker");
        movie7.setProducer("Ronnie Screwvala");
        movie7.setReleaseDate("2016-01-15");
        movie7.setRating("7.8");

        movie8.setMovieId("M1009");
        movie8.setTitle("Dreamcatcher");
        movie8.setGenre("Mystery");
        movie8.setLanguage("English");
        movie8.setDirector("David Fincher");
        movie8.setProducer("Ceán Chaffin");
        movie8.setReleaseDate("2021-06-29");
        movie8.setRating("8.5");

        movie9.setMovieId("M1010");
        movie9.setTitle("Winds of Destiny");
        movie9.setGenre("Action-Drama");
        movie9.setLanguage("Telugu");
        movie9.setDirector("Trivikram Srinivas");
        movie9.setProducer("Allu Aravind");
        movie9.setReleaseDate("2022-11-19");
        movie9.setRating("8.0");


        Theatre theatre = new Theatre();
        theatre.addMovie(movie);
        theatre.addMovie(movie1);
        theatre.addMovie(movie2);
        theatre.addMovie(movie3);
        theatre.addMovie(movie4);
        theatre.addMovie(movie5);
        theatre.addMovie(movie6);
        theatre.addMovie(movie7);
        theatre.addMovie(movie8);
        theatre.addMovie(movie9);

        theatre.getStationDetails();
        /*
        Movie movie = new Movie();
        movie.setMovieId("2CR7");
        movie.setTitle("Vikram");
        movie.setGenre("Action");
        movie.setLanguage("Tamil");
        movie.setDirector("Loki");
        movie.setProducer("kamal haasan");
        movie.setReleaseDate("2022");
        movie.setRating("9.5");

        Theatre theater = new Theatre();
        theater.createMovieInfo(movie);
        theater.fetchMovieInfo();


 */
        System.out.println("main ended");
    }
}
