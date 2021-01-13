package ru.ssau.tk.lizadlgv.practice.person;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PersonTest {
    Person firstObj = new Person();
    Person secondObj = new Person("Scott", "Pilgrim");
    Person thirdObj = new Person(null, null, 123456);
    Person fourthObj = new Person(123456);
    Person fifthObj = new Person(null, null, 123456, Gender.MALE);
    Person sixthObj = new Person(Gender.FEMALE);

    @Test
    public void testFirstNameMethods() {
        firstObj.setFirstName("Anton");
        secondObj.setFirstName(null);
        thirdObj.setFirstName("Anna");
        sixthObj.setFirstName("Liza");

        assertEquals(firstObj.getFirstName(), "Anton");
        assertNull(secondObj.getFirstName());
        assertEquals(thirdObj.getFirstName(), "Anna");
        assertNull(fourthObj.getFirstName());
        assertNull(fifthObj.getFirstName());
        assertEquals(sixthObj.getFirstName(), "Liza");
    }

    @Test
    public void testLastNameMethods() {
        thirdObj.setLastName("Akhmatova");
        fourthObj.setLastName(null);
        sixthObj.setLastName("Dolgova");

        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Pilgrim");
        assertEquals(thirdObj.getLastName(), "Akhmatova");
        assertNull(fourthObj.getLastName());
        assertEquals(sixthObj.getLastName(), "Dolgova");
    }

    @Test
    public void testPassportIDMethods() {
        secondObj.setPassportId(742782);
        fourthObj.setPassportId(697583);

        assertEquals(firstObj.getPassportId(), 0);
        assertEquals(secondObj.getPassportId(), 742782);
        assertEquals(thirdObj.getPassportId(), 123456);
        assertEquals(fourthObj.getPassportId(), 697583);
    }

    @Test
    public void testSetGetGender() {
        firstObj.setGender(Gender.MALE);
        secondObj.setGender(Gender.FEMALE);
        thirdObj.setGender(Gender.FEMALE);

        assertEquals(firstObj.getGender(), Gender.MALE);
        assertEquals(secondObj.getGender(), Gender.FEMALE);
        assertEquals(sixthObj.getGender(), Gender.FEMALE);
        assertNull(fourthObj.getGender());
        assertEquals(thirdObj.getGender(), Gender.FEMALE);
    }

    @Test
    public void testException() {
        Person person = new Person("Uri", "West");
        Person person2 = new Person(null, null);
        assertEquals(secondObj.exceptionPerson(secondObj), "Scott Pilgrim");
        assertEquals(person.exceptionPerson(person), "Uri West");

        Assert.assertThrows(NullPointerException.class, () -> person2.exceptionPerson(person2));
    }
}