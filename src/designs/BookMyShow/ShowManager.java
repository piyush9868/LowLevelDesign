package designs.BookMyShow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShowManager {
    Map<Integer, Show> allShows;

    ShowManager(){
        allShows = new HashMap<>();
    }

    public void showAllShows(){
        System.out.println(allShows);
    }

    public void addShow(Show show){
        allShows.put(show.id, show);
    }

    public void deleteShow(Integer showId){
        allShows.remove(showId);
    }

    public void bookShow(int showId){

    }
}
