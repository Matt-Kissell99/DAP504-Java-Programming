import java.util.Random;

public class Games {
    public int gameNumber;
    public int player1GamesWon = 0;
    public int player2GamesWon = 0;

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

    public Player playGames(Match currentMatch) {
        String commentary = currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + " " + "VS " + currentMatch.getPlayer2().firstName + " " + currentMatch.getPlayer2().getLastName();
        String game1Commentary = this.playFirstGame(commentary);
        String game2Commentary = this.playSecondGame(game1Commentary);
        if(player1GamesWon == 2 || player2GamesWon == 2) {
            if(player1GamesWon > player2GamesWon) {
                System.out.println(game2Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + ")"));
                return currentMatch.getPlayer1();
            } else {
                System.out.println(game2Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer2().getFirstName() + " " + currentMatch.getPlayer2().getLastName() + ")"));
                return currentMatch.getPlayer2();
            }
        } else {
            String game3Commentary = this.playThirdGame(game2Commentary);
            if(player2GamesWon > player1GamesWon) {
                System.out.println(game3Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer2().getFirstName() + " " + currentMatch.getPlayer2().getLastName() + ")"));
                return currentMatch.getPlayer2();
            } else {
                System.out.println(game3Commentary.concat(" (The winner is:" + " " + currentMatch.getPlayer1().getFirstName() + " " + currentMatch.getPlayer1().getLastName() + ")"));
                return currentMatch.getPlayer1();
            }
        }
    }

    public String playFirstGame(String commentary) {
        this.gameNumber = ++gameNumber;
        Random winner1Decider = new Random();
        int winner1 = winner1Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator;
        if(winner1 == 1) {
            this.player1GamesWon = ++player1GamesWon;
        } else {
            this.player2GamesWon = ++player2GamesWon;
        }
        String game1Commentary = commentary.concat(" = " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon());
        return game1Commentary;
    }

    public String playSecondGame(String commentary) {
        this.gameNumber = ++gameNumber;
        Random winner2Decider = new Random();
        int winner2 = winner2Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator;
        if(winner2 == 1) {
            this.player1GamesWon = ++player1GamesWon;
        } else {
            this.player2GamesWon = ++player2GamesWon;
        }
        String game2Commentary = commentary.concat(", " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon());
        return game2Commentary;
    }

    public String playThirdGame(String commentary) {
        this.gameNumber = ++gameNumber;
        Random winner3Decider = new Random();
        int winner3 = winner3Decider.nextInt((maxGenerator - minGenerator) + 1) + minGenerator;
        if(winner3 == 1) {
            this.player1GamesWon = ++player1GamesWon;
        } else {
            this.player2GamesWon = ++player2GamesWon;
        }
        String game3Commentary = commentary.concat(", " + getPlayer1GamesWon() + "-" + getPlayer2GamesWon());
        return game3Commentary;
    }
}
