public enum State {
    KNOCKOUT ("Knockout"), //Enum used for knockout stage
    LAST32 ("Last 32"), //Enum used for last 32 stage
    LAST16 ("Last 16"), //Enum used for last 16 stage
    QUARTERFINAL("Quarter Final"), //Enum used for the quarter final stage
    SEMIFINAL ("Semi Final"), //Enum used for semi final stage
    FINAL ("Final"); //Enum used for final stage

    public String roundStatus; //Variable to set enum

    State(String stringStatus) { //Setting the enum to the requested enum
        this.roundStatus = stringStatus;
    }

    public String getRoundStatus() { //Getter method for roundStatus
        return roundStatus;
    }
}
