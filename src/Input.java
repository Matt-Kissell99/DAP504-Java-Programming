import java.util.Scanner;

public class Input {
    public int numberOfPlayers() {
        Scanner numberReader = new Scanner(System.in);  // Reading from System.in
        System.out.println("How many players do you want to enter (4, 8, 16, 32, or 64):  ");
        int inputPlayers = numberReader.nextInt();

        //If statement, if the number of players inputted is not equal to 64, 32, 16, 8, or 4 then return a message and loop back
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
        return inputPlayers; //Return the number of players if it equals 64, 32, 16, 8, or 4
    }

    public Round startTournament(Round firstRound, Tournament currentTournament) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Do you wish to start the first round? (y/n) :  ");
        String start = reader.nextLine();
        if (start.equals("y")) { //if the response is equal to "y" generate the round
            firstRound.generateRound(1, currentTournament.getTournamentPlayers()); //Generate first round based on arguments
            System.out.println("-------------------------------");
            System.out.println(firstRound.getRoundName() + " - Round " + (firstRound.getRoundNumber())); //Print the round name and number
        } else if (start.equals("n")) { //else if start equals to "n" then exit program
            System.exit(0);
        } else if (!start.equals("y") || !start.equals("n")) { //elseif start does not equal to "y" or "n" then loop back to the start of the input
            startTournament(firstRound, currentTournament);
        }

        return firstRound; //return the first round generated

    }

    public void startMatches(Round round) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to start the matches for round" + " " + round.getRoundNumber() + " - " + round.getRoundName() + " (y/n) :  "); //Asking users if they want to start the matches
        String startMatch = input.nextLine();
        if (startMatch.equals("y")) { //Simple if statement, if they enter "y" then it returns and begins the matches
            return;
        } else {
            this.startMatches(round);
        }
    }
}