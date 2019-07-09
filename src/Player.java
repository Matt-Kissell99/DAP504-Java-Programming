public class Player {
    String firstName;
    String lastName;
    int age;
    String skillLevel;
    boolean entered;
    int won;
    int lost;
    int totalPoints;

    public Player(String firstName, String lastName, int age, String skillLevel, boolean entered, int won, int lost, int totalPoints) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skillLevel = skillLevel;
        this.entered = entered;
        this.won = won;
        this.lost = lost;
        this.totalPoints = totalPoints;
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

    public int getTotalPoints() {
        return totalPoints;
    }
}
