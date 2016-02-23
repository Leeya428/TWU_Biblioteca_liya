package com.twu.biblioteca;


public class Movie extends LibraryData {

    private String movieYear;
    private String movieRating;

    public Movie(String movieName,String movieYear,String movieRating){

        super(movieName);
        this.movieYear = movieYear;
        this.movieRating = movieRating;

    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
}
