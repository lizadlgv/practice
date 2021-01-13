package ru.ssau.tk.lizadlgv.practice.person;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public Gender getGender() {
        return gender;
    }

    public String exceptionPerson(Person person) {
        if (person.getFirstName() == null || person.getLastName() == null) {
            throw new NullPointerException();
        } else {
            return person.toString();
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
