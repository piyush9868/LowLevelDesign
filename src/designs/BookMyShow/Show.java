package designs.BookMyShow;

import java.util.Date;

public class Show {
    int id;
    Date dateAndTimeOfShow;
    MovieTheatre movieTheatre;
    Movie movie;

    public Show(int id, Date dateAndTimeOfShow, MovieTheatre movieTheatre, Movie movie) {
        this.id = id;
        this.dateAndTimeOfShow = dateAndTimeOfShow;
        this.movieTheatre = movieTheatre;
        this.movie = movie;
    }
}
