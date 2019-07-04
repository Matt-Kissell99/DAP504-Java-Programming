public enum State {
    KNOCKOUT ("Knockout"),
    LAST32 ("Last 32"),
    LAST16 ("Last 16"),
    QUARTERFINAL("Quarter Final"),
    SEMIFINAL ("Semi Final"),
    FINAL ("Final");

    public String roundStatus;

    State(String stringStatus) {
        this.roundStatus = stringStatus;
    }

    public String getRoundStatus() {
        return roundStatus;
    }
}
