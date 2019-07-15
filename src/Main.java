import com.sun.java.accessibility.util.GUIInitializedListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main  {
    public static void main (String[] args) { //Application begins here
        Tournament newTournament = new Tournament(); //Creating the tournament with new Tournament class object
        Overview GUI = new Overview(newTournament); //New GUI object
        GUI.initialiseGUI(newTournament); //Initialising the GUI to display

        Random rand = new Random();
        int tournamentIdentifier = rand.nextInt(2000);

        System.out.println("Tournament " + tournamentIdentifier + " has begun"); //Random tournament number being generated
        newTournament.generatePlayers(); //Calling method to generate all players

        System.out.println(newTournament.getPlayerNumbers() + " " + "Players have been entered:");

        newTournament.tournamentPlayers.forEach(player -> { //foreach player that has been created, print them out to the terminal
            System.out.println(player.getFirstName() + " " + player.getLastName() + " - Age: " + player.getAge() + ", Skill Level: " + player.getSkillLevel() + ", Status: " + player.getPlayerStatus());
        });

        System.out.println("-------------------------------");
        Input userInput = new Input();
        Round firstRound = new Round(); //Creation of first round object
        userInput.startTournament(firstRound, newTournament); //Asking the user to whether or not they wish to begin the first round (start tournament)
        System.out.println("-------------------------------");
        Match firstMatches = new Match(); //First round matches creation
        firstMatches.assignOpponents(newTournament.getTournamentPlayers()); //Calling a method in Match.java to assign opponents for every player using the players generated
        userInput.startMatches(firstRound); //Asking the user whether or not they wish to start the first

        firstMatches.playMatches(newTournament); //Begin the first round of matches
        newTournament.remainingPlayers.clear(); //Ensure remaining players ArrayList is empty to add winners only
        newTournament.remainingPlayers = (ArrayList<Player>)newTournament.roundWaitingPlayers.clone(); //Adding all the remaining players into the new ArrayList
        newTournament.roundWaitingPlayers.clear(); //Clear the first ArrayList for next round, to ensure that the next rounds can use the remainingPlayers ArrayList for matches
        GUI.checkPlayerStatistics(newTournament); //Update GUI statistics to show eliminated players + remaining players

        int roundNumber = 1; //Round counter to generate round names in Round.java
        while(newTournament.getRemainingPlayers().size() >= 2) { //While loop to represent each round (while the number of remaining players is greater than or equal to 2 - final)
            GUI.checkPlayerStatistics(newTournament); //Update GUI statistics to show eliminated players + remaining players
            ++roundNumber; //Increment the round number by 1
            Round round = new Round(); //Create a new round each time
            round.generateRound(roundNumber, newTournament.getRemainingPlayers()); //Get round name using round counter and the number of remaining players
            System.out.println("-------------------------------");
            System.out.println(round.getRoundName() + " - Round " + (round.getRoundNumber())); // Print the round number and name
            System.out.println("-------------------------------");
            Match matches = new Match(); //Create new matches for each new round
            matches.assignOpponents(newTournament.getRemainingPlayers()); //Assign opponents each round
            userInput.startMatches(round); //Ask the user if they wish to begin the round

            matches.playMatches(newTournament); //Begin the matches for each particular round
            newTournament.remainingPlayers.clear(); //Ensure remaining players ArrayList is empty to add winners only
            newTournament.remainingPlayers = (ArrayList<Player>)newTournament.roundWaitingPlayers.clone(); //Adding all the remaining players into the new ArrayList
            newTournament.roundWaitingPlayers.clear(); //Clear the first ArrayList for next round, to ensure that the next rounds can use the remainingPlayers ArrayList for matches
        }
        System.out.println("------------------------------------------------------------------------------------------------");
        //Print the winner A.K.A The Reigning champion of the tournament
        System.out.println("THE REIGNING CHAMPION OF TOURNAMENT " + tournamentIdentifier + " " + "IS: " + newTournament.getRemainingPlayers().get(0).getFirstName() + " " + newTournament.getRemainingPlayers().get(0).getLastName());
    }
}
