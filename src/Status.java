public enum Status {
    ACTIVE ("Active"), //Enum for player being active in the tournament
    ELIMINATED ("Eliminated"); //Enum for player being eliminated from tournament

    public String playerStatus; //Variable to set enum

    Status(String status) { //Setting the enum to the requested enum
        this.playerStatus = status;
    }

    public String getPlayerStatus() { //Getter method for roundStatus
        return playerStatus;
    }
}
