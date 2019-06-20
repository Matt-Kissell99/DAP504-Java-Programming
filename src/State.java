public enum State {
    ROUNDOF16 ("RoundOf16"),
    KNOCKOUT ("Knockout"),
    SEMIFINAL ("SemiFinal"),
    FINAL ("Final");

    public String roundStatus;

    State(String stringStatus) {
        this.roundStatus = stringStatus;
    }

    public String getRoundStatus() {
        return roundStatus;
    }
}
