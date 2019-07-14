import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public int numberOfPlayers() {
        Scanner numberReader = new Scanner(System.in);  // Reading from System.in
        System.out.println("How many players do you want to enter (4, 8, 16, 32, or 64):  ");
        int inputPlayers = numberReader.nextInt();

        if (inputPlayers == 64) {
            return inputPlayers;
        } else if (inputPlayers == 32) {
            return inputPlayers;
        } else if (inputPlayers == 16) {
            return inputPlayers;
        } else if(inputPlayers == 8) {
            return inputPlayers;
        } else if (inputPlayers == 4){
            return inputPlayers;
        } else {
            System.out.println("Please try and enter a valid number (4, 8, 16, 32, or 64)");
            numberOfPlayers();
        }
        return inputPlayers;
    }

    public Round startTournament(Round firstRound, Tournament currentTournament) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Do you wish to start the first round? (y/n) :  ");
        String start = reader.nextLine();
        if (start.equals("y")) {
            firstRound.generateRound(1, currentTournament.getTournamentPlayers());
            System.out.println("-------------------------------");
            System.out.println(firstRound.getRoundName() + " - Round " + (firstRound.getRoundNumber()));
        } else if (start.equals("n")) {
            System.exit(0);
        } else if (!start.equals("y") || !start.equals("n")) {
            startTournament(firstRound, currentTournament);
        }

        return firstRound;

    }

    public void startMatches(Round round) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to start the matches for round" + " " + round.getRoundNumber() + " - " + round.getRoundName() + " (y/n) :  ");
        String startMatch = input.nextLine();
        if (startMatch.equals("y")) {
            return;
        } else {
            this.startMatches(round);
        }
    }
}