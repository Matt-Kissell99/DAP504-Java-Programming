public class Player {
    String firstName;
    String lastName;
    int age;
    String skillLevel;
    boolean entered;
    int won;
    int lost;
    int gamesPlayed;
    String ratio;
    String playerStatus;

    public Player(String firstName, String lastName, int age, String skillLevel, boolean entered, int won, int lost, int gamesPlayed, String ratio, String playerStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skillLevel = skillLevel;
        this.entered = entered;
        this.won = won;
        this.lost = lost;
        this.gamesPlayed = gamesPlayed;
        this.ratio = ratio;
        this.playerStatus = playerStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public String getRatio() {
        float games = this.getGamesPlayed();
        float totalWins = this.getWon();
        float finalRatio = (totalWins / games) * 100;
        String ratio = String.format ("%.2f", finalRatio) + "%";
        return ratio;
    }

    public String getPlayerStatus() {
        return playerStatus;
    }
}
