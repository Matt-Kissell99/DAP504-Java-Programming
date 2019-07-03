import java.util.ArrayList;

public class Match {
    ArrayList<Match> roundMatches = new ArrayList<Match>();
    private Player Player1;
    private Player Player2;
    public int player1MatchScore;
    public int player2MatchScore;
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

    public void playMatches() {
        this.roundMatches.forEach(Match -> {
            Games playGames = new Games();
            playGames.playGames(Match);
        });
    }
}


