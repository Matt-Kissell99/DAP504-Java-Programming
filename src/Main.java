import java.util.Random;

public class Main {
    public static void main (String[] args) {
        Random rand = new Random();
        int tournamentIdentifier = rand.nextInt(2000);

        System.out.println("Tournament " + tournamentIdentifier + " has begun");
        Tournament newTournament = new Tournament();
        newTournament.playerDetails();

        System.out.println("Players Entered:");



    }
}
