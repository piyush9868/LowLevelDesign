package designs.BookMyShow;

import java.util.*;

public class MovieManager {
    Map<Integer, Movie> moviesList;

    MovieManager(){
        moviesList = new HashMap<>();
    }

    void addMovie(Movie movie, Date date){
        moviesList.put(movie.id, movie);
    }

    void removeMovie(int movieId){
        moviesList.remove(movieId);
    }
}
