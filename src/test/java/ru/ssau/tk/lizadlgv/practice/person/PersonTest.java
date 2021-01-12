package ru.ssau.tk.lizadlgv.practice.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class PersonTest {
    Person firstObj = new Person();
    Person secondObj = new Person("Scott", "Pilgrim");
    Person thirdObj = new Person(null, null, 123456);
    Person fourthObj = new Person(123456);

    @Test
    public void testFirstNameMethods() {
        firstObj.setFirstName("Anton");
        secondObj.setFirstName(null);
        thirdObj.setFirstName("Anna");

        assertEquals(firstObj.getFirstName(), "Anton");
        assertNull(secondObj.getFirstName());
        assertEquals(thirdObj.getFirstName(), "Anna");
        assertNull(fourthObj.getFirstName());
    }

    @Test
    public void testLastNameMethods() {
        thirdObj.setLastName("Akhmatova");
        fourthObj.setLastName(null);

        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Pilgrim");
        assertEquals(thirdObj.getLastName(), "Akhmatova");
        assertNull(fourthObj.getLastName());
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
}