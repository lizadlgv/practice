package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CloneWithImplementationTest {
    @Test
    public void testClone() {
        CloneWithImplementation obj = new CloneWithImplementation();
        try {
            obj.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        /*Класс, реализующий интерфейс Cloneable,
         * не выбросил исключение, в отличие от класса,
         * не наследующегося от интерфейса*/
    }
}