import java.util.ArrayList;

public class Tournament {

    public void playerDetails() {

        Player Player1 = new Player("John", "Smith", 24, "Professional", true);
        Player Player2 = new Player("Mark", "Smith", 18, "Intermediate", true);
        Player Player3 = new Player("Robin", "Cane", 20, "Beginner", true);
        Player Player4 = new Player("Robert", "James", 25, "Intermediate", true);
        Player Player5 = new Player("Louise", "Edmund", 19, "Professional", true);
        Player Player6 = new Player("Bernard", "Arnold", 22, "Beginner", true);
        Player Player7 = new Player("Stuart", "Parker", 23, "Intermediate", true);
        Player Player8 = new Player("Lisa", "Simpson", 18, "Beginner", true);
        Player Player9 = new Player("Harry", "Reading", 22, "Professional", true);
        Player Player10 = new Player("Ginger", "Ninja", 27, "Professional", true);
        Player Player11 = new Player("Maureen", "Shelly", 22, "Intermediate", true);
        Player Player12 = new Player("John", "Wick", 22, "Professional", true);
        Player Player13 = new Player("Stan", "Bull", 25, "Professional", true);
        Player Player14 = new Player("Lee", "Siren", 26, "Beginner", true);
        Player Player15 = new Player("William", "Johnson", 20, "Intermediate", true);
        Player Player16 = new Player("Emily", "Behan", 19, "Professional", true);
        Player Player17 = new Player("Berty", "Williamson", 26, "Beginner", true);
        Player Player18 = new Player("Nicole", "Lambda", 18, "Beginner", true);
        Player Player19 = new Player("Elliot", "Vickery", 24, "Intermediate", true);
        Player Player20 = new Player("Aaron", "Blake", 20, "Beginner", true);
        Player Player21 = new Player("Carl", "Robinson", 22, "Intermediate", true);
        Player Player22 = new Player("Graham", "Shakespeare", 24, "Professional", true);
        Player Player23 = new Player("Luke", "Myers", 25, "Intermediate", true);
        Player Player24 = new Player("Connor", "Kenny", 20, "Beginner", true);
        Player Player25 = new Player("Edward", "Sparrow", 23, "Intermediate", true);
        Player Player26 = new Player("Harry", "Potter", 25, "Professional", true);
        Player Player27 = new Player("Alex", "Southgate", 22, "Professional", true);
        Player Player28 = new Player("Irene", "Craig", 26, "Intermediate", true);
        Player Player29 = new Player("Ben", "Chambers", 22, "Beginner", true);
        Player Player30 = new Player("Chloe", "Bridge", 24, "Intermediate", true);
        Player Player31 = new Player("Rob", "Wilson", 22, "Professional", true);
        Player Player32 = new Player("Carly", "Timpson", 23, "Beginner", true);

        ArrayList<String> playerReference = new ArrayList<String>();
        for (int i = 1; i <= 32; i++) {
            playerReference.add("Player" + i);
        }

        System.out.println(playerReference);


    }
}
