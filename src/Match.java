import java.util.ArrayList;

public class Match extends Games {
    ArrayList<Match> roundMatches = new ArrayList<Match>();
    private Player Player1; //Player 1
    private Player Player2; //Player 2

    public Player getPlayer1() { //Getter method for Player 1
        return Player1;
    }

    public Player getPlayer2() { //Getter method for Player 2
        return Player2;
    }

    public void setPlayer1(Player player1) { //Setter method for Player 1
        Player1 = player1;
    }

    public void setPlayer2(Player player2) { //Setter method for Player 2
        Player2 = player2;
    }

    public void assignOpponents(ArrayList<Player> roundPlayers) { //Method to assign opponents
        int count;
        for(count = 2; count <= roundPlayers.size(); count+= 2) { //for count starting at 2, where count less than or equal to the size of the round players, increment by 2 each time
            Match roundMatch = new Match(); //Create a new match object (2 players to one match object)
            Player firstPlayer = roundPlayers.get(count - 2); //First player can be found at index = count - 2
            roundMatch.setPlayer1(firstPlayer); //Set the first player as the index provided on the previous line

            Player secondPlayer = roundPlayers.get(count - 1); //Second player can be found at index = count - 1
            roundMatch.setPlayer2(secondPlayer); //Set the first player as the index provided on the previous line
            roundMatches.add(roundMatch); //Add the match to the round
        }

        this.roundMatches.forEach(Match -> { //Foreach match print out player 1 and player 2's first and last name
            System.out.println(Match.getPlayer1().getFirstName() + " " + Match.getPlayer1().getLastName() + " " + "VS " + Match.getPlayer2().getFirstName() + " " + Match.getPlayer2().getLastName());
        });
    }

    public void playMatches(Tournament elimination) {
        this.roundMatches.forEach(Match -> { //For each match, play the games required to progress
            Games playGames = new Games() { //New player object (from abstracted class 'Games')
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
            Player matchWinner = playGames.playGames(Match, elimination); //The match winner is the player returned from the 'Games' class
            elimination.addroundWaitingPlayers(matchWinner); //Add the winner to the roundWaitingPlayers (this ArrayList holds all players until every match in the round has been played)
        });
    }
}


