import java.util.Random;

abstract class Games {
    public int gameNumber;
    public int player1GamesWon = 0;
    public int player2GamesWon = 0;

    //Used for random odds of winning
    public int minGenerator = 1;
    public int maxGenerator = 2;

    public int getGameNumber() {
        return gameNumber;
    }

    public int getPlayer1GamesWon() {
        return player1GamesWon;
    }

    public int getPlayer2GamesWon() {
        return player2GamesWon;
    }

    public Player playGames(Match currentMatch, Tournament elimination) {
        //String for commentary to show progress of each game
        String commentary = currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + " " + "VS " + currentMatch.getPlayer2().getFirstName() + " " + currentMatch.getPlayer2().getLastName();
        String game1Commentary = this.playFirstGame(commentary);
        String game2Commentary = this.playSecondGame(game1Commentary);
        if(player1GamesWon == 2 || player2GamesWon == 2) { //if statement to declare if a player has won two games consecutively
            if(player1GamesWon > player2GamesWon) { //if statement to see who has the most points in the match
                System.out.println(game2Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + ")")); //print the winner out

                currentMatch.getPlayer1().setGamesPlayed(1);
                currentMatch.getPlayer2().setGamesPlayed(1); //Set both players to have played one more match

                currentMatch.getPlayer1().setWon(1); //Set player 1 as the winner
                currentMatch.getPlayer2().setLost(1); //Set player 2 as the loser
                currentMatch.getPlayer2().setPlayerStatus(Status.ELIMINATED.getPlayerStatus()); //Set player 2's status to "eliminated"

                elimination.addEliminatedPlayers(currentMatch.getPlayer2()); //Add the player object to the eliminated ArrayList in the tournament
                return currentMatch.getPlayer1(); //Return only the winner
            } else { //Player 2 wins the match
                System.out.println(game2Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer2().getFirstName() + " " + currentMatch.getPlayer2().getLastName() + ")"));

                currentMatch.getPlayer1().setGamesPlayed(1);
                currentMatch.getPlayer2().setGamesPlayed(1); //Set both players to have played one more match

                currentMatch.getPlayer1().setLost(1); //Set player 1 as the loser
                currentMatch.getPlayer1().setPlayerStatus(Status.ELIMINATED.getPlayerStatus()); //Set player 1's status to "eliminated"
                currentMatch.getPlayer2().setWon(1); //Set player 2 as the winner

                elimination.addEliminatedPlayers(currentMatch.getPlayer1()); //Add the player object to the eliminated ArrayList in the tournament
                return currentMatch.getPlayer2(); //Return only the winner
            }
        } else { //else begin the third game to determine a winner of the match
            String game3Commentary = this.playThirdGame(game2Commentary);
            if(player2GamesWon > player1GamesWon) { //Decide who has the most points in the match
                System.out.println(game3Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer2().getFirstName() + " " + currentMatch.getPlayer2().getLastName() + ")"));

                currentMatch.getPlayer1().setGamesPlayed(1);
                currentMatch.getPlayer2().setGamesPlayed(1); //Set both players to have played one more match

                currentMatch.getPlayer1().setLost(1); //Set player 1 as the loser
                currentMatch.getPlayer1().setPlayerStatus(Status.ELIMINATED.getPlayerStatus()); //Set player 1's status to "eliminated"
                currentMatch.getPlayer2().setWon(1); //Set player 2 as the winner

                elimination.addEliminatedPlayers(currentMatch.getPlayer1()); //Add the player object to the eliminated ArrayList in the tournament
                return currentMatch.getPlayer2(); //Return only the winner
            } else {
                System.out.println(game3Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + ")"));

                currentMatch.getPlayer1().setGamesPlayed(1);
                currentMatch.getPlayer2().setGamesPlayed(1); //Set both players to have played one more match

                currentMatch.getPlayer1().setWon(1); //Set player 1 as the winner
                currentMatch.getPlayer2().setLost(1); //Set player 2 as the loser
                currentMatch.getPlayer2().setPlayerStatus(Status.ELIMINATED.getPlayerStatus()); //Set player 2's status to "eliminated"

                elimination.addEliminatedPlayers(currentMatch.getPlayer2()); //Add the player object to the eliminated ArrayList in the tournament
                return currentMatch.getPlayer1(); //Return only the winner
            }
        }
    }

    public String playFirstGame(String commentary) { //Play the first game of the match
        this.gameNumber = ++gameNumber; //Increase the game number by 1
        Random winner1Decider = new Random();
        int winner1 = winner1Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator; //Generate a random number between 1 and 2, to decide who wins the game
        if(winner1 == 1) { //If the random number is 1, player one wins
            this.player1GamesWon = ++player1GamesWon;
        } else { //else player 2 wins
            this.player2GamesWon = ++player2GamesWon;
        }
        String game1Commentary = commentary.concat(" = " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon()); //Add to the commentary the number of wins each player has
        return game1Commentary; //Return the commentary
    }

    public String playSecondGame(String commentary) { //Play the second game of the match
        this.gameNumber = ++gameNumber; //Increase the game number by 1
        Random winner2Decider = new Random();
        int winner2 = winner2Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator; //Generate a random number between 1 and 2, to decide who wins the game
        if(winner2 == 1) { //If the random number is 1, player one wins
            this.player1GamesWon = ++player1GamesWon;
        } else { //else player 2 wins
            this.player2GamesWon = ++player2GamesWon;
        }
        String game2Commentary = commentary.concat(", " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon()); //Add to the commentary the number of wins each player has
        return game2Commentary; //Return the commentary
    }

    public String playThirdGame(String commentary) { //Play the third game of the match (if players are even 1-1)
        this.gameNumber = ++gameNumber; //Increase the game number by 1
        Random winner3Decider = new Random();
        int winner3 = winner3Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator; //Generate a random number between 1 and 2, to decide who wins the game
        if(winner3 == 1) { //If the random number is 1, player one wins
            this.player1GamesWon = ++player1GamesWon;
        } else { //else player 2 wins
            this.player2GamesWon = ++player2GamesWon;
        }
        String game3Commentary = commentary.concat(", " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon()); //Add to the commentary the number of wins each player has
        return game3Commentary; //Return the commentary
    }
}
