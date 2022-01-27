package ru.netology.meneger;

import ru.netology.domain.Movie;

public class MovieMeneger {
    private Movie[] movies = new Movie[0];
    private int additionMovie;

    public MovieMeneger(int additionMovie) {
        this.additionMovie = 10;
    }

    public MovieMeneger() {
    }
    public void getMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] mov = new Movie[length];
        System.arraycopy(movies,0,mov,0,movies.length);
        int newMovie = mov.length - 1;
        mov[newMovie] = movie;
        this.movies= mov;
    }
    public Movie[] lastAddMovie (int additionMovie){
        if (movies.length > additionMovie){
           Movie[] result = new Movie[additionMovie];
           for (int i=0; i < result.length; i++){
               int index = movies.length-i-1;
               result[i]= this.movies[index];
           }
           return result;
        } else {
            Movie[] result = new Movie[movies.length];
            for (int i=0; i< result.length; i++){
                int index = result.length - i-1;
                result[i]=this.movies[index];
            }
            return result;
        }
    }
}


