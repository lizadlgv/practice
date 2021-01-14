package ru.ssau.tk.lizadlgv.practice.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

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

    @Test
    public void testGetGeometricProgression() {
        assertEquals(CreateArray.getGeometricProgression(5, 2, 2), new double[]{2, 4, 8, 16, 32});
        assertEquals(CreateArray.getGeometricProgression(2, 1, 5), new double[]{1, 5});
        assertEquals(CreateArray.getGeometricProgression(3, 400, 0.5), new double[]{400, 200, 100});
    }

    @Test
    public void testGetDividersOfNumbers() {
        assertEquals(CreateArray.getDividersOfNumbers(6), new double[]{1, 2, 3, 6});
        assertEquals(CreateArray.getDividersOfNumbers(7), new double[]{1, 7});
    }

    @Test
    public void testGetMirror() {
        assertEquals(CreateArray.getMirror(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(CreateArray.getMirror(7), new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    @Test
    public void testChangeSign() {
        int[] array = {0, 564, -1159};
        CreateArray.changeSign(array);
        assertEquals(array, new int[]{0, -564, 1159});
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {2, 6, 8, 10, 4};
        assertFalse(CreateArray.findNumberInArray(array, 0));
        assertTrue(CreateArray.findNumberInArray(array, 4));
        assertFalse(CreateArray.findNumberInArray(array, 7));
    }

    @Test
    public void testFindNullInArray() {
        Integer[] array = new Integer[]{2, 5, 6, null};
        Integer[] array2 = new Integer[]{2, 5, 6};
        assertTrue(CreateArray.findNullInArray(array));
        assertFalse(CreateArray.findNullInArray(array2));
    }

    @Test
    public void testGetCountEvenNumbers() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {9, -6, 3, 2};
        int[] array3 = {7, -1, 3, 9};
        assertEquals(CreateArray.getCountEvenNumbers(array1), 4);
        assertEquals(CreateArray.getCountEvenNumbers(array2), 2);
        assertEquals(CreateArray.getCountEvenNumbers(array3), 0);
    }

    @Test
    public void testGetMax() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {5};
        assertEquals(CreateArray.getMax(array1), (Integer) 8);
        assertEquals(CreateArray.getMax(array2), (Integer) 5);
        assertNull(CreateArray.getMax(new int[]{}));
    }
}