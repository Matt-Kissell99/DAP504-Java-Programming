public class Status {
    enum State {
        RoundOf16,
        Knockout,
        SemiFinal,
        Final
    }

    public static void main(String[] args) {
        State myVar = State.RoundOf16;
        System.out.println(myVar);
    }
}