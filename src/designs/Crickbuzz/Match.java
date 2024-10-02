package designs.Crickbuzz;

import java.util.*;

public class Match {
    Team[] contestingTeams;
    Team battingTeam;
    Team bowlingTeam;
    MatchType matchType;

    Match(Team team1, Team team2){
        contestingTeams = new Team[2];
        contestingTeams[0] = team1;
        contestingTeams[1] =  team2;
        battingTeam = team1;
        bowlingTeam = team2;
    }


    void postMessage(String message){

    }

    void inningsBreak(){
        Team temp = battingTeam;
        battingTeam = bowlingTeam;
        bowlingTeam = temp;
    }

    void updateBattingScore(Player p, int runs){

    }
}
