import java.util.ArrayList;
import java.util.Random;

public class Main  {
    public static void main (String[] args) {
        Random rand = new Random();
        int tournamentIdentifier = rand.nextInt(2000);

        System.out.println("Tournament " + tournamentIdentifier + " has begun");
        Tournament newTournament = new Tournament();
        newTournament.generatePlayers();

        System.out.println(newTournament.getPlayerNumbers() + " " + "Players have been entered:");

        newTournament.tournamentPlayers.forEach(player -> {
            System.out.println(player.firstName + " " + player.lastName + " - Age: " + player.age + ", Skill Level: " + player.skillLevel);
        });

        System.out.println("-------------------------------");
        Input userInput = new Input();
        Round firstRound = new Round();
        userInput.startTournament(newTournament, firstRound);
        System.out.println("-------------------------------");




    }
}
