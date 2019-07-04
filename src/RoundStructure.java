import java.util.ArrayList;

public interface RoundStructure {

    void generateRound(int roundNumber, ArrayList<Player> roundSize);

//    void assignOpponents();

    int getRoundNumber();

    String getRoundName();


}
