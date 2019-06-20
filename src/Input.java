import java.util.Scanner;

public class Input {
    public void startTournament() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Do you wish to start the first round? (yes/no) :  ");
        String start = reader.nextLine();
        reader.close();
        if(start.equals("yes")) {
            Round firstRound = new Round();
            firstRound.generateRound(1);
            System.out.println("-------------------------------");
            System.out.println(firstRound.getRoundName());
        } else if (start.equals("no")) {
            System.exit(0);
        } else if(!start.equals("yes") || !start.equals("no")) {
            startTournament();
        }
        ;
    }
}
