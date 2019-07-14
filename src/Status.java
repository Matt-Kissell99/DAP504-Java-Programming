public enum Status {
    ACTIVE ("Active"),
    ELIMINATED ("Eliminated");

    public String playerStatus;

    Status(String status) {
        this.playerStatus = status;
    }

    public String getPlayerStatus() {
        return playerStatus;
    }
}
