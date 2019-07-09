import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Round implements RoundStructure {
    public int roundNumber;
    public String roundName;
    int playersCounted;

    public void generateRound(int roundNumber, ArrayList<Player> roundSize) {
        this.roundNumber = roundNumber;
        this.playersCounted = roundSize.size();
        if (playersCounted > 32) {
            roundName = this.getKnockoutRound();
            System.out.println(roundName);
        } else if (playersCounted == 32) {
            roundName = this.getLast32();
        } else if (playersCounted == 16) {
            roundName = this.getLast16();
        } else if(playersCounted == 8) {
            roundName = this.getQuarterFinalRound();
        }else if(playersCounted == 4) {
            roundName = this.getSemiFinalRound();
        } else if(playersCounted == 2) {
            roundName = this.getFinalRound();
        }
    }

    public String getKnockoutRound() {
        return State.KNOCKOUT.getRoundStatus();
    }

    public String getLast32() {
        return State.LAST32.getRoundStatus();
    }

    public String getLast16() {
        return State.LAST16.getRoundStatus();
    }

    public String getQuarterFinalRound() {
        return State.QUARTERFINAL.getRoundStatus();
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

}
