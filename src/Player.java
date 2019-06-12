public class Player {
    String firstName;
    String lastName;
    int age;
    String skillLevel;
    boolean entered;

    public Player(String firstName, String lastName, int age, String skillLevel, boolean entered) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skillLevel = skillLevel;
        this.entered = entered;
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

}
