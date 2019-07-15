public class Player {
    //Player statistics
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

    //Player constructor to set player data on generation
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

    public String getFirstName() { //Getter method for firstName
        return firstName;
    }

    public String getLastName() { //Getter method for lastName
        return lastName;
    }

    public int getAge() { //Getter method for age
        return age;
    }

    public String getSkillLevel() { //Getter method for skillLevel
        return skillLevel;
    }

    public int getWon() { //Getter method for won
        return won;
    }

    public int getLost() { //Getter method for lost
        return lost;
    }

    public int getGamesPlayed() { //Getter method for gamesPlayed
        return gamesPlayed;
    }

    public String getRatio() { //Getter method for getRatio
        float games = this.getGamesPlayed(); //Get total number of games played
        float totalWins = this.getWon(); //Get total number of wins
        float finalRatio = (totalWins / games) * 100; //Final ratio is the total wins % the total number of games and then x by 100
        String ratio = String.format ("%.2f", finalRatio) + "%"; //Formatting for final ration when called
        return ratio; //Returning the final ratio
    }

    public String getPlayerStatus() { //Getter method for PlayerStatus
        return playerStatus;
    }

    public void setWon(int increment) { //Setter method for won
        this.won = this.won + increment; //won will be set as the original value + the value that is passed in as the argument "increment" (consistently 1 each time)
    }

    public void setLost(int increment) { //Setter method for lost
        this.lost = this.lost + increment; //lost will be set as the original value + the value that is passed in as the argument "increment" (consistently 1 each time)
    }

    public void setGamesPlayed(int increment) { //Setter method for gamesPlayed
        this.gamesPlayed = this.gamesPlayed + increment; //gamesPlayed will be set as the original value + the value that is passed in as the argument "increment" (consistently 1 each time)
    }

    public void setPlayerStatus(String playerStatus) { //Setter method for playerStatus
        this.playerStatus = playerStatus;
    }
}
