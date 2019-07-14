public class Player {
    private String firstName;
    private String lastName;
    private int age;
    private String skillLevel;
    private boolean entered;
    private int won;
    private int lost;
    private int gamesPlayed;
    private String ratio;
    private String playerStatus;

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

    public void setWon(int increment) {
        this.won = this.won + increment;
    }

    public void setLost(int increment) {
        this.lost = this.lost + increment;
    }

    public void setGamesPlayed(int increment) {
        this.gamesPlayed = this.gamesPlayed + increment;
    }

    public void setPlayerStatus(String playerStatus) {
        this.playerStatus = playerStatus;
    }
}
