package ru.ssau.tk.lizadlgv.practice.person;

import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static ru.ssau.tk.lizadlgv.practice.person.SerializePerson.serialize;

public class SerializePersonTest {
    @Test
    public void testPassportIDMethods() {
        try {
            serialize(new ByteArrayOutputStream(), new Person("Maria", "hey", 312));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}