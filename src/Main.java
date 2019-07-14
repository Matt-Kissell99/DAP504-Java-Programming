import com.sun.java.accessibility.util.GUIInitializedListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main  {
    public static void main (String[] args) {
        Overview GUI = new Overview();
        GUI.initialiseGUI();
        GUI.startListener();

        Random rand = new Random();
        int tournamentIdentifier = rand.nextInt(2000);

        System.out.println("Tournament " + tournamentIdentifier + " has begun");
        Tournament newTournament = new Tournament();
        newTournament.generatePlayers();

        System.out.println(newTournament.getPlayerNumbers() + " " + "Players have been entered:");

        newTournament.tournamentPlayers.forEach(player -> {
            System.out.println(player.getFirstName() + " " + player.getLastName() + " - Age: " + player.getAge() + ", Skill Level: " + player.getSkillLevel() + ", Status: " + player.getPlayerStatus());
        });

        System.out.println("-------------------------------");
        Input userInput = new Input();
        Round firstRound = new Round();
        userInput.startTournament(firstRound, newTournament);
        System.out.println("-------------------------------");
        Match firstMatches = new Match();
        firstMatches.assignOpponents(newTournament.getTournamentPlayers());
        userInput.startMatches(firstRound);

        ArrayList<Player> roundWinners = firstMatches.playMatches(newTournament);
        int roundNumber = 1;
        while(roundWinners.size() >= 2) {
            ++roundNumber;
            Round round = new Round();
            round.generateRound(roundNumber, roundWinners);
            System.out.println("-------------------------------");
            System.out.println(round.getRoundName() + " - Round " + (round.getRoundNumber()));
            System.out.println("-------------------------------");
            Match matches = new Match();
            matches.assignOpponents(roundWinners);
            userInput.startMatches(round);

            ArrayList<Player> newWinners = matches.playMatches(newTournament);
            roundWinners.clear();
            roundWinners = (ArrayList<Player>)newWinners.clone();
            newWinners.clear();
        }
    }
}
