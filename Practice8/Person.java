public class Person {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public Person(String name, String lastName, int birthYear) {
        this.firstName = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
