public enum State {
    KNOCKOUT ("Knockout"),
    ROUNDOF16 ("RoundOf16"),
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
