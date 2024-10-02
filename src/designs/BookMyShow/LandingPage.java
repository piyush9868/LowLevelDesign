package designs.BookMyShow;

public class LandingPage {
    ShowManager showManager;

    public void listAllShows(){
        showManager.showAllShows();
    }

    public void bookShow(int showId){
        Show showDetails = showManager.allShows.get(showId);
    }

}
