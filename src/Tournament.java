import java.util.Random;
import java.util.ArrayList;

public class Tournament {

    public int numberOfPlayers;

    ArrayList<Player> tournamentPlayers = new ArrayList<Player>();
    ArrayList<Player> eliminatedPlayers = new ArrayList<Player>();

    public void generatePlayers() {
        ArrayList<String> firstNames = new ArrayList<String>() {
            {add("James"); add("Matt"); add("Rachael"); add("Nick"); add("Chris"); add("Elliot"); add("Nicole"); add("Bob"); }
        };
        ArrayList<String> lastNames = new ArrayList<String>() {
            {add("Marley"); add("Cane"); add("Smith"); add("Myers"); add("Marley"); add("York"); add("Marley"); add("Barber"); add("Cox"); add("Dickson");}
        };
        ArrayList<Integer> ages = new ArrayList<Integer>() {
            {add(20); add(21); add(22); add(23); add(24); add(18); add(19); add(25); add(27); add(28);}
        };
        ArrayList<String> skillLevels = new ArrayList<String>() {
            {add("Beginner"); add("Intermediate"); add("Advanced");}
        };

        this.setPlayerNumbers();


        for (int i = 0; i < numberOfPlayers; i++){
            Random rand = new Random();
            String firstName = firstNames.get(rand.nextInt(firstNames.size()));
            String lastName = lastNames.get(rand.nextInt(firstNames.size()));
            int age = ages.get(rand.nextInt(ages.size()));
            String skillLevel = skillLevels.get(rand.nextInt(skillLevels.size()));


            Player player = new Player(firstName, lastName, age, skillLevel, true, 0, 0, 0, "0%", Status.ACTIVE.getPlayerStatus());
            tournamentPlayers.add(player);
        }
    }

    public ArrayList<Player> getTournamentPlayers() {
        return tournamentPlayers;
    }

    public void setPlayerNumbers() {
        Input PlayerNumbers = new Input();
        int tournamentPlayers = PlayerNumbers.numberOfPlayers();
        this.numberOfPlayers = tournamentPlayers;
    }

    public int getPlayerNumbers() {
        return numberOfPlayers;
    }

    public void addEliminatedPlayers(Player eliminatedPlayer) {
        eliminatedPlayers.add(eliminatedPlayer);
    }
}
