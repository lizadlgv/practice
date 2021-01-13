package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CloneTest {
    @Test
    public void testClone() {
        Clone obj = new Clone();
        Assert.assertThrows(CloneNotSupportedException.class, obj::clone);
        /*Класс, реализующий интерфейс Cloneable,
         * не выбросил исключение, в отличие от класса,
         * не наследующегося от интерфейса*/
    }
}