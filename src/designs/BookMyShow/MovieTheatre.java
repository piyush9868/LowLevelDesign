package designs.BookMyShow;

import java.util.HashMap;
import java.util.Map;

public class MovieTheatre {
    int id;
    String location;
    Map<Integer, Screen> allScreens;
    Map<Integer, Show> allShows;

    MovieTheatre(int id, String location){
        this.id = id;
        this.location = location;
        allScreens = new HashMap<>();
        allShows = new HashMap<>();
    }

    public void addNewShow(Show show){
        allShows.put(show.id, show);
    }
}
