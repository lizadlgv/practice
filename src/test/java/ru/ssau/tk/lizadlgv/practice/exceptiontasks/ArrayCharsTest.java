package ru.ssau.tk.lizadlgv.practice.exceptiontasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static ru.ssau.tk.lizadlgv.practice.exceptiontasks.ArrayChars.getArrayChars;

public class ArrayCharsTest {
    @Test
    public void testGetArrayChars() {
        String[] strings = new String[]{"bird", "Mood", "Versions", "Premier"};

        String[] strings2 = new String[]{null, "Mood", "Versions", "Pro"};

        String[] strings3 = new String[]{"Big", "Theory", "Bang", "Pepe"};

        assertEquals(getArrayChars(strings, 2), new String[]{"r", "o", "r", "e"});
        Assert.assertThrows(NullPointerException.class, () ->
                getArrayChars(strings2, 2));
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () ->
                getArrayChars(strings3, 4));
    }
}