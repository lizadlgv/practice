package ru.ssau.tk.lizadlgv.practice.person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializePerson {
    public static void serialize(OutputStream outputStream, Object o) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.flush();
    }
}
