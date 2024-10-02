package designs.BookMyShow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {
    int id;
    String name, DirectorName, Summary;
    int ratings;
    Map<Integer, Show> allShows;

    public Movie(int id, String name, String directorName, String summary, int ratings) {
        this.id = id;
        this.name = name;
        DirectorName = directorName;
        Summary = summary;
        this.ratings = ratings;
    }
}
