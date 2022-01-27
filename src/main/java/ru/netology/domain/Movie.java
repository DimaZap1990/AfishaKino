package ru.netology.domain;

public class Movie {
    private int id;
    private String movieTitle;
    private String genre;

    public Movie(int id, String movieTitle, String genre) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
