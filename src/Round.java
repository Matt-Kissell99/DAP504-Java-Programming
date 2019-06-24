import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Round implements RoundStructure {
    public int roundNumber;
    public String roundName;
    int playersCounted;

    public void generateRound(int roundNumber, Tournament currentTournament) {
        this.roundNumber = roundNumber;
        this.playersCounted = currentTournament.getRoundSize();
        System.out.println(playersCounted);
        if (playersCounted > 32) {
            roundName = this.getKnockoutRound();
            System.out.println(roundName);
        } else if (playersCounted >= 16 && playersCounted <= 32) {
            roundName = this.getOf16Round();
        } else if(playersCounted == 4) {
            roundName = this.getSemiFinalRound();
        } else if(playersCounted == 2) {
            roundName = this.getFinalRound();
        }
    }

    public String getOf16Round() {
        return State.ROUNDOF16.getRoundStatus();
    }

    public String getKnockoutRound() {
        return State.KNOCKOUT.getRoundStatus();
    }

    public String getSemiFinalRound() {
        return State.SEMIFINAL.getRoundStatus();
    }

    public String getFinalRound() {
        return State.FINAL.getRoundStatus();
    }

    public String getRoundName() {
        return roundName;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

//    public void assignOpponents() {
//        Tournament firstRoundMatches = new Tournament();
//
//        ArrayList firstPlayers = firstRoundMatches.getTournamentPlayers();
//        Collections.shuffle( firstPlayers );
//        firstPlayers.forEach((Player) ->
//        System.out.println(Player.firstName + " " + player.lastName + " - Age: " + player.age + ", Skill Level: " + player.skillLevel);
//        });
//    }

}
