import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Round {
    public int roundNumber;
    public String roundName;

    public void generateRound(int roundNumber) {
        this.roundNumber = roundNumber;
        if(roundNumber == 1) {
            String returnedRound = this.getOf16Round();
            this.roundName = returnedRound;
        } else if (roundNumber == 2) {
            String returnedRound = this.getKnockoutRound();
            this.roundName = returnedRound;
        } else if(roundNumber == 3) {
            String returnedRound = this.getSemiFinalRound();
            this.roundName = returnedRound;
        } else {
            String returnedRound = this.getFinalRound();
            this.roundName = returnedRound;
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

    public void assignOpponents() {
        Tournament firstRoundMatches = new Tournament();

        ArrayList firstPlayers = firstRoundMatches.getTournamentPlayers();
        Collections.shuffle( firstPlayers );
        firstPlayers.forEach((Player) ->
        System.out.println(player.firstName + " " + player.lastName + " - Age: " + player.age + ", Skill Level: " + player.skillLevel);
        });
    }

}
