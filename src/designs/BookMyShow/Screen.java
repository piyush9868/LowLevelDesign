package designs.BookMyShow;

import java.util.List;

public class Screen {
    int id;
    Seat[][] seats;
    int r, c, capacity;

    public Screen(int id, Seat[][] seats, int r, int c) {
        this.id = id;
        this.seats = seats;
        this.r = r;
        this.c = c;
        this.capacity = r*c;
    }
}
