import java.util.ArrayList;

public interface RoundStructure { //Interface for any class wanting to implement a specific new round structure

    void generateRound(int roundNumber, ArrayList<Player> roundSize); //Must have a method for generating round names

    int getRoundNumber(); //Must have a getter method to get the round name

    String getRoundName(); //Must have a getter method to get the round name
}
