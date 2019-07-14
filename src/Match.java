import java.util.ArrayList;

public class Match extends Games {
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
        for(count = 2; count <= roundPlayers.size(); count+= 2) {
            Match roundMatch = new Match();
            Player firstPlayer = roundPlayers.get(count - 2);
            roundMatch.setPlayer1(firstPlayer);

            Player secondPlayer = roundPlayers.get(count - 1);
            roundMatch.setPlayer2(secondPlayer);
            roundMatches.add(roundMatch);
        }

        this.roundMatches.forEach(Match -> {
            System.out.println(Match.getPlayer1().getFirstName() + " " + Match.getPlayer1().getLastName() + " " + "VS " + Match.getPlayer2().getFirstName() + " " + Match.getPlayer2().getLastName());
        });
    }

    public void playMatches(Tournament elimination) {
        this.roundMatches.forEach(Match -> {
            Games playGames = new Games() {
                @Override
                public int getGameNumber() {
                    return super.getGameNumber();
                }

                @Override
                public int getPlayer1GamesWon() {
                    return super.getPlayer1GamesWon();
                }

                @Override
                public int getPlayer2GamesWon() {
                    return super.getPlayer2GamesWon();
                }

                @Override
                public Player playGames(Match currentMatch, Tournament elimination) {
                    return super.playGames(currentMatch, elimination);
                }

                @Override
                public String playFirstGame(String commentary) {
                    return super.playFirstGame(commentary);
                }

                @Override
                public String playSecondGame(String commentary) {
                    return super.playSecondGame(commentary);
                }

                @Override
                public String playThirdGame(String commentary) {
                    return super.playThirdGame(commentary);
                }
            };
            Player matchWinner = playGames.playGames(Match, elimination);
            elimination.addroundWaitingPlayers(matchWinner);
        });
    }
}


