package ru.ssau.tk.lizadlgv.practice.person;

public class PersonInstance {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.setFirstName("Victor");
        firstPerson.setLastName("Pelevin");
        firstPerson.setPassportId(378183);

        secondPerson.setFirstName("Guzel");
        secondPerson.setLastName("Yakhina");
        secondPerson.setPassportId(381873);

        System.out.println(firstPerson.getLastName() + ' ' + firstPerson.getFirstName() + "; passport: " + firstPerson.getPassportId());
        System.out.println(secondPerson.getLastName() + ' ' + secondPerson.getFirstName() + "; passport: " + secondPerson.getPassportId());
    }
}
