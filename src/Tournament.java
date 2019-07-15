import java.util.Random;
import java.util.ArrayList;

public class Tournament {

    public int numberOfPlayers;

    ArrayList<Player> tournamentPlayers = new ArrayList<Player>(); //ArrayList for entered tournament players
    ArrayList<Player> roundWaitingPlayers = new ArrayList<Player>(); //ArrayList for players waiting for round to end
    ArrayList<Player> remainingPlayers = new ArrayList<Player>(); //ArrayList for remaining players to create a new round
    ArrayList<Player> eliminatedPlayers = new ArrayList<Player>(); //ArrayList for players that have been eliminated due to losing games

    public void generatePlayers() { //Method to generate all starting players
        ArrayList<String> firstNames = new ArrayList<String>() { //ArrayList for first names
            {add("James"); add("Matt"); add("Rachael"); add("Nick"); add("Chris"); add("Elliot"); add("Nicole"); add("Bob"); }
        };
        ArrayList<String> lastNames = new ArrayList<String>() { //ArrayList for last names
            {add("Marley"); add("Cane"); add("Smith"); add("Myers"); add("Marley"); add("York"); add("Marley"); add("Barber"); add("Cox"); add("Dickson");}
        };
        ArrayList<Integer> ages = new ArrayList<Integer>() { //ArrayList for ages
            {add(20); add(21); add(22); add(23); add(24); add(18); add(19); add(25); add(27); add(28);}
        };
        ArrayList<String> skillLevels = new ArrayList<String>() { //ArrayList for skill levels
            {add("Beginner"); add("Intermediate"); add("Advanced");}
        };

        this.setPlayerNumbers(); //Call the setPlayerNumbers method to obtain user input


        for (int i = 0; i < numberOfPlayers; i++){ //for i starting at 0, while i is less than the number of players, increment by 1 each time
            Random rand = new Random(); //New random object
            String firstName = firstNames.get(rand.nextInt(firstNames.size())); //Randomly select a first name
            String lastName = lastNames.get(rand.nextInt(firstNames.size())); //Randomly select a last name
            int age = ages.get(rand.nextInt(ages.size())); //Randomly select an age
            String skillLevel = skillLevels.get(rand.nextInt(skillLevels.size())); //Randomly select a skill level

            //Create players according to the user input, using the Player constructor in Player.java
            Player player = new Player(firstName, lastName, age, skillLevel, true, 0, 0, 0, "0%", Status.ACTIVE.getPlayerStatus());
            tournamentPlayers.add(player); //Add the player to the tournamentPlayers ArrayList
        }
    }

    public ArrayList<Player> getTournamentPlayers() { //Getter method for the tournament players
        return tournamentPlayers;
    }

    public void setPlayerNumbers() { //Setting Player numbers
        Input PlayerNumbers = new Input(); //New input object
        int tournamentPlayers = PlayerNumbers.numberOfPlayers(); //Number of players is stored as a variable by calling the numberOfPlayers method from Input.java
        this.numberOfPlayers = tournamentPlayers; //Setting the Tournament variable to number of players
    }

    public int getPlayerNumbers() { //Getter method for numberOfPlayers
        return numberOfPlayers;
    }

    public void addEliminatedPlayers(Player eliminatedPlayer) { //Method to add players to the eliminated players ArrayList
        eliminatedPlayers.add(eliminatedPlayer);
    }

    public ArrayList<Player> getEliminatedPlayers() {
        return eliminatedPlayers;
    }

    public void addroundWaitingPlayers(Player progressedPlayer) { //Method to add players to the round winners waiting ArrayList
        roundWaitingPlayers.add(progressedPlayer);
    }

    public ArrayList<Player> getRoundWaitingPlayers() { //Getter method for roundWaitingPlayers
        return roundWaitingPlayers;
    }

    public ArrayList<Player> getRemainingPlayers() { //Getter method for remainingPlayers ArrayList
        return remainingPlayers;
    }
}
