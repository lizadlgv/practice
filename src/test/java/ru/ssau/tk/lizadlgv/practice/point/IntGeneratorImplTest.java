package ru.ssau.tk.lizadlgv.practice.point;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntGeneratorImplTest {
    IntGenerator generator = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(generator.nextInt(), 0);
        assertEquals(generator.nextInt(), 1);
        assertEquals(generator.nextInt(), 2);
    }
}