package ru.ssau.tk.lizadlgv.practice.person;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testMethod() {
        Person firstObj = new Person();
        Person secondObj = new Person();
        firstObj.setFirstName("Anton");
        secondObj.setFirstName("Ivan");
        firstObj.setLastName("Ivanov");
        secondObj.setLastName("Antonov");
        firstObj.setPassportId(135792);
        secondObj.setPassportId(864209);

        assertEquals(firstObj.getFirstName(), "Anton");
        assertEquals(secondObj.getFirstName(), "Ivan");
        assertEquals(firstObj.getLastName(), "Ivanov");
        assertEquals(secondObj.getLastName(), "Antonov");
        assertEquals(firstObj.getPassportId(), 135792);
        assertEquals(secondObj.getPassportId(), 864209);
    }
}