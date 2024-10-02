package designs.BookMyShow;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieTheatreManager {
    Map<Integer, MovieTheatre> theatreList;

    public MovieTheatreManager() {
        this.theatreList = new HashMap<>();
    }

    void addMovieTheatre(MovieTheatre theatre){
        theatreList.put(theatre.id, theatre);
    }

    void remove(int theId){
        theatreList.remove(theId);
    }
}
