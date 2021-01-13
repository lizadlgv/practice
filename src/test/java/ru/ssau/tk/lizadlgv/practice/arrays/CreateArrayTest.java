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

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(CreateArray.generateFlippedEvenNumbers(2), new int[]{4, 2});
        assertEquals(CreateArray.generateFlippedEvenNumbers(1), new int[]{2});
        assertEquals(CreateArray.generateFlippedEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateFibonacci() {
        assertEquals(CreateArray.generateFibonacci(2), new int[]{1, 1});
        assertEquals(CreateArray.generateFibonacci(1), new int[]{1});
        assertEquals(CreateArray.generateFibonacci(5), new int[]{1, 1, 2, 3, 5});
    }

    @Test
    public void testGenerateSqrIndex() {
        assertEquals(CreateArray.generatePowIndex(2), new int[]{0, 1});
        assertEquals(CreateArray.generatePowIndex(1), new int[]{0});
        assertEquals(CreateArray.generatePowIndex(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(CreateArray.solveQuadraticEquation(0, 2, -4), new double[]{2});
        assertEquals(CreateArray.solveQuadraticEquation(10, 200, 1654), new double[]{});
        assertEquals(CreateArray.solveQuadraticEquation(1, -2, 1), new double[]{1});
        assertEquals(CreateArray.solveQuadraticEquation(1, 0, -9), new double[]{3, -3});
    }

    @Test
    public void testGetWithoutMultiplesOfThree() {
        assertEquals(CreateArray.getWithoutMultiplesOfThree(1), new int[]{1});
        assertEquals(CreateArray.getWithoutMultiplesOfThree(6), new int[]{1, 2, 4, 5, 7, 8});
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(CreateArray.getArithmeticProgression(4, 5, 0), new double[]{5, 5, 5, 5});
        assertEquals(CreateArray.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(CreateArray.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }
}