//import java.util.Set;
//
//public class Match {
//    private final Set<Player> team1;
//    private final Set<Player> team2;
//    private MatchResult result;
//
//    public Match(Set<Player> team1, Set<Player> team2) {
//        this.team1 = team1;
//        this.team2 = team2;
//    }
//
//    public Set<Player> getTeam1() {
//        return team1;
//    }
//
//    public Set<Player> getTeam2() {
//        return team2;
//    }
//
//    /**
//     * <p>
//     * The result of a match. WON means team1 won. LOST means team1 lost.
//     * </p>
//     */
//    public MatchResult getResult() {
//        return result;
//    }
//
//    public void setResult(MatchResult result) {
//        this.result = result;
//    }
//}

import javafx.beans.binding.ObjectExpression;

import java.util.ArrayList;

public class Match {
    ArrayList<Match> roundMatches = new ArrayList<Match>();
    private Player Player1;
    private Player Player2;
    public int player1Score;
    public int player2Score;
    private String matchResult;


    public Player getPlayer1() {
        return Player1;
    }

    public Player getPlayer2() {
        return Player2;
    }

    public void setPlayer1(Player player1) {
        Player1 = player1;
    }

    public void setPlayer2(Player player2) {
        Player2 = player2;
    }

    public void assignOpponents(ArrayList<Player> roundPlayers) {
        int count;
        for(count = 0; count < roundPlayers.size() - 2; count+= 2) {
            Match roundMatch = new Match();
            Player firstPlayer = roundPlayers.get(count + 1);
            roundMatch.setPlayer1(firstPlayer);

            Player secondPlayer = roundPlayers.get(count + 2);
            roundMatch.setPlayer2(secondPlayer);
            roundMatches.add(roundMatch);
        }

        this.roundMatches.forEach(Match -> {
            System.out.println(Match.getPlayer1().getFirstName() + " " + Match.getPlayer1().getLastName() + " " + "VS " + Match.getPlayer2().firstName + " " + Match.getPlayer2().getLastName());
        });
    }
}


