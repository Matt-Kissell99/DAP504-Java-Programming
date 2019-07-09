import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public int numberOfPlayers() {
        Scanner numberReader = new Scanner(System.in);  // Reading from System.in
        System.out.println("How many players do you want to enter (max 64):  ");
        int inputPlayers = numberReader.nextInt();

        if (inputPlayers > 64) {
            numberOfPlayers();
        }
        return inputPlayers;
    }

    public void pauseTournament() {

    }

    public Round startTournament(Round firstRound, Tournament currentTournament) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Do you wish to start the first round? (yes/no) :  ");
        String start = reader.nextLine();
        if (start.equals("yes")) {
            firstRound.generateRound(1, currentTournament.getTournamentPlayers());
            System.out.println("-------------------------------");
            System.out.println(firstRound.getRoundName() + " - Round " + (firstRound.getRoundNumber()));
        } else if (start.equals("no")) {
            System.exit(0);
        } else if (!start.equals("yes") || !start.equals("no")) {
            startTournament(firstRound, currentTournament);
        }

        return firstRound;

    }

    public void startMatches(Round round) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to start the matches for round" + " " + round.getRoundNumber() + " - " + round.getRoundName() + " (yes/no) :  ");
        String startMatch = input.nextLine();
        if (startMatch.equals("yes")) {
            return;
        } else {
            this.startMatches(round);
        }
    }
}