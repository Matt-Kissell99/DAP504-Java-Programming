import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Round implements RoundStructure {
    private int roundNumber;
    private String roundName;
    private int playersCounted;

    public void generateRound(int roundNumber, ArrayList<Player> roundSize) { //Method to generate round name based on arguments
        this.roundNumber = roundNumber; //Set the round number for the round object
        this.playersCounted = roundSize.size(); //Set the players counted for the round object
        if (playersCounted > 32) { //If playersCounted is greater than 32, the round name = knockout
            roundName = this.getKnockoutRound();
            System.out.println(roundName);
        } else if (playersCounted == 32) { //Else if playersCounted is equal to 32, the round name = last 32
            roundName = this.getLast32();
        } else if (playersCounted == 16) { //Else if playersCounted is equal to 16, the round name = last 16
            roundName = this.getLast16();
        } else if(playersCounted == 8) { //Else if playersCounted is equal to 8, the round name = Quarter final
            roundName = this.getQuarterFinalRound();
        }else if(playersCounted == 4) { //Else if playersCounted is equal to 4, the round name = semi final
            roundName = this.getSemiFinalRound();
        } else if(playersCounted == 2) { //Else if playersCounted is equal to 2, the round name = final
            roundName = this.getFinalRound();
        }
    }

    public String getKnockoutRound() { //Getter method for retrieving knockout enum
        return State.KNOCKOUT.getRoundStatus();
    }

    public String getLast32() { //Getter method for retrieving last of 32 enum
        return State.LAST32.getRoundStatus();
    }

    public String getLast16() { //Getter method for retrieving last of 16 enum
        return State.LAST16.getRoundStatus();
    }

    public String getQuarterFinalRound() { //Getter method for retrieving quarter final enum
        return State.QUARTERFINAL.getRoundStatus();
    }

    public String getSemiFinalRound() { //Getter method for retrieving semi final enum
        return State.SEMIFINAL.getRoundStatus();
    }

    public String getFinalRound() { //Getter method for retrieving final enum
        return State.FINAL.getRoundStatus();
    }

    public String getRoundName() { //Getter method for retrieving round name
        return roundName;
    }

    public int getRoundNumber() { //Getter method for retrieving round number
        return roundNumber;
    }

}
