package ru.ssau.tk.lizadlgv.practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateArrayTest {
    @Test
    public void testCreateArray() {
        assertEquals(CreateArray.createArray(2), new int[2]);
        assertEquals(CreateArray.createArray(10), new int[10]);
        assertEquals(CreateArray.createArray(1), new int[1]);
    }

    @Test
    public void testGenerateOnesArray() {
        assertEquals(CreateArray.generateOnesArray(2), new int[]{2, 2});
        assertEquals(CreateArray.generateOnesArray(1), new int[]{2});
        assertEquals(CreateArray.generateOnesArray(5), new int[]{2, 1, 1, 1, 2});
    }

    @Test
    public void testGenerateOddNumbers() {
        assertEquals(CreateArray.generateOddNumbers(2), new int[]{1, 3});
        assertEquals(CreateArray.generateOddNumbers(1), new int[]{1});
        assertEquals(CreateArray.generateOddNumbers(5), new int[]{1, 3, 5, 7, 9});
    }
}