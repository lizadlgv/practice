package ru.ssau.tk.lizadlgv.practice.person;

public class PersonConstructorInstance {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secondObj = new Person("Victor", "Pelevin");
        Person thirdObj = new Person(123456);
        Person fourthObj = new Person("Victor", "Pelevin", 123456);

        System.out.println("The first line: " + firstObj.getFirstName() + ' ' + firstObj.getLastName() + ", passport: " + firstObj.getPassportId());
        System.out.println("The second line: " + secondObj.getFirstName() + ' ' + secondObj.getLastName() + ", passport: " + secondObj.getPassportId());
        System.out.println("The third line: " + thirdObj.getFirstName() + ' ' + thirdObj.getLastName() + ", passport: " + thirdObj.getPassportId());
        System.out.println("The fourth line: " + fourthObj.getFirstName() + ' ' + fourthObj.getLastName() + ", passport: " + fourthObj.getPassportId());
    }
}
