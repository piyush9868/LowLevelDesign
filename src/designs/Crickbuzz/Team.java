package designs.Crickbuzz;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Team {
    int score;
    int wickets;
    int currentRunRate;
    int overs;
    TeamAlias alias;
    Queue<Player> playersBattingQueue;
    TossEvent currentEvent;

    Team(){
        playersBattingQueue = new ArrayDeque<>();
    }

    void setPlayersBattingQueue(List<Player> allPlayersInOrder){
        for(Player p : allPlayersInOrder){
            playersBattingQueue.offer(p);
        }
    }

    public void setCurrentEvent(TossEvent currentEvent) {
        this.currentEvent = currentEvent;
    }

    Player[] startBatting(){
        Player p1 = playersBattingQueue.poll();
        Player p2 = playersBattingQueue.poll();
        return new Player[]{p1,p2};
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        Team target = (Team)o;
        return target.alias == this.alias;
    }
}
